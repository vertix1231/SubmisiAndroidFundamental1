package com.dicoding.android.fundamental.githubuserapp.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Pojogithub implements Parcelable {
    private int ivprofil;
    private String username,name,company,location,repository,follower,following,ivprofilurl;

    public int getIvprofil() {
        return ivprofil;
    }

    public void setIvprofil(int ivprofil) {
        this.ivprofil = ivprofil;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getIvprofilurl() {
        return ivprofilurl;
    }

    public void setIvprofilurl(String ivprofilurl) {
        this.ivprofilurl = ivprofilurl;
    }

    public Pojogithub(int ivprofil, String username, String name, String company, String location, String repository, String follower, String following, String ivprofilurl) {
        this.ivprofil = ivprofil;
        this.username = username;
        this.name = name;
        this.company = company;
        this.location = location;
        this.repository = repository;
        this.follower = follower;
        this.following = following;
        this.ivprofilurl = ivprofilurl;
    }

    public Pojogithub() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.ivprofil);
        dest.writeString(this.username);
        dest.writeString(this.name);
        dest.writeString(this.company);
        dest.writeString(this.location);
        dest.writeString(this.repository);
        dest.writeString(this.follower);
        dest.writeString(this.following);
        dest.writeString(this.ivprofilurl);
    }

    protected Pojogithub(Parcel in) {
        this.ivprofil = in.readInt();
        this.username = in.readString();
        this.name = in.readString();
        this.company = in.readString();
        this.location = in.readString();
        this.repository = in.readString();
        this.follower = in.readString();
        this.following = in.readString();
        this.ivprofilurl = in.readString();
    }

    public static final Parcelable.Creator<Pojogithub> CREATOR = new Parcelable.Creator<Pojogithub>() {
        @Override
        public Pojogithub createFromParcel(Parcel source) {
            return new Pojogithub(source);
        }

        @Override
        public Pojogithub[] newArray(int size) {
            return new Pojogithub[size];
        }
    };
}
