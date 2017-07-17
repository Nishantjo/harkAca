 package com.example.joshi.test;

import android.database.Observable;
import android.support.v4.text.util.LinkifyCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.joshi.test.APIClient.BASE_URL;

 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);


         APIInterface apiService= APIClient.getClient().create(APIInterface.class);
         Call<List<String>> subjects=apiService.subjects();
         subjects.enqueue(new Callback<List<String>>() {

             @Override
             public void onResponse(Call<List<String>> call, Response<List<String>> response) {

                 List<String> subjects = response.body();
                 Log.d("Nishant", "Total number of Subjects fetched : " + subjects.size());

             }

             @Override
             public void onFailure(Call<List<String>> call, Throwable t) {
                 Log.e("Nishant", t.toString());
             }
         });

 }



 }



