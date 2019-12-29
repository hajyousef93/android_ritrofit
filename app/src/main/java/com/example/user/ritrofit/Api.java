package com.example.user.ritrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by USER on 29/12/2018.
 */

public interface Api {
    String BASE_URL="https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>>GetHeros();
}
