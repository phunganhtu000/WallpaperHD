package com.example.wallpaperhd.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wallpaperhd.R;
import com.example.wallpaperhd.UI.LatestActivity;
import com.example.wallpaperhd.modelMedia.Media;

import java.util.List;

public class MediaAdater extends BaseAdapter {
        private Context mContext;
        private List<Media> mediaList;

    public MediaAdater(Context mContext, List<Media> mediaList) {
        this.mContext = mContext;
        this.mediaList = mediaList;
    }

    public MediaAdater(List<Media> mediaList, FragmentActivity activity, LatestActivity latestActivity, LatestActivity latestActivity1) {
    }

    @Override
        public int getCount() {
        return mediaList.size();
    }
        public void changeDataset(List<Media> items) {
        this.mediaList = items;
        notifyDataSetChanged();
    }
        @Override
        public Object getItem(int i) {
        return null;
    }

        @Override
        public long getItemId(int i) {
        return 0;
    }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.item_post, null);
            TextView textView = (TextView) grid.findViewById(R.id.tvNamePost);
            ImageView imageView = (ImageView) grid.findViewById(R.id.imgPost);
            textView.setText(mediaList.get(i).getTitle().getRendered());
            try {
                Glide
                        .with(mContext)
                        .load(mediaList.get(i).getMediaDetails().getSizes().getMedium().getSourceUrl())
                        .centerCrop()
                        .into(imageView);
            } catch (Exception e) {

            }

        } else {
            grid = (View) view;
        }
        return grid;
    }
    }
