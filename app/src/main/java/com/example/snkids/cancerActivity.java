package com.example.snkids;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import me.relex.circleindicator.CircleIndicator;

public class cancerActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;

    private static MediaPlayer mp2;
    private static MediaPlayer mp3;
    private static MediaPlayer mp4;
    private static MediaPlayer mp5;
    private static MediaPlayer mp6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_cancer);

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);


        mp2 = MediaPlayer.create(this, R.raw.cancer2);
        mp3 = MediaPlayer.create(this, R.raw.cancer3);
        mp4 = MediaPlayer.create(this, R.raw.cancer4);
        mp5 = MediaPlayer.create(this, R.raw.cancer5);
        mp6 = MediaPlayer.create(this, R.raw.cancer6);



        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager);
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        mp2.start();
                        break;
                    case 2:
                        mp2.stop();
                        mp3.start();
                        break;
                    case 3:
                        mp3.stop();
                        mp4.start();
                        break;

                    case 4:
                        mp4.stop();
                        mp5.start();
                        break;

                    case 5:
                        mp5.stop();
                        mp6.start();
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 6;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Cancer1Fragment.newInstance(0, "Page # 1");
                case 1:
                    return Cancer2Fragment.newInstance(1, "Page # 2");
                case 2:
                    return Cancer3Fragment.newInstance(2, "Page # 3");
                case 3:
                    return Cancer4Fragment.newInstance(3, "Page # 4");
                case 4:
                    return Cancer5Fragment.newInstance(4, "Page # 5");
                case 5:
                    return Cancer6Fragment.newInstance(5, "Page # 6");

                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }


    public void onBackPressed(){
        mp2.stop();
        mp3.stop();
        mp4.stop();
        mp5.stop();
        mp6.stop();

        super.onBackPressed();
    }
    public void onUserLeaveHint(){
        mp2.pause();
        mp3.pause();
        mp4.pause();
        mp5.pause();
        mp6.pause();

        super.onUserLeaveHint();
    }

    public void onDestroy(){
        mp2.stop();
        mp3.stop();
        mp4.stop();
        mp5.stop();
        mp6.stop();

        super.onDestroy();
    }
}