
package com.example.quad2.githubapitest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Commit {

    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("committer")
    @Expose
    private Committer committer;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("tree")
    @Expose
    private Tree tree;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("comment_count")
    @Expose
    private long commentCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Commit() {
    }

    /**
     * 
     * @param message
     * @param author
     * @param tree
     * @param commentCount
     * @param committer
     * @param url
     */
    public Commit(Author author, Committer committer, String message, Tree tree, String url, long commentCount) {
        super();
        this.author = author;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.url = url;
        this.commentCount = commentCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Commit withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Committer getCommitter() {
        return committer;
    }

    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    public Commit withCommitter(Committer committer) {
        this.committer = committer;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Commit withMessage(String message) {
        this.message = message;
        return this;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public Commit withTree(Tree tree) {
        this.tree = tree;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Commit withUrl(String url) {
        this.url = url;
        return this;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public Commit withCommentCount(long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "author=" + author +
                ", committer=" + committer +
                ", message='" + message + '\'' +
                ", tree=" + tree +
                ", url='" + url + '\'' +
                ", commentCount=" + commentCount +
                '}';
    }
}
