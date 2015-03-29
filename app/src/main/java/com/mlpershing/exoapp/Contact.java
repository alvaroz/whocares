package com.mlpershing.exoapp;

import android.net.Uri;

/**
 * Created by Mandy on 3/25/15.
 */
public class Contact {

    private String _name, _phone, _email, _address, _comments;
    private Uri _imageURI;
    private int _id;

    public Contact (int id, String name, String phone, String email, String address, String comments) {
    _id = id;
    _name = name;
    _phone = phone;
    _email = email;
    _address = address;
    _comments = comments;
    }

    public Contact(String name, String phone, String email, String address, String comments) {

    }

    public int getId() {return _id; }
    public String getName() {
        return _name;
    }

    public String getPhone() {
        return _phone;
    }

    public String getEmail() {
        return _email;
    }

    public String getAddress() {
        return _address;
    }

    public String getComments() {
        return _comments;
    }


}
