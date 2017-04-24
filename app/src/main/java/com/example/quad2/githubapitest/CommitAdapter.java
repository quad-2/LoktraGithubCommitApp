package com.example.quad2.githubapitest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quad2.githubapitest.pojo.GithubDatum;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveen on 24/4/17.
 */

public class CommitAdapter extends RecyclerView.Adapter<CommitAdapter.ViewHolder> {

    private List<GithubDatum> commitList = new ArrayList<>();
    private Context context;

    public CommitAdapter(List<GithubDatum> commitList, Context context) {
        this.commitList = commitList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.commit_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        GithubDatum githubDatum = getItem(position);
        if (githubDatum != null) {

            if (githubDatum.getCommitter() != null && githubDatum.getCommitter().getAvatarUrl() != null
                    && githubDatum.getCommitter().getAvatarUrl().length() > 0) {
                Picasso.with(context)
                        .load(githubDatum.getCommitter().getAvatarUrl())
                        .centerCrop()
                        .resize(80,80)
                        .into(holder.imageView);
            }

            if (githubDatum.getCommit() != null && githubDatum.getCommit().getCommitter() != null
                    && githubDatum.getCommit().getCommitter().getName() != null && githubDatum.getCommit().getCommitter().getName().length() > 0) {
                holder.name.setText("Name : " + githubDatum.getCommit().getCommitter().getName());
            }

            if (githubDatum.getSha() != null && githubDatum.getSha().length() > 0) {
                holder.commit.setText("Commit : " + githubDatum.getSha());
            }

            if (githubDatum.getCommit() != null && githubDatum.getCommit().getMessage() != null
                    && githubDatum.getCommit().getMessage().length() > 0) {
                holder.commitMessage.setText("Message : " + githubDatum.getCommit().getMessage());
            }

        }

    }

    @Override
    public int getItemCount() {
        return commitList.size();
    }

    public GithubDatum getItem(int position) {
        return position < commitList.size() ? commitList.get(position) : null;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, commit, commitMessage;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.profile_image);
            name = (TextView) itemView.findViewById(R.id.name);
            commit = (TextView) itemView.findViewById(R.id.commit);
            commitMessage = (TextView) itemView.findViewById(R.id.commit_message);
        }
    }
}
