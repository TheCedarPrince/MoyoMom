package age.perinatalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Login_Midwife extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            ActionBar actionBar =  getSupportActionBar();
            actionBar.setDisplayOptions(actionBar.getDisplayOptions()
                    | ActionBar.DISPLAY_SHOW_CUSTOM);
            ImageView imageView = new ImageView(actionBar.getThemedContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.mipmap.ic_launcher_round);
            ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(
                    ActionBar.LayoutParams.WRAP_CONTENT,
                    ActionBar.LayoutParams.WRAP_CONTENT, Gravity.RIGHT
                    | Gravity.CENTER_VERTICAL);
            layoutParams.rightMargin = 20;
            imageView.setLayoutParams(layoutParams);
            actionBar.setCustomView(imageView);

        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_midwife);


            Button buttonNext = (Button) findViewById(R.id.butNext);

            buttonNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToNextActivity();
                }

            });

        }catch(Exception e){
            e.printStackTrace();
        }
    }




    private void goToNextActivity() {

            Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
