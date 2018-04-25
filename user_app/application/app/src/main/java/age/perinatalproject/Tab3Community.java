package age.perinatalproject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Tab3Community  extends Fragment {

    private EditText messageET;
    private ListView messagesContainer;
    private ImageButton sendBtn;
    private ChatAdapterGroup adapter;
    private ArrayList<ChatMessageGroup> chatHistory;
    private View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        rootView = inflater.inflate(R.layout.tab3_community, container, false);

        initControls();


        return rootView;
    }



    private void initControls( ) {

        messagesContainer = (ListView) rootView.findViewById(R.id.messagesContainer);
        messageET = (EditText) rootView.findViewById(R.id.messageEdit);
        sendBtn = (ImageButton) rootView.findViewById(R.id.chatSendButton);

        RelativeLayout container = (RelativeLayout) rootView.findViewById(R.id.container);
        loadDummyHistory();

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messageText = messageET.getText().toString();
                if (TextUtils.isEmpty(messageText)) {
                    return;
                }

                ChatMessageGroup chatMessage = new ChatMessageGroup();
                chatMessage.setId(122);//dummy
                chatMessage.setMessage(messageText);
                chatMessage.setDate(DateFormat.getDateTimeInstance().format(new Date()));
                chatMessage.setMe(true);

                messageET.setText("");

                displayMessage(chatMessage);
            }
        });
    }

    public void displayMessage(ChatMessageGroup message) {
        adapter.add(message);
        adapter.notifyDataSetChanged();
        scroll();
    }

    private void scroll() {
        messagesContainer.setSelection(messagesContainer.getCount() - 1);
    }

    private void loadDummyHistory(){

        chatHistory = new ArrayList<ChatMessageGroup>();

        ChatMessageGroup msg = new ChatMessageGroup();
        msg.setId(1);
        msg.setMe(false);
        msg.setMessage("Hi Moms!!! Who is going to tomorrow's talk???");
        msg.setDate(DateFormat.getDateTimeInstance().format(new Date()));
        msg.setImageUser(R.drawable.icon6);
        chatHistory.add(msg);
        ChatMessageGroup msg1 = new ChatMessageGroup();
        msg1.setId(2);
        msg1.setMe(false);
        msg1.setMessage("Hi, I am in.");
        msg1.setDate(DateFormat.getDateTimeInstance().format(new Date()));
        msg1.setImageUser(R.drawable.icon4);
        chatHistory.add(msg1);
        ChatMessageGroup msg2 = new ChatMessageGroup();
        msg2.setId(3);
        msg2.setMe(false);
        msg2.setMessage("Me too! Anyone need a lift?");
        msg2.setDate(DateFormat.getDateTimeInstance().format(new Date()));
        msg2.setImageUser(R.drawable.icon3);
        chatHistory.add(msg2);

        adapter = new ChatAdapterGroup(getActivity(), new ArrayList<ChatMessageGroup>());
        messagesContainer.setAdapter(adapter);

        for(int i=0; i<chatHistory.size(); i++) {
            ChatMessageGroup message = chatHistory.get(i);
            displayMessage(message);
        }
    }

/*
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
*/
}