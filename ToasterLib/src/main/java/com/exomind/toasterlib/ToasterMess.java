package com.exomind.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class ToasterMess {

    public static void s(Context c, String s) {
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }
}
