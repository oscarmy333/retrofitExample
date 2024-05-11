package com.example.retrofitEjemplo.util;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {
    private static Retrofit retrofit=null;

    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit =new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
