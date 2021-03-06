package com.example.animeapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AnimeService {

    String BASE_URL = "https://ghibliapi.herokuapp.com/";


    @GET("people")
    Call<List<Anime>> searchPerson(@Query("name") String name);

    // Example Name - Ashitaka
}
