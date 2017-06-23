package com.jaycee88.rxjavaretrofitdemo;

import android.os.Bundle;

import com.jaycee88.rxjavaretrofitdemo.http.BaseEntity;
import com.jaycee88.rxjavaretrofitdemo.http.BaseObserver;
import com.jaycee88.rxjavaretrofitdemo.http.RetrofitFactory;
import com.jaycee88.rxjavaretrofitdemo.model.User;

import io.reactivex.Observable;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void login(String userId, String password) {
        Observable<BaseEntity<User>> observable = RetrofitFactory.getInstance().login(userId, password);
        observable.compose(compose(this.<BaseEntity<User>>bindToLifecycle())).subscribe(new BaseObserver<User>(this) {
            @Override
            protected void onHandleSuccess(User user) {
                // 保存用户信息等操作
            }
        });
    }
}
