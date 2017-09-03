package com.example.hp.custom_listfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class Row_Fragment extends ArrayAdapter{
    Context context;

    public  Row_Fragment (Context context,List<ListItem> items) {
        super(context, R.layout.row_fragment, items);

        this.context = context;
    }

    private static class View_Holder {
        ImageView image;
        TextView title;
        TextView description;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        // Creating class object
        View_Holder viewHolder;

        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_fragment, parent, false);

            // Initializing the values of class by ID
            viewHolder = new View_Holder();
            viewHolder.image = (ImageView) convertView.findViewById(R.id.imgage);
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            convertView.setTag(viewHolder);
        } else {
            //convertView will put the view holder in its pool to recycle it and passes it again to you.
            viewHolder = (View_Holder) convertView.getTag();
        }
        //Updating the view holder
        ListItem listItem= (ListItem) getItem(position);
        assert listItem != null; // Set listItem not eaquals to null
        viewHolder.image.setImageDrawable(listItem.image);
        viewHolder.title.setText(listItem.title);
        viewHolder.description.setText(listItem.description);

        return convertView; //Returns the view
    }
}
