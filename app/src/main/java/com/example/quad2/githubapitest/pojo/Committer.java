
package com.example.quad2.githubapitest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Committer {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Committer() {
    }

    /**
     * 
     * @param email
     * @param name
     * @param date
     */
    public Committer(String name, String email, String date) {
        super();
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Committer withName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Committer withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Committer withDate(String date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        return "Committer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
