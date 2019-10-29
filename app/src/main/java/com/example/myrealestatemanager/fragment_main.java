package com.example.myrealestatemanager;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_main extends Fragment {

    private Button buttonSimulator;

    public fragment_main() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        NavHostFragment hostFragment = (NavHostFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment);
        NavController navController = hostFragment.getNavController();

        buttonSimulator = v.findViewById(R.id.button_simulator);
        launchSimulatorActivity();
        // Inflate the layout for this fragment
        return v;
    }

    private void launchSimulatorActivity(){
        buttonSimulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CalculatorActivity.class);
                startActivity(intent);
            }
        });

    }
}
