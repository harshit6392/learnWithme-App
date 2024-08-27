package com.dotapksmartapps.learnwithme;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import Adapter.ChatAdapter;
import Adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    MyAdapter myAdapter;
    ChatAdapter chatAdapter;
    TabLayout tabLayout;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        viewPager2=findViewById(R.id.myViewPager2);
        tabLayout = findViewById(R.id.tabLayout);


        //adapter for fragment
        myAdapter=new MyAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(myAdapter);

        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    // Set tab titles based on position
                    switch (position) {
                        case 0:
                            tab.setText("Chat");
                            break;
                        case 1:
                            tab.setText("Status");
                            break;
                        case 2:
                            tab.setText("Calls");
                            break;
                    }
                }).attach();
    }

    public void notificationGetClicked(View view) {
        Intent intent=new Intent(getApplicationContext(), Notify.class);
        startActivity(intent);
    }
}