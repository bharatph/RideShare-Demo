package com.cz.rideshare.adapters;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cz.rideshare.R;
import com.cz.rideshare.model.RideSnapshot;

import java.util.ArrayList;


/**
 * Created by Home on 21-12-2017.
 */

public class RideSnapshotListAdpater extends RecyclerView.Adapter<RideSnapshotListAdpater.RideSnapshotViewHolder> {

    private ArrayList<RideSnapshot> rideSnapshots = null;

    public RideSnapshotListAdpater(ArrayList<RideSnapshot> rideSnapshots){
        this.rideSnapshots = rideSnapshots;
    }

    @Override
    public RideSnapshotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ride_snapshot, parent, false);
        return new RideSnapshotViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RideSnapshotViewHolder holder, int position) {
        RideSnapshot rideSnapshot = rideSnapshots.get(position);
        holder.date.setText(rideSnapshot.getTimeStarted().toString());
    }

    @Override
    public int getItemCount() {
        return rideSnapshots.size();
    }

    class RideSnapshotViewHolder extends RecyclerView.ViewHolder {
        ImageView rideImage = null;
        TextView rideType = null;
        TextView date = null;
        TextView price = null;
        public RideSnapshotViewHolder(View itemView) {
            super(itemView);
            rideImage = itemView.findViewById(R.id.snapshotRideImage);
            rideType = itemView.findViewById(R.id.snapshotRideType);
            date = itemView.findViewById(R.id.snapshotDate);
            price = itemView.findViewById(R.id.snapshotPrice);
            //date = itemView.findViewById(R.id.snapshotDate);
        }
    }
}