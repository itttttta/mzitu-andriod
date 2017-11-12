package com.mezitu.wd.mzitu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testBtn = (Button)findViewById(R.id.testBtn);
        //添加按钮单机响应函数
         testBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.v("testBtn","click");


                 //创建okHttpClient对象
                 OkHttpClient mOkHttpClient = new OkHttpClient();
//创建一个Request
                 final Request request = new Request.Builder()
                         .url("https://github.com/hongyangAndroid")
                         .build();
//new call
                 Call call = mOkHttpClient.newCall(request);
//请求加入调度
                 call.enqueue(new Callback()
                 {
                     @Override
                     public void onFailure(Call call, IOException e) {

                     }

                     @Override
                     public void onResponse(Call call, Response response) throws IOException {
                         String htmlStr =  response.body().string();
                         Log.v("htmlStr",htmlStr);

                     }


                 });
             }
         });
    }
}
