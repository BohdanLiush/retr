package com.example.bohdan.retr;

/** Created by bohdan on 16.03.2018. */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("1")
    @Expose
    private _1 _1;
    @SerializedName("17")
    @Expose
    private _17 _17;

    public _1 get1() {
        return _1;
    }

    public void set1(_1 _1) {
        this._1 = _1;
    }

    public _17 get17() {
        return _17;
    }

    public void set17(_17 _17) {
        this._17 = _17;
    }


    }
