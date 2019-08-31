package com.example.myapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;

import com.example.myapp.Model.Preset;
import com.example.myapp.R;
import com.squareup.picasso.Picasso;

import android.widget.ImageView;

import java.util.List;
import android.widget.TextView;

public class PresetAdapter extends ArrayAdapter<Preset> {
   List<Preset> presetList;
   Context context;
   private LayoutInflater mInflater;

    public PresetAdapter(Context context, List<Preset> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        presetList = objects;
    }

    @Override
    public Preset getItem(int position) {
        return presetList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Preset item = getItem(position);

        vh.textViewName.setText(item.getName());
        vh.textViewAuthor.setText(item.getAuthor());
        Picasso.with(context).load(item.getIcon()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(vh.imageView);

        return vh.rootView;
    }

    private static class ViewHolder {
        public final RelativeLayout rootView;
        public final ImageView imageView;
        public final TextView textViewName;
        public final TextView textViewAuthor;

        private ViewHolder(RelativeLayout rootView, ImageView imageView, TextView textViewName, TextView textViewAuthor) {
            this.rootView = rootView;
            this.imageView = imageView;
            this.textViewName = textViewName;
            this.textViewAuthor = textViewAuthor;
        }

        public static ViewHolder create(RelativeLayout rootView) {
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
            TextView textViewName = (TextView) rootView.findViewById(R.id.textViewName);
            TextView textViewAuthor = (TextView) rootView.findViewById(R.id.textViewAuthor);
            return new ViewHolder(rootView, imageView, textViewName, textViewAuthor);
        }

    }
}
