package com.example.hp.custom_listfragment;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

//ListFragment has a default layout that consists of a single list view.
public class ListFragment extends android.app.ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Creating an ArrayList for the items in List.
        List<ListItem> list_items = new ArrayList<ListItem>(); //
        //Adding items into the ArrayList
        list_items.add(new ListItem(ContextCompat.getDrawable(getActivity().getApplicationContext()
                ,R.drawable.youtube), "YouTube","YouTube Description"));

        list_items.add(new ListItem(ContextCompat.getDrawable(getActivity().getApplicationContext()
                ,R.drawable.blogger),"Blogger", "Blogger Description" ));

        // setListAdapter() method provides the cursor for the list view.
        setListAdapter(new Row_Fragment(getActivity(), list_items));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // getListView() method will get the activity's list view widget.
        getListView().setDivider(null);

    }



}
