package com.example.myrealestatemanager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_main extends Fragment {


    public fragment_main() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        NavHostFragment hostFragment = (NavHostFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment);
        NavController navController = hostFragment.getNavController();

        // Inflate the layout for this fragment
        return v;
    }

}
