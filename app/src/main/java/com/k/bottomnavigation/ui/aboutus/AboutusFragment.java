package com.k.bottomnavigation.ui.aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.k.bottomnavigation.R;

public class AboutusFragment extends Fragment {
    private WebView webView;


 public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState){
     View v=inflater.inflate(R.layout.fragment_aboutus,container,false);
     webView=(WebView) v.findViewById(R.id.webview);
     webView.setWebViewClient(new WebViewClient());
     webView.loadUrl("https://softwarica.edu.np/");
     return v;


 }

}