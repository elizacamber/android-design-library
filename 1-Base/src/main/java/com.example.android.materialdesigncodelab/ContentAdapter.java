package com.example.android.materialdesigncodelab;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {

    private static final int LENGTH = 18;
    private int mItemLayout;

    public ContentAdapter(int itemLayout) {
        mItemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()), parent, mItemLayout);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // do nothing
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(LayoutInflater inflater, ViewGroup parent, int layout) {
            super(inflater.inflate(layout, parent, false));
        }
    }
}
