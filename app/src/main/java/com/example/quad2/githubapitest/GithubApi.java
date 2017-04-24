package com.example.quad2.githubapitest;

import com.example.quad2.githubapitest.pojo.GithubDatum;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by praveen on 24/4/17.
 */

public interface GithubApi {

    @GET("commits?page=1&sort=created&order=desc")
    Call<List<GithubDatum>> getCommits();
}
