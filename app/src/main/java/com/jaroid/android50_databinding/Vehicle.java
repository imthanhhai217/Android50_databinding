package com.jaroid.android50_databinding;

import androidx.databinding.ObservableField;

public class Vehicle {
    public static ObservableField<String> mVehicleName = new ObservableField<>();

    public Vehicle() {
    }

    public static ObservableField<String> getmVehicleName() {
        return mVehicleName;
    }

    public static void setmVehicleName(ObservableField<String> vehicleName) {
        mVehicleName = vehicleName;
    }
}
