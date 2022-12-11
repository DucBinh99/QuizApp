package com.example.final_quiz;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
    String category;
    String level;
    String score;

    public Data(String category, String level, String score) {
        this.category = category;
        this.level = level;
        this.score = score;
    }

    protected Data(Parcel in) {
        category = in.readString();
        level = in.readString();
        score = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    public String getScore() {
        return score;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(category);
        parcel.writeString(level);
        parcel.writeString(score);
    }
}
