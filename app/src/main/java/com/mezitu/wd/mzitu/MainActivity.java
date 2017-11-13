package com.mezitu.wd.mzitu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mzitu.wd.util.ImageDownloadInterceptor;
//import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import com.mzitu.wd.util.OkHttpDownLoader;

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

//        Button testBtn = (Button)findViewById(R.id.testBtn);
//        //添加按钮单机响应函数
//         testBtn.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 Log.v("testBtn","click");
//
//
//                 //创建okHttpClient对象
//                 OkHttpClient mOkHttpClient = new OkHttpClient();
////创建一个Request
//                 final Request request = new Request.Builder()
//                         .url("http://i.meizitu.net/2014/04/20140423jp011.jpg")
//                         .addHeader("Referer","http://www.mzitu.com/25056")
//                         .build();
////new call
//                 Call call = mOkHttpClient.newCall(request);
////请求加入调度
//                 call.enqueue(new Callback()
//                 {
//                     @Override
//                     public void onFailure(Call call, IOException e) {
//                        Log.v("error",e.toString());
//                     }
//
//                     @Override
//                     public void onResponse(Call call, Response response) throws IOException {
//                         String htmlStr =  response.body().string();
//                         Log.v("htmlStr",htmlStr);
//
//                     }
//
//
//                 });
//             }
//         });


        ImageView testImageView = (ImageView)findViewById(R.id.testImageView);
        final OkHttpClient okHttpClient = new OkHttpClient();

        Picasso picasso = new Picasso.Builder(this).downloader(new OkHttpDownLoader(okHttpClient,"http://www.mzitu.com/25056")).build();
        picasso.load("http://i.meizitu.net/2014/04/20140423jp011.jpg").placeholder(R.mipmap.ic_launcher).into(testImageView);


    }
}
