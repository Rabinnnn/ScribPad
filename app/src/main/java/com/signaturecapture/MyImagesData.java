package com.signaturecapture;

import android.content.Context;
import android.net.Uri;

public class MyImagesData{
    private String description;
    //private String url;
    private static Uri uri;




    public MyImagesData(String description, Uri uri) {

        this.description = description;
        this.uri = uri;



    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public static Uri getUri() {
        return uri;
    }
    public void setUri(Uri uri) {
        this.uri = uri;
    }
}