package com.example.marijaradisavljevic.bla;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by marija.radisavljevic on 4/1/2016.
 */
public class ActivityLogin extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.place, new FragmentLogin()).commit();

    }
}
