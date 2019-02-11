package com.vvvinfotech.saleem.bridematches;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomNavigation extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.Mailbox:
                    mTextMessage.setText(R.string.title_Mailbox);
                    return true;
                case R.id.Notification:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.Search:
                    mTextMessage.setText(R.string.title_search);
                    return true;
                case R.id.Menu:
                    mTextMessage.setText(R.string.Menu);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
