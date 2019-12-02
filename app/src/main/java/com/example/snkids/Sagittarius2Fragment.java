package com.example.snkids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Sagittarius2Fragment extends Fragment {

    private static MediaPlayer mp;

    // newInstance constructor for creating fragment with arguments
    public static Sagittarius2Fragment newInstance(int page, String title) {
        Sagittarius2Fragment fragment = new Sagittarius2Fragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sagittarius2, container, false);
        return view;
    }

}
