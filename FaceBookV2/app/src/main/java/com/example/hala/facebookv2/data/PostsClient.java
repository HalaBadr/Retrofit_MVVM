package com.example.hala.facebookv2.data;

import com.example.hala.facebookv2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {

    private static final String Base_Url = "https://jsonplaceholder.typicode.com/";
    private PostInterface postInterface ;
    private static PostsClient Instance;

    public PostsClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static PostsClient getInstance(){
       if (Instance == null){
           Instance=new PostsClient();
       }
       return Instance;
    }

    public Call<List<PostModel>> getposts(){
        return postInterface.getposts();
    }
}

