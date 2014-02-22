package org.droidsec.vulnwebview;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
        		WebView myWebView = (WebView) findViewById(R.id.webView1);
        		myWebView.reload();
            }
        });
		
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		
		// not a good idea!
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		
		// terrible idea!
		myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
		
		// woot.
		myWebView.loadUrl("http://www.droidsec.org/tests/addjsif/");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
