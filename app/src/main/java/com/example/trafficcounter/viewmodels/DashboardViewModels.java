package com.example.trafficcounter.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trafficcounter.models.Value;

public class DashboardViewModels extends ViewModel {

    public MutableLiveData<Value> valueMutableLiveData = new MutableLiveData<>();
    public Value value = new Value();

    public LiveData<Value> getValue(){
        return valueMutableLiveData;
    }

    public void addValueW2(int point){
        value.setW2value(value.getW2value()+point);
        valueMutableLiveData.setValue(value);
        Log.d("Value W2 : ", String.valueOf(value.getW2value()));
    }

    public void addValueW3(int point){
        value.setW3value(value.getW3value()+point);
        valueMutableLiveData.setValue(value);
        Log.d("Value W3 : ", String.valueOf(value.getW3value()));
    }

    public void addValueW4std(int point){
        value.setW4stdvalue(value.getW4stdvalue()+point);
        valueMutableLiveData.setValue(value);
        Log.d("Value W4 Standard : ", String.valueOf(value.getW4stdvalue()));
    }

    public void addValueW4Truck(int point){
        value.setW4truckvalue(value.getW4truckvalue()+point);
        valueMutableLiveData.setValue(value);
        Log.d("Value W4 Truck : ", String.valueOf(value.getW4truckvalue()));
    }
}