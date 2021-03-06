package hreday.chakr.onlineusa.Shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hreday.chakr.onlineusa.R;


import android.view.View;


//package hreday.sagar.usa.Shopping;

import android.graphics.Bitmap;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;




public class Carters extends AppCompatActivity {
    private WebView webView;


    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carters);


        getSupportActionBar().hide();


        progressBar=findViewById(R.id.progress);


        //   mInterstitialAd = new InterstitialAd(this);
        //     mInterstitialAd.setAdUnitId("ca-app-pub-4248114886151875/2595314880");

        //    mInterstitialAd.loadAd(new AdRequest.Builder().build());


        webView = findViewById(R.id.webviewId);
        webView.loadUrl("https://www.carters.com/");


        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient()
        {

            @Override public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(ProgressBar.VISIBLE);
                webView.setVisibility(View.INVISIBLE);
            }

            @Override public void onPageCommitVisible(WebView view, String url) {
                super.onPageCommitVisible(view, url);
                progressBar.setVisibility(ProgressBar.GONE);
                webView.setVisibility(View.VISIBLE);

            }
        });
        webSettings.setJavaScriptEnabled(true);
    }

/*
    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        } else {
            super.onBackPressed();
        }
    }

 */
}

