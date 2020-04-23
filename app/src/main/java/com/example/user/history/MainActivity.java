package com.example.user.history;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;
    Context context;
    AlertDialog.Builder ad;





    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }




    private int[] tabIcons = {
            R.drawable.tot,
            R.drawable.vot,
            R.drawable.not
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();







    }





//позиции

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
}

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this,SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_info) {
            // Handle the camera action
            context =  MainActivity.this;
            String title = "Інформація про додаток";
            String message = "  Інтерактивний посібник для мобільних пристроїв. Створений на базі Android Studio в 2019 р. студентами 3 курсу ІПТ КІ СумДУ." +"\n"+
                    "  Використанні джерела для підготовки теоретичного матеріалу:"+"\n"+
                    "vneskoly.com.ua"+"\n"+
                    "zno.osvita.ua";

            ad = new AlertDialog.Builder(context);
            ad.setTitle(title);  // заголовок
            ad.setMessage(message); // сообщение
            ad.show();

        }if (id == R.id.nav_kont) {
            context =  MainActivity.this;
            String title = "Контакти";
            String message = "Розробники: Клішина А.Г. , Швайка Д.В." +
                    "Номера телефонів: +380 68 214 4348/+380 93 952 0309" +
                    "EMAIL: alinakotova102@gmail.com/dimashvayka1512@gmail.com";

            ad = new AlertDialog.Builder(context);
            ad.setTitle(title);  // заголовок
            ad.setMessage(message); // сообщение
            ad.show();

        }
        if (id == R.id.nav_list) {
            context =  MainActivity.this;
            String title = "Ваші пропозиції";
            String message = "Пропозиції надіслати за почтою: alinakotova102@gmail.com/dimashvayka1512@gmail.com";

            ad = new AlertDialog.Builder(context);
            ad.setTitle(title);  // заголовок
            ad.setMessage(message); // сообщение
            ad.show();

        }
        if (id == R.id.nav_send) {

        }
         if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
