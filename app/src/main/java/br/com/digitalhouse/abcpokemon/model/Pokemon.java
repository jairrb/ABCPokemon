package br.com.digitalhouse.abcpokemon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable {
    private String name;
    private int image;

    public Pokemon(String name, int image) {
        this.name = name;
        this.image = image;
    }

    protected Pokemon(Parcel in) {
        name = in.readString();
        image = in.readInt();
    }

    public static final Creator<Pokemon> CREATOR = new Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel in) {
            return new Pokemon(in);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(image);
    }
}