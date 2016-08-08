package org.melchiz.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callBoth();
    }

    private void callBoth() {
        upload();
        reload();
    }

    private void upload(){
        int x = 9;
    }
    
    private void reload(){
        int x = 8;
    }
}
