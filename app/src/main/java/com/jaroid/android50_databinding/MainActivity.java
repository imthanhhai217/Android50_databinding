package com.jaroid.android50_databinding;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.jaroid.android50_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Vehicle vehicle;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setUserName("Jaroid");
        user.setAddress("Hà Nội");
        user.setAge(10);

        vehicle = new Vehicle();
        vehicle.mVehicleName.set("Xe máy");

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
//        binding.setVehicle(vehicle);

        ClickHandler clickHandler = new ClickHandler(this);
        binding.setClickHandler(clickHandler);
        Log.d(TAG, "onCreate: " + binding.getUser().toString());

        user.setUserName("Hai 2");
    }

    public class ClickHandler {

        private Context mContext;

        public ClickHandler(Context context) {
            this.mContext = context;
        }

        public void saveClick(View v) {
            Log.d(TAG, "SaveClick: ");
        }

        public void saveClickData(View v, String vehicleName) {
            Log.d(TAG, "saveClickData: " + vehicleName);
            vehicle.mVehicleName.set(vehicleName);
        }
    }
}