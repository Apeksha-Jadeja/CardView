package com.example.cardview;

public class AppModel {

    private String name;
    private int numOfDownloads,thumbnails;

    public AppModel() {
    }

    public AppModel(String name, int numOfDownloads) {
        this.name = name;
        this.numOfDownloads = numOfDownloads;
        this.thumbnails = thumbnails;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDownloads() {
        return numOfDownloads;
    }

    public void setNumOfDownloads(int numOfDownloads) {
        this.numOfDownloads = numOfDownloads;
    }

    public int getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(int thumbnails) {
        this.thumbnails = thumbnails;
    }




}
