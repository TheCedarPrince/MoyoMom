package age.perinatalproject;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Tab1Contacts  extends  Fragment {



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1_contacts, container, false);


      //  final String[] arrayContacts= new String[30];
        //Integer[] imgid= new Integer[30];
        //for (int i=1;i<=30;i++){
          //  arrayContacts[i-1] = "Contact " + i;
            //imgid[i-1]=R.drawable.logo_female;

        String array[] = {"Jane Doe", "Marjorie Joyner", "Mary Kenner", "Ruane Jeter", "Alice Parker",
                "Mary McLeod Bethune", "Ellen Johnson-Sirleaf", "Coretta Scott King", "Condoleezza Rice",
                "Josephine Baker", "Oprah Winfrey", "Harriet Tubman", "Ella Baker", "Hattie McDaniel", "Maya Angelou",
                "Ida B. Wells", "Shirley Chisholm", "Sojourner Truth", "Diahann Carroll", "Dame Eugenia Charles"};
        Integer array1[] = {R.drawable.icon1, R.drawable.icon2,R.drawable.icon3,R.drawable.icon4,R.drawable.icon5,
                R.drawable.icon6,R.drawable.icon7,R.drawable.icon8,R.drawable.icon9,R.drawable.icon10,
                R.drawable.icon11,R.drawable.icon12,R.drawable.icon13,R.drawable.icon14,R.drawable.icon15,
                R.drawable.icon1,R.drawable.icon8,R.drawable.icon6,R.drawable.icon3,R.drawable.icon2};
        String[] desArray={"2 months","3 months after delivery","7 months","6 months","4 months",
                "2 months after delivery","10 months after delivery","2 months","1 months","2 months",
                "1 year after delivery","1 month","5 months after delivery","7 months","2 months",
                "8 months","7 months","1 month after delivery","2 months","4 months"};
        final String[] arrayContacts= new String[array.length];
        Integer[] imgid= new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            arrayContacts[i] = array[i];
            imgid[i]= array1[i];

        }


        CustomListAdapter adapter=new CustomListAdapter(getActivity(), arrayContacts, imgid,desArray);

        //LayoutInflater iii = (LayoutInflater)rootView.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>( rootView.getContext(),
                android.R.layout.simple_list_item_1, arrayContacts);*/

        ListView listContactResource = (ListView) rootView.findViewById(R.id.lista);

        listContactResource.setAdapter(adapter);

        listContactResource.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= arrayContacts[+position];
                /*Toast.makeText(rootView.getContext(), Slecteditem, Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getActivity(), ChatActivity.class);

                //Create the bundle
                Bundle bundle = new Bundle();

                //Add your data to bundle
                bundle.putString("contact", Slecteditem);

                //Add the bundle to the intent
                intent.putExtras(bundle);

                startActivity(intent);


            }
        });

        return rootView;
    }
}
