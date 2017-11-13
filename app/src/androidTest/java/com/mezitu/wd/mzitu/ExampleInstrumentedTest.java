package com.mezitu.wd.mzitu;

import android.content.Context;
import android.net.Uri;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.mzitu.wd.util.ImageDownloadInterceptor;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import org.junit.Test;
import org.junit.runner.RunWith;

import okhttp3.OkHttpClient;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.mezitu.wd.mzitu", appContext.getPackageName());

        MainActivity mainActivity = new MainActivity();

        final OkHttpClient okHttpClient = new OkHttpClient();

        okHttpClient.interceptors().add(new ImageDownloadInterceptor());

//        Picasso picasso = new Picasso.Builder(appContext).downloader(new OkHttpDownloader(okHttpClient)).build();
//        picasso.load("http://i.meizitu.net/2014/04/20140423jp011.jpg").placeholder(R.mipmap.ic_launcher).into(appContext);


    }
}
