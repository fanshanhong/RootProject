package com.fan.componentization.rootproject;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fan.componentization.common.AppLifeCycleManager;
import com.fan.componentization.module_cart.CartModuleAppLike;
import com.fan.componentization.module_home.HomeAppLike;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: shanhongfan
 * @Date: 2021/4/22 17:59
 * @Modify:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        // 打印日志
        ARouter.openLog();
        // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.openDebug();
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);

//        HomeAppLike homeAppLike = new HomeAppLike();
//        CartModuleAppLike cartModuleAppLike = new CartModuleAppLike();
//        homeAppLike.onCreate(this);
//        cartModuleAppLike.onCreate(this);


//        Class clazz = null;
//        try {
//            clazz = Class.forName("com.xx.xx.xx.MMMMMMManager");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Method method = null;
//        try {
//            method = clazz.getMethod("init", Context.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        try {
//            method.invoke(null, this);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        AppLifeCycleManager.init(this);

    }
}
