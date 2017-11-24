package com.padcmm.sfc.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmm.sfc.R;
import com.padcmm.sfc.viewholders.RelatedNewsViewHolder;

/**
 * Created by kcns on 11/24/2017.
 */

public class RelatedNewsAdapter extends RecyclerView.Adapter<RelatedNewsViewHolder> {
    private LayoutInflater mLayoutInfalter;

    public RelatedNewsAdapter(Context context) {
        mLayoutInfalter = LayoutInflater.from(context);
    }

    @Override
    public RelatedNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = mLayoutInfalter.inflate(R.layout.view_item_related_news, parent, false);
        return new RelatedNewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RelatedNewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}





