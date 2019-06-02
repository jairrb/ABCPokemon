package br.com.digitalhouse.abcpokemon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Cadastro implements Parcelable {
    private String email;
    private String user;
    private String password;

    public Cadastro() {
    }

    public Cadastro(String email, String user, String password) {
        this.email = email;
        this.user = user;
        this.password = password;
    }


    protected Cadastro(Parcel in) {
        email = in.readString();
        user = in.readString();
        password = in.readString();
    }

    public static final Creator<Cadastro> CREATOR = new Creator<Cadastro>() {
        @Override
        public Cadastro createFromParcel(Parcel in) {
            return new Cadastro(in);
        }

        @Override
        public Cadastro[] newArray(int size) {
            return new Cadastro[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(user);
        dest.writeString(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
