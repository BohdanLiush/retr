package com.example.bohdan.retr;

/** Created by bohdan on 16.03.2018. */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TankModel {

        @SerializedName("status")
        @Expose
        private String status;

        @SerializedName("meta")
        @Expose
        private Meta meta;

        @SerializedName("data")
        @Expose
        private Data data;

        public Data getData() {
            return data;
        }
        public void setData(Data data) {
            this.data = data;
        }

}

