package com.example.bohdan.retr;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/** Created by bohdan on 15.03.2018. */

public interface TankApi {
    @GET("wot/encyclopedia/tankinfo/?application_id=demo&tank_id=1%2C17")
    Call<TankModel> tanksInfo();
}
