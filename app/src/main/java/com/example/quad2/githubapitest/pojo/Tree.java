
package com.example.quad2.githubapitest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tree {

    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tree() {
    }

    /**
     * 
     * @param sha
     * @param url
     */
    public Tree(String sha, String url) {
        super();
        this.sha = sha;
        this.url = url;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Tree withSha(String sha) {
        this.sha = sha;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Tree withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "sha='" + sha + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
