package app.appsmatic.com.iwishdriversapp.API.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mido PC on 8/31/2016.
 */
public class Msg {



    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("Msg")
    @Expose
    int msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }





}
