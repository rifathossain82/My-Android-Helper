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
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;

public class SpinKit_ProgressBar_demo extends AppCompatActivity {

    WebView webView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_kit_progress_bar_demo);

        //initial widget
        //webView=findViewById(R.id.webview_id_spinKit);
        progressBar=findViewById(R.id.spin_kit_id);
        Sprite doubleBounce = new DoubleBounce();
        progressBar.setIndeterminateDrawable(doubleBounce);

        //set progress bar
        //ProgressDialog progressDialog=new ProgressDialog(this);
        //progressDialog.setMessage("Loading wait......");

        //set web Page
        /*webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.startech.com.bd/");


        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(newProgress);
                setTitle("Loading......");
                //progressDialog.show();

                if(newProgress==100){
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                   // progressDialog.dismiss();
                }

                super.onProgressChanged(view, newProgress);
            }
        });*/
    }
}