package com.example.exploreouterspace.fragment;

import static android.text.TextUtils.replace;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.exploreouterspace.R;
import com.example.exploreouterspace.SpaceActivity;
import com.example.exploreouterspace.adapter.ExploreAdapter;
import com.example.exploreouterspace.api.ApiConfig;
import com.example.exploreouterspace.api.ApiService;
import com.example.exploreouterspace.model.Explore;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private List<Explore> explore = new ArrayList<>();
    private ExploreAdapter exploreAdapter;
    ImageView imageView;
    TextView tv_nama, tv_detail;
    RecyclerView rv_home;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        imageView = view.findViewById(R.id.IV_Postingan);
        tv_nama = view.findViewById(R.id.TV_name);
        tv_detail = view.findViewById(R.id.TV_detail);
        rv_home = view.findViewById(R.id.rv_post);
        rv_home.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        ApiService apiService = ApiConfig.getClient().create(ApiService.class);

        explore = new ArrayList<>();
        exploreAdapter = new ExploreAdapter(explore, getContext());
        rv_home.setAdapter(exploreAdapter);

        ExploreAdapter.setOnItemClickListener(explore -> {
            if (explore != null) {
                Intent intent = new Intent(getContext(), SpaceActivity.class);
                intent.putExtra("id", explore.getId());
                intent.putExtra("name", explore.getName());
                intent.putExtra("detail", explore.getDetails());
                intent.putExtra("tanggalpenerbangan", explore.getDate_utc());
                intent.putExtra("nomorpenerbangan", explore.getFlight_number());
                startActivity(intent);
            }
        });
        return view;
    }

//    @Override
//    public View OnCreateView(@NonNull LayoutInflater inflater, @Nullable View container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        ImageView menu_home = view.findViewById(R.id.menu_home);
//        ImageView menu_search = view.findViewById(R.id.menu_Search);
//        ImageView menu_profile = view.findViewById(R.id.menu_profile);
//
//        menu_home.setOnClickListener(v -> {
//            HomeFragment homeFragment = new homeFragment();
//            FragmentManager fragmentManager = getParentFragmentManager();
//            fragmentManager.beginTransaction()
//                    .replace(R.id.fragment_container, homeFragment)
//                    .addToBackStack(null)
//                    .commit();
//
//        });
//
//        menu_profile.setOnClickListener(v -> {
//            ProfilFragment profilFragment = new ProfilFragment();
//            FragmentManager fragmentManager = getParentFragmentManager();
//            fragmentManager
//                    .beginTransaction()
//                    .replace(R.id.fragment_container, ProfilFragment)
//                    .addToBackStack(null)
//                    .commit();
//        });
//
//        menu_search.setOnClickListener(v -> {
//
//        });
//        return view;
//    }
}