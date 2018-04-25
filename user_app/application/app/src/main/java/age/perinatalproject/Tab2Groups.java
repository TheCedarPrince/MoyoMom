package age.perinatalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParserException;

import java.util.ArrayList;

import static android.net.wifi.WifiConfiguration.Status.strings;


public class Tab2Groups  extends Fragment {


    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;

    private GridLayout mainGridLayout;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.tab2_group, container, false);

        try {
            mainGridLayout = rootView.findViewById(R.id.gridLayout);

        } catch (Exception e){
            e.printStackTrace();
        }
        //setSingleEvent(mainGridLayout);
        cardView1 =  (CardView) rootView.findViewById(R.id.card1);
        cardView2 =  (CardView) rootView.findViewById(R.id.card2);
        cardView3 =  (CardView) rootView.findViewById(R.id.card3);
        cardView4 =  (CardView) rootView.findViewById(R.id.card4);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), ChatActivity.class);

                //Create the bundle
                Bundle bundle = new Bundle();

                TextView text1 = (TextView) rootView.findViewById(R.id.textGroup1);
                String nameGroup =  text1.getText().toString();
                //Add your data to bundle
                bundle.putString("contact",nameGroup);

                bundle.putBoolean("previousChat", true);
                ArrayList<String> historyChat = new ArrayList<String>();
                historyChat.add("Next week, there is going to be a workshop for delivery prep.");
                historyChat.add("The event will be at Morehouse at 5 pm.");
                historyChat.add("Anyone interested in carpooling there?");
                intent.putExtra("historyChat", historyChat);

                //Add the bundle to the intent
                intent.putExtras(bundle);

                startActivity(intent);
            }

        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), ChatActivity.class);

                //Create the bundle
                Bundle bundle = new Bundle();

                TextView text = (TextView) rootView.findViewById(R.id.textGroup2);
                String nameGroup =  text.getText().toString();
                //Add your data to bundle
                bundle.putString("contact",nameGroup);

                bundle.putBoolean("previousChat", true);
                ArrayList<String> historyChat = new ArrayList<String>();
                historyChat.add("hey all, just found out my mom got cancer");
                historyChat.add("pretty devastated right now... ");
                intent.putExtra("historyChat", historyChat);

                //Add the bundle to the intent
                intent.putExtras(bundle);

                startActivity(intent);
            }

        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), ChatActivity.class);

                //Create the bundle
                Bundle bundle = new Bundle();

                TextView text = (TextView) rootView.findViewById(R.id.textGroup2);
                String nameGroup =  text.getText().toString();
                //Add your data to bundle
                bundle.putString("contact",nameGroup);

                bundle.putBoolean("previousChat", true);
                ArrayList<String> historyChat = new ArrayList<String>();
                historyChat.add("Remember eat breakfast every day");
                intent.putExtra("historyChat", historyChat);

                //Add the bundle to the intent
                intent.putExtras(bundle);

                startActivity(intent);
            }

        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), ChatActivity.class);

                //Create the bundle
                Bundle bundle = new Bundle();

                TextView text = (TextView) rootView.findViewById(R.id.textGroup2);
                String nameGroup =  text.getText().toString();
                //Add your data to bundle
                bundle.putString("contact",nameGroup);

                bundle.putBoolean("previousChat", true);
                ArrayList<String> historyChat = new ArrayList<String>();
                historyChat.add("Alright moms, it's time for a ladies night out!");
                historyChat.add("Let's meet up this Saturday, grab some food, and get to know each other.");
                historyChat.add("Let me know who can come by THIS FRIDAY!!!");
                intent.putExtra("historyChat", historyChat);

                //Add the bundle to the intent
                intent.putExtras(bundle);

                startActivity(intent);
            }

        });

        return rootView;
    }

    private void setSingleEvent(GridLayout mainGridLayout) {
        //Loop all the childreen of the grid
        for (int i=0;i<mainGridLayout.getChildCount();i++){
            CardView cardView =  (CardView) mainGridLayout.getChildAt(i);
            final int pos = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    Toast.makeText(getContext(), "Pressed at " + pos, Toast.LENGTH_SHORT).show();
                }

            });


        }
    }



}