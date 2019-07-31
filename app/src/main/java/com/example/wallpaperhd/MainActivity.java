package com.example.wallpaperhd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.wallpaperhd.UI.AboutActivity;
import com.example.wallpaperhd.UI.CateActivity;
import com.example.wallpaperhd.UI.FavoriteActivity;
import com.example.wallpaperhd.UI.GifActivity;
import com.example.wallpaperhd.UI.LatestActivity;
import com.example.wallpaperhd.UI.MoreActivity;
import com.example.wallpaperhd.UI.PrivacyActivity;
import com.example.wallpaperhd.UI.RateActivity;
import com.example.wallpaperhd.UI.SettingActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    LatestActivity latestActivity;
    CateActivity cateActivity;
    GifActivity gifActivity;
    FavoriteActivity favoriteActivity;
    RateActivity rateActivity;
    MoreActivity moreActivity;
    HomeActivity homeActivity;
    AboutActivity aboutActivity;
    SettingActivity settingActivity;
    PrivacyActivity privacyActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        anhxa();


        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigationopen, R.string.navigationclose);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        setTitle("Home");
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        manhinhhome();
    }

    private void manhinhhome() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (homeActivity.isAdded()) {

            ft.show(homeActivity);
        } else {
            ft.add(R.id.container1, homeActivity);
        }
        ft.commit();

    }

    private void anhxa() {
        homeActivity = new HomeActivity();
        latestActivity = new LatestActivity();
        cateActivity = new CateActivity();
        gifActivity = new GifActivity();
        favoriteActivity = new FavoriteActivity();
        rateActivity = new RateActivity();
        moreActivity = new MoreActivity();
        aboutActivity = new AboutActivity();
        settingActivity = new SettingActivity();
        privacyActivity = new PrivacyActivity();
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
        //  getMenuInflater().inflate(R.menu.comeback, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_latest) {
            setTitle("Latest");
            manhinhlatest();
        } else if (id == R.id.nav_category) {
            setTitle("Category");
            manhinhcate();
        } else if (id == R.id.nav_gif) {
            setTitle("GIFs");
            manhinhgif();
        } else if (id == R.id.nav_favorite) {
            setTitle("My Favorite");
            manhinhfavorite();
        } else if (id == R.id.nav_rate) {
            setTitle("Rate App");
            manhinhrate();
        } else if (id == R.id.nav_more) {
            setTitle("More App");
            manhinhmore();
        } else if (id == R.id.nav_about) {
            setTitle("About Us");
            manhinhabout();
        } else if (id == R.id.nav_settings) {
            setTitle("Setting");
            manhinhsetting();
        } else if (id == R.id.nav_privacy) {
            setTitle("Privacy Police");
            manhinhpri();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void manhinhpri() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (privacyActivity.isAdded()) {
            ft.show(privacyActivity);
        } else {
            ft.add(R.id.container1, privacyActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        ft.commit();
    }

    private void manhinhsetting() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (settingActivity.isAdded()) {
            ft.show(settingActivity);
        } else {
            ft.add(R.id.container1, settingActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhabout() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (aboutActivity.isAdded()) {
            ft.show(aboutActivity);
        } else {
            ft.add(R.id.container1, aboutActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhmore() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (moreActivity.isAdded()) {
            ft.show(moreActivity);
        } else {
            ft.add(R.id.container1, moreActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhrate() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (rateActivity.isAdded()) {
            ft.show(rateActivity);
        } else {
            ft.add(R.id.container1, rateActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhfavorite() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (favoriteActivity.isAdded()) {
            ft.show(favoriteActivity);
        } else {
            ft.add(R.id.container1, favoriteActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhgif() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (gifActivity.isAdded()) {
            ft.show(gifActivity);
        } else {
            ft.add(R.id.container1, gifActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhcate() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (cateActivity.isAdded()) {
            ft.show(cateActivity);
        } else {
            ft.add(R.id.container1, cateActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (latestActivity.isAdded()) {
            ft.hide(latestActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }

    private void manhinhlatest() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        if (latestActivity.isAdded()) {
           // setTitle("Home");
            ft.show(latestActivity);
        } else {
            ft.add(R.id.container1, latestActivity);
        }
        if (homeActivity.isAdded()) {
            ft.hide(homeActivity);
        }
        if (cateActivity.isAdded()) {
            ft.hide(cateActivity);
        }
        if (gifActivity.isAdded()) {
            ft.hide(gifActivity);
        }
        if (favoriteActivity.isAdded()) {
            ft.hide(favoriteActivity);
        }
        if (rateActivity.isAdded()) {
            ft.hide(rateActivity);
        }
        if (moreActivity.isAdded()) {
            ft.hide(moreActivity);
        }
        if (aboutActivity.isAdded()) {
            ft.hide(aboutActivity);
        }
        if (settingActivity.isAdded()) {
            ft.hide(settingActivity);
        }
        if (privacyActivity.isAdded()) {
            ft.hide(privacyActivity);
        }
        ft.commit();
    }
}