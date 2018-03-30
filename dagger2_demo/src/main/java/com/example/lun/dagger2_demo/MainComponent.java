package com.example.lun.dagger2_demo;

import dagger.Component;

/**
 * Created by huosdk on 2018/3/30.
 */

@Component(modules = ActivityModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
