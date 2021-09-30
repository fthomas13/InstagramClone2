package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BX7YGyu4AyFoxKbH3EfN6zzBT4CrtEvQnjJ7hgXh")
                .clientKey("dPMlhdyRa8agcUiR9nHWnsCkzeRK77JCGMydZlUP")
                .server("https://parseapi.back4app.com")
                .build()

        );
    }

}