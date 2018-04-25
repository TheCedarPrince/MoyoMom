package age.perinatalproject;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] description;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid, String[] description) {
        super(context, R.layout.my_list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.description = description;
    }


    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.my_list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        Resources resources = rowView.getResources();
        //System.out.println(""+resources.getDrawable(R.drawable.logo_female).toString());
        //imageView.setImageDrawable(resources.getDrawable(R.drawable.logo_female));
        try {

          imageView.setImageResource(imgid[position]);

        String[] words = description[position].split(" ");
        if (words.length ==2){
            extratxt.setText( description[position] + " of pregnancy");
        }else{
            extratxt.setText( description[position]);
        }

        } catch(Exception e){
            e.printStackTrace();
        }

        return rowView;

    };
}