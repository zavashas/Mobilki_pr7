package com.example.pr71;

import android.net.Uri;

public class Cloth {
    private String title;
    private String material;
    private String size;
    private Uri imageUri;

    public Cloth(String title, String material, String size, Uri imageUri) {
        this.title = title;
        this.material = material;
        this.size = size;
        this.imageUri = imageUri;
    }

    public String getTitle() {
        return title;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public Uri getImageUri() {
        return imageUri;
    }

}