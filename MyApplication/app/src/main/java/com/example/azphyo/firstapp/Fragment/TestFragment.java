package com.example.azphyo.firstapp.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.azphyo.firstapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {

    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("FRAGMENT","Fragment onAttach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("FRAGMENT","Fragment onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FRAGMENT","Fragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FRAGMENT","Fragment onResume");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("FRAGMENT","Fragment onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

}
