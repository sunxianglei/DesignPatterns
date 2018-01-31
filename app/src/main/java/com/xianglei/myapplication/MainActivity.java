package com.xianglei.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //检测某个权限是否已经被授予，
        // 方法返回值为PackageManager.PERMISSION_DENIED或者PackageManager.PERMISSION_GRANTED。当返回DENIED就需要进行申请授权了。
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            //申请授权
            //该方法是异步的，第一个参数是Context；第二个参数是需要申请的权限的字符串数组；第三个参数为requestCode，主要用于回调的时候检测
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},0);
        }
    }


    @Override
    public int checkSelfPermission(String permission) {
        return super.checkSelfPermission(permission);
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
