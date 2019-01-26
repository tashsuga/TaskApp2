package com.onespan.takeshisugai.taskapp2

//package jp.techacademy.taro.kirameki.taskapp

import android.app.Application
import io.realm.Realm

class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}