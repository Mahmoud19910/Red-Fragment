package mah.nassa.sss;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mah.nassa.sss.databinding.FragmentYellowBinding;

public class Yellow extends Fragment {

    FragmentYellowBinding binding;
    OnFragmentChange listener;

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);

        if(activity instanceof OnFragmentChange){
            listener= (OnFragmentChange) activity;

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentYellowBinding.inflate(inflater , container , false);
        View view=binding.getRoot();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onFragChanged("red");

            }
        });
    }
}