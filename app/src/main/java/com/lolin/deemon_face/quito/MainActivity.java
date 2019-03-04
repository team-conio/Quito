package com.lolin.deemon_face.quito;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private IdentifyFragment identifyFragment;
    private TipsFragment tipsFragment;
    private MapsFragment mapsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        mMainFrame = findViewById (R.id.main_frame);
        mMainNav = findViewById (R.id.main_nav);

        identifyFragment = new IdentifyFragment ();
        tipsFragment = new TipsFragment ();
        mapsFragment = new MapsFragment ();

        setFragment (identifyFragment);


        mMainNav.setOnNavigationItemSelectedListener (new BottomNavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId ()) {
                    case R.id.nav_identify:
                        setFragment (identifyFragment);
                        break;

                    case R.id.nav_Tips:
                        setFragment (tipsFragment);
                        break;
                    case R.id.nav_Maps:
                        setFragment (mapsFragment);
                        break;

                }

                return false;
            }

//            private void setFragment(Fragment fragment) {
//
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager ().beginTransaction ();
//                fragmentTransaction.replace (R.id.main_frame,fragment);
//                fragmentTransaction.commit ();


        });
    }

private void setFragment(Fragment fragment) {

    FragmentTransaction fragmentTransaction = getSupportFragmentManager ().beginTransaction ();
    fragmentTransaction.replace (R.id.main_frame, fragment);
    fragmentTransaction.commit ();

}
}
