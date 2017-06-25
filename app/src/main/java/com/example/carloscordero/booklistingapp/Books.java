package com.example.carloscordero.booklistingapp;

public class Books {

    private String mTitle;
    private String mAurthor;
    private String mDescription;
    private String mUrl;
    private String mThumbNailUrl;

    public Books(String title, String aurthor, String description, String url, String thumbNailUrl) {

        mTitle = title;
        mAurthor = aurthor;
        mDescription = description;
        mUrl = url;
        mThumbNailUrl = thumbNailUrl;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
    public void setAurthor(String aurthor) {
        this.mAurthor = aurthor;
    }
    public void setDescription(String description) {
        this.mDescription = description;
    }
    public void setUrl(String url) {
        this.mUrl = url;
    }
    public void setThumbNailUrl(String thumbNailUrl) {
        this.mThumbNailUrl = thumbNailUrl;
    }

    public String getTitle() {return mTitle;}
    public String getAurthor() {return mAurthor;}
    public String getDescription() {return  mDescription;}
    public String getUrl() {return mUrl;}
    public String getThumbNailUrl() {return mThumbNailUrl;}
}
