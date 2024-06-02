package com.example.exploreouterspace.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exploreouterspace.R;
import com.example.exploreouterspace.model.Explore;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    private List<Explore> exploreList;
    private Context context;
    private OnItemClickListener clickListener;

    public ExploreAdapter(List<Explore> exploreList, Context context) {
        this.exploreList = exploreList;
        this.context = context;
    }

    public void setExploreList(List<Explore> exploreList) {
        this.exploreList = exploreList;
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {
        void onItemClick(Explore explore);
    }

    public static void setOnItemClickListener(OnItemClickListener listener) {
//        this.clickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_explore, parent, false);
        return new ViewHolder(view, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Explore explore = exploreList.get(position);
        holder.tvTitle.setText(explore.getName());
        Picasso.get().load(explore.getLinks().getPatch().getSmall()).into(holder.imageView);
        holder.itemView.setTag(explore);
    }

    @Override
    public int getItemCount() {
        return exploreList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView, final OnItemClickListener clickListener) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.TV_name);
            imageView = itemView.findViewById(R.id.IV_Postingan);

            itemView.setOnClickListener(v -> {
                if (clickListener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        clickListener.onItemClick((Explore) v.getTag());
                    }
                }
            });
        }
    }
}
