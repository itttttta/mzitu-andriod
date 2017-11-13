package com.mzitu.wd.util;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wangda on 2017/11/13.
 */

public class ImageDownloadInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
//        return null;
        Request.Builder request = chain.request().newBuilder();
        request.addHeader("Ref","");
        return chain.proceed(request.build());
    }
}
