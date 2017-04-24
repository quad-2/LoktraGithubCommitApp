package com.example.quad2.githubapitest;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.quad2.githubapitest.pojo.GithubDatum;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView commitRv;
    private static String baseUrl = "https://api.github.com/repos/rails/rails/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commitRv = (RecyclerView) findViewById(R.id.commit_rv);
        getCommitData();
    }

    public void getCommitData() {
        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.show();
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        GithubApi githubApi = retrofit.create(GithubApi.class);
        Call<List<GithubDatum>> call = githubApi.getCommits();
        call.enqueue(new Callback<List<GithubDatum>>() {
            @Override
            public void onResponse(Call<List<GithubDatum>> call, Response<List<GithubDatum>> response) {
                dialog.dismiss();
                if (response != null && response.body() != null) {
                    setCommitRv(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<GithubDatum>> call, Throwable t) {
                t.printStackTrace();
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setCommitRv(List<GithubDatum> list) {
        commitRv.setHasFixedSize(true);
        CommitAdapter adapter = new CommitAdapter(list, this);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        commitRv.setLayoutManager(llm);
        commitRv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
