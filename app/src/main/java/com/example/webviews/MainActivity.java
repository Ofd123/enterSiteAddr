package com.example.webviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    String address;
    WebView wb;
    EditText ed;
    Button btn;
    @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn = (Button)findViewById(R.id.button2);
            ed = (EditText)findViewById(R.id.editTextTextPostalAddress2);
            wb = (WebView)findViewById(R.id.webView);
            wb.getSettings().setJavaScriptEnabled(true);
            wb.setWebViewClient(new MyWebViewClient());

        }

    public void searchSite(View view)
    {
        address = ed.getText().toString();
        wb.loadUrl(address);
        btn.setVisibility(View.INVISIBLE);
    }

    private class MyWebViewClient extends WebViewClient
        {
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);
                return true;
            }

        }
    }
