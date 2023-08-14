package com.galool.toasthelper;

import android.content.Context;
import android.widget.Toast;

/**
 * @author said-boos
 * @date 14/08/23
 */
public class ToastHelper {
    public static void show(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
