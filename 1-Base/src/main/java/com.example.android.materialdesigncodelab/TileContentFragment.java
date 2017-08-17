package com.example.android.materialdesigncodelab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TileContentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TileContentFragment extends Fragment {

    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    public TileContentFragment() {
        // Required empty public constructor
    }

    public static TileContentFragment newInstance() {
        return new TileContentFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tile, container, false);
        ButterKnife.bind(this, view);

        ContentAdapter adapter = new ContentAdapter(R.layout.li_tile);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
        int padding = getResources().getDimensionPixelOffset(R.dimen.tile_padding);
        mRecyclerView.setPadding(padding, padding, padding, padding);
        return view;
    }

}
