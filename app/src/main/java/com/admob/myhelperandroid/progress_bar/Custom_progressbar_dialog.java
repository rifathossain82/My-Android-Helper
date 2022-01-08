package com.admob.myhelperandroid.progress_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.admob.myhelperandroid.R;

public class Custom_progressbar_dialog extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBar;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_progressbar_dialog);
        //initial widget
        webView=findViewById(R.id.webview_id_custom_dialog);
        progressBar=findViewById(R.id.progress_id_custom);

        //set progress bar

        progressDialog=new ProgressDialog(this);
        //progressDialog.setMessage("Loading wait......");
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dailog);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);



        //set web Page
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.startech.com.bd/");


        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
               // progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(newProgress);
                setTitle("Loading......");
                progressDialog.show();

                if(newProgress==100){
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                    progressDialog.dismiss();
                }

                super.onProgressChanged(view, newProgress);
            }
        });
    }
}