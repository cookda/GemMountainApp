package com.example.gigaw.gemmountainapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gigaw on 6/25/2017.
 */

public class GemBucket {
    private static GemBucket mGemBucket;
    private List<Gems> mGems;
    private String[] mGemNames = {"Amazonite", "Amethyst", "Ametrine",
            "Aquamarine","Aventurine", "Citrine", "Clear Quartz",
            "Emerald", "Florite", "Garnet", "Iolite", "Kyanite",
            "Moonstone", "Ruby", "Rutilated Quartz", "Sapphire",
            "Smokey Quartz", "Topaz", "Tourmaline"};
    public static GemBucket get(Context context) {
        if(mGemBucket == null) {
            mGemBucket = new GemBucket(context);
        }
        return mGemBucket;
    }

    private GemBucket(Context context) {
        mGems = new ArrayList<>();
        for (int i = 0; i < mGemNames.length; i++){
            Gems gem = new Gems();
            gem.setName(mGemNames[i]);
            mGems.add(gem);
        }
    }

    public List<Gems> getGems() {
        return mGems;
    }

    public Gems getGems(String name) {
        for (Gems gem : mGems) {
            if(gem.getName().equals(name)){
                return gem;
            }
        }
        return null;
    }
}
