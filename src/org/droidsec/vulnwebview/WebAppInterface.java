package org.droidsec.vulnwebview;

import android.content.Context;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;
    //private String mWTF = "lolz";

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}
