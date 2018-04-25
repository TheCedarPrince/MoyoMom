package age.perinatalproject;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_screen);

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

        } catch(Exception e) {
            e.printStackTrace();
        }
        Button buttonLogin = (Button) findViewById(R.id.butLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivitySingUp();
            }

        });
    }


    private void goToSecondActivitySingUp() {
        Intent intent = new Intent(this, User_Creation.class);
        startActivity(intent);
    }

 //   private void goToSecondActivityLogIn() {

//        Intent intent = new Intent(this, SecondActivity.class);

  //      startActivity(intent);

   // }
}
