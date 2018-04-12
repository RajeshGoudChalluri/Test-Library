package com.redmorph.sharma.sampletestlibrary;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class CustomToast {

    public static void getToastMessage(Context context, String message) {
        try {
            if (!TextUtils.isEmpty(message))
                Toast.makeText(context, message.trim(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
