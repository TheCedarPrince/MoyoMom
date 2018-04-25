package age.perinatalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        Button buttonNext = (Button) findViewById(R.id.butNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }

        });
    }


    private void goToNextActivity() {
        Intent intent = new Intent(this, Question9.class);
        startActivity(intent);
    }
}
