package com.lzh.nonview.router.demo;

import android.net.Uri;
import android.os.Bundle;

import com.lzh.compiler.parceler.annotation.Arg;
import com.lzh.nonview.router.Router;
import com.lzh.nonview.router.demo.base.BaseActivity;
import com.lzh.nonview.router.extras.RouteBundleExtras;

import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @Arg
    Uri uri;
    @Arg
    RouteBundleExtras extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @OnClick(R.id.login)
    void onLoginClick () {
        DataManager.INSTANCE.setLogin(true);
        Router.resume(uri,extras).open(this);
        finish();
    }
}
