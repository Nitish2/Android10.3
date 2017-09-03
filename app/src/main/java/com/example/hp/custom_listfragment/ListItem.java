package com.example.hp.custom_listfragment;

import android.graphics.drawable.Drawable;

/**
 * Created by Hp on 03-09-2017.
 */

public class ListItem {
     // Declaring variables
     Drawable image;
     String title;
     String description;

    public ListItem(Drawable image, String title, String description) { //Creating method
        // Giving reference to the object
        this.image = image;
        this.title = title;
        this.description = description;
    }
}
