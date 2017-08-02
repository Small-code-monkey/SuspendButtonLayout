package com.suspendbuttonlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.laocaixw.layout.SuspendButtonLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.SuspendButtonLayout)
    com.laocaixw.layout.SuspendButtonLayout SuspendButtonLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //点击监听事件
        SuspendButtonLayout.setOnSuspendListener(new SuspendButtonLayout.OnSuspendListener() {
            // 监听按钮状态：展开、关闭、移动等
            @Override
            public void onButtonStatusChanged(int status) {

            }

            // 监听子按钮的点击事件
            @Override
            public void onChildButtonClick(int index) {
                switch (index) {
                    case 1:
                        Toast.makeText(MainActivity.this, "点击了第一个", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "点击了第二个", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
