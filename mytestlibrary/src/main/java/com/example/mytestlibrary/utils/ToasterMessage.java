package com.example.mytestlibrary.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by mihab on 13/8/18
 */
public class ToasterMessage {

    public static void showMessage (Context context, String message){
        
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();
    }
}
