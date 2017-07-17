package com.example.joshi.test;

import android.database.Observable;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * Created by joshi on 7/14/2017.
 */

public interface APIInterface {
    @GET("subjects")
    Call<List<String>> subjects ();
}
