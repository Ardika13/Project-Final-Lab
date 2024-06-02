package com.example.exploreouterspace.api;

import com.example.exploreouterspace.model.Explore;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ApiService {
    @GET("launches")
    Call<List<Explore>> getLaunches();
}

