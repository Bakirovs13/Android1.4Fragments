package com.hfad.android14fragments.models;

public class User {

    private final String songName;
    private final String avtor;
    private final String number;


    public User(String songName, String avtor, String number) {
        this.songName = songName;
        this.avtor = avtor;
        this.number = number;
    }

    public String getSongName() {
        return songName;
    }

    public String getAvtor() {
        return avtor;
    }

    public String getNumber() {
        return number;
    }
}
