package age.perinatalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class User_Creation extends AppCompatActivity {

    private Spinner ethnicity;
    private String etType;
    private int mSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_creation);

        String[] arrayString = {"African American","Hispanic/Latino", "White American","Asian","Other"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayString);

        ethnicity = (Spinner) findViewById(R.id.spinnerEthnicity);
        ethnicity.setAdapter(adapter);



        /*
        ethnicity.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                //mSelectedItem= position;
                //adapter.notifyDataSetChanged();.notifyDataSetChanged();

                //ethnicity.setSelected(true);
                //adapter.notifyDataSetChanged();
                etType = (String) ethnicity.getItemAtPosition(position);

                //System.out.println("hola");
                System.out.println(etType.toString());
                //String value= selItem.getTheValue(); //getter method
            }

        });*/




        Button buttonNext = (Button) findViewById(R.id.butNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }

        });
    }




    private void goToNextActivity() {

        EditText mName   = (EditText)findViewById(R.id.eName);
        EditText mLastname   = (EditText)findViewById(R.id.eLastname);
        EditText mAge   = (EditText)findViewById(R.id.eAge);
        EditText mGestationalAge   = (EditText)findViewById(R.id.ePass);


        boolean validation = true;

        if (mName.getText().toString().trim().equals("") ){

            validation = false;
        }

        if (mLastname.getText().toString().trim().equals("") ){

            validation = false;
        }

        int age=0,gAge=0;

        try{
            age = Integer.parseInt(mAge.getText().toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
            validation = false;
        }

        try{
            gAge = Integer.parseInt(mGestationalAge.getText().toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
            validation = false;
        }

        //if (validation) {
            Intent intent = new Intent(this, Question1.class);
            startActivity(intent);
        //}

    }
}
