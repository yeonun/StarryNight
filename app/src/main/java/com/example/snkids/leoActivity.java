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

public class leoActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;

    private static MediaPlayer mp2;
    private static MediaPlayer mp3;
    private static MediaPlayer mp4;
    private static MediaPlayer mp5;
    private static MediaPlayer mp6;
    private static MediaPlayer mp7;
    private static MediaPlayer mp8;
    private static MediaPlayer mp9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_leo);

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);


        mp2 = MediaPlayer.create(this, R.raw.leo2);
        mp3 = MediaPlayer.create(this, R.raw.leo3);
        mp4 = MediaPlayer.create(this, R.raw.leo4);
        mp5 = MediaPlayer.create(this, R.raw.leo5);
        mp6 = MediaPlayer.create(this, R.raw.leo6);
        mp7 = MediaPlayer.create(this, R.raw.leo7);
        mp8 = MediaPlayer.create(this, R.raw.leo8);
        mp9 = MediaPlayer.create(this, R.raw.leo9);




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
                    case 6:
                        mp6.stop();
                        mp7.start();
                        break;
                    case 7:
                        mp7.stop();
                        mp8.start();
                        break;

                    case 8:
                        mp8.stop();
                        mp9.start();
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 9;

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
                    return Leo1Fragment.newInstance(0, "Page # 1");
                case 1:
                    return Leo2Fragment.newInstance(1, "Page # 2");
                case 2:
                    return Leo3Fragment.newInstance(2, "Page # 3");
                case 3:
                    return Leo4Fragment.newInstance(3, "Page # 4");
                case 4:
                    return Leo5Fragment.newInstance(4, "Page # 5");
                case 5:
                    return Leo6Fragment.newInstance(5, "Page # 6");
                case 6:
                    return Leo7Fragment.newInstance(6, "Page # 7");
                case 7:
                    return Leo8Fragment.newInstance(7, "Page # 8");
                case 8:
                    return Leo8Fragment.newInstance(8, "Page # 9");

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
        mp7.stop();
        mp8.stop();
        mp9.stop();

        super.onBackPressed();
    }
    public void onUserLeaveHint(){
        mp2.pause();
        mp3.pause();
        mp4.pause();
        mp5.pause();
        mp6.pause();
        mp7.pause();
        mp8.pause();
        mp9.pause();


        super.onUserLeaveHint();
    }

    public void onDestroy(){
        mp2.stop();
        mp3.stop();
        mp4.stop();
        mp5.stop();
        mp6.stop();
        mp7.stop();
        mp8.stop();
        mp9.stop();

        super.onDestroy();
    }
}