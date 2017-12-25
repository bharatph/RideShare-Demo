package com.cz.rideshare.adapters;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cz.rideshare.R;


/**
 * Created by Home on 21-12-2017.
 */

public class RideSnapshotListAdpater extends RecyclerView.Adapter<RideSnapshotListAdpater.RideSnapshotViewHolder> {

    @Override
    public RideSnapshotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ride_snapshot, parent, false);
        return new RideSnapshotViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RideSnapshotViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RideSnapshotViewHolder extends RecyclerView.ViewHolder {

        public RideSnapshotViewHolder(View itemView) {
            super(itemView);
        }
    }
}