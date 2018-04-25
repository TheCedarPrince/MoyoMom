package age.perinatalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Education_Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education__questionnaire);
        Button continueBut = (Button) findViewById(R.id.hq_continue);
        Button skipBut = (Button) findViewById(R.id.hq_skip);

        continueBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }

        });

        skipBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skipToProfile();
            }

        });
    }
    private void skipToProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    private void goToNextActivity() {
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }
}
