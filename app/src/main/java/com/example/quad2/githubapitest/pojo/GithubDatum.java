
package com.example.quad2.githubapitest.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GithubDatum {

    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("commit")
    @Expose
    private Commit commit;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("author")
    @Expose
    private Author_ author;
    @SerializedName("committer")
    @Expose
    private Committer_ committer;
    @SerializedName("parents")
    @Expose
    private List<Parent> parents = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GithubDatum() {
    }

    /**
     * 
     * @param author
     * @param parents
     * @param htmlUrl
     * @param commit
     * @param sha
     * @param commentsUrl
     * @param committer
     * @param url
     */
    public GithubDatum(String sha, Commit commit, String url, String htmlUrl, String commentsUrl, Author_ author, Committer_ committer, List<Parent> parents) {
        super();
        this.sha = sha;
        this.commit = commit;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.commentsUrl = commentsUrl;
        this.author = author;
        this.committer = committer;
        this.parents = parents;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public GithubDatum withSha(String sha) {
        this.sha = sha;
        return this;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public GithubDatum withCommit(Commit commit) {
        this.commit = commit;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GithubDatum withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GithubDatum withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public GithubDatum withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public GithubDatum withAuthor(Author_ author) {
        this.author = author;
        return this;
    }

    public Committer_ getCommitter() {
        return committer;
    }

    public void setCommitter(Committer_ committer) {
        this.committer = committer;
    }

    public GithubDatum withCommitter(Committer_ committer) {
        this.committer = committer;
        return this;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public GithubDatum withParents(List<Parent> parents) {
        this.parents = parents;
        return this;
    }

    @Override
    public String toString() {
        return "GithubDatum{" +
                "sha='" + sha + '\'' +
                ", commit=" + commit +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", commentsUrl='" + commentsUrl + '\'' +
                ", author=" + author +
                ", committer=" + committer +
                ", parents=" + parents +
                '}';
    }
}
