package com.sergiandreplace.hellodatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.Observable;

/**
 * Created by Sergi on 29/09/2015.
 */
public class ViewData extends BaseObservable {
    private  final String helloMessage;

    public ViewData(String helloMessage) {
        this.helloMessage = helloMessage;
    }
    @Bindable
    public String getHelloMessage() {
        return helloMessage;
    }
}
