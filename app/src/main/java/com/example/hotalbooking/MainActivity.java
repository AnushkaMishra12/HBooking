package com.example.hotalbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    CoordinatorLayout coordinatorLayout;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.DrawerLayout);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close
        );
        drawerLayout.setDrawerListener(drawerToggle);
        coordinatorLayout = findViewById(R.id.fragment_container);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemBackground(null);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }
    HomeFragment homeFragment = new HomeFragment();
    WhereFragment whereFragment = new WhereFragment();
    HostFragment hostFragment = new HostFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.nav_home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
            return true;
        }
        if (menuItem.getItemId() == R.id.nav_Trips) {
            Intent i = new Intent(getApplicationContext(), MyTripsActivity.class);
            startActivity(i);
            return true;
        }
        if (menuItem.getItemId() == R.id.nav_where) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, whereFragment).commit();
            return true;
        }
        if (menuItem.getItemId() == R.id.nav_money) {
            Intent i = new Intent(getApplicationContext(), tripMoneyActivity.class);
            startActivity(i);
            return true;
        }
        if (menuItem.getItemId() == R.id.nav_host) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, hostFragment).commit();
            return true;
        }
        return false;
    }

    public void openDrawer(View view) {
        drawerLayout.openDrawer(androidx.core.view.GravityCompat.START);
    }
}
