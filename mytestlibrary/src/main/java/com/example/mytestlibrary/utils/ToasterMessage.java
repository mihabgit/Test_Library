package com.example.mytestlibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mihab on 13/8/18
 */
public class ToasterMessage {

    public static void showMessage (Context context, String message){

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }
}
