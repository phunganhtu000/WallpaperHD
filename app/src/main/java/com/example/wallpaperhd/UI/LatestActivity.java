package com.example.wallpaperhd.UI;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ProgressBar;

import com.example.wallpaperhd.PolyRetrofit;
import com.example.wallpaperhd.R;
import com.example.wallpaperhd.adapter.MediaAdater;
import com.example.wallpaperhd.modelMedia.Media;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LatestActivity extends Fragment {
    List<Media> mediaList;
    MediaAdater adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.latest_activity, container, false);
//        GridView grid = view.findViewById(R.id.grid);
//        ProgressBar progressBar = view.findViewById(R.id.process);
//        grid.setAdapter(adapter);
//        mediaList = new ArrayList<>();
//        adapter = new MediaAdater(mediaList, getActivity(), this, this);
        return view;
    }
}

