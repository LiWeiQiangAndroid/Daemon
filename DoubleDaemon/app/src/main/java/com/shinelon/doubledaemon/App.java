package com.shinelon.doubledaemon;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * Created by LiWeiQiang on 2016/8/21.
 * Email：lwqldsyzx@126.com
 * Description ：
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("调试");
    }
}
