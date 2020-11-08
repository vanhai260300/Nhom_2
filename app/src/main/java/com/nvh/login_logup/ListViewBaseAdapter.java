package com.nvh.login_logup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewBaseAdapter extends BaseAdapter {
    public ArrayList<ListViewBean> arrayingListener;
    Context mContext;

    public ListViewBaseAdapter(ArrayList<ListViewBean> mListenerList, Context context) {
        mContext = context;
        this.arrayingListener = new ArrayList<ListViewBean>();
        this.arrayingListener =mListenerList;
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mLangName,moTa,tiMe;
    }

    @Override
    public int getCount() {
        return arrayingListener.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayingListener.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.row_list, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.img);
            holder.mLangName=(TextView)view.findViewById(R.id.name);
            holder.moTa=(TextView)view.findViewById(R.id.mota);
            holder.tiMe=(TextView)view.findViewById(R.id.time);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int image = arrayingListener.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(arrayingListener.get(position).getLangName());
            holder.moTa.setText(arrayingListener.get(position).getMoTa());
            holder.tiMe.setText(arrayingListener.get(position).getTiMe());
        }catch (Exception ex){


        }

        return view;
    }

}