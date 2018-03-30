package com.example.lun.dagger2_demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by huosdk on 2018/3/30.
 */

@Module
public class ActivityModule {

    @Provides
    public UserModule provideUserModule(){
        UserModule module = new UserModule();
        module.name = "小红";
        return module;
    }

}
