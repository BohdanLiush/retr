package com.example.bohdan.retr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private final String URL = "https://api.worldoftanks.ru/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TankApi tankApi = retrofit.create(TankApi.class);

        final Call<TankModel> tanks = tankApi.tanksInfo();

        tanks.enqueue(new Callback<TankModel>() {

            @Override
            public void onResponse(Call<TankModel> call, Response<TankModel> response) {
                TankModel tankModels = response.body();
                System.out.println(tankModels.getData().get1().getGunName());
            }

            @Override
            public void onFailure(Call<TankModel> call, Throwable t) {
                System.out.println("Hello");
            }
        });
    }
}
