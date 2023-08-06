package com.yasination.bottomnavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottomNavigation);


        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home){
                    Toast.makeText(getApplicationContext(), "This is Home", Toast.LENGTH_SHORT).show();

                }else if (item.getItemId() == R.id.notification){
                    bottomNavigation.getOrCreateBadge(R.id.notification).clearNumber();
                    Toast.makeText(getApplicationContext(), "This is notification", Toast.LENGTH_SHORT).show();

                }else if (item.getItemId() == R.id.profile){
                    bottomNavigation.getOrCreateBadge(R.id.notification).setNumber(13);
                    Toast.makeText(getApplicationContext(), "This is profile", Toast.LENGTH_SHORT).show();
                }

                return true;  //-----true for changing color with click
            }
        });

        bottomNavigation.getOrCreateBadge(R.id.notification).setNumber(100);






    }
}