package com.example.gameofthrones;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.gameofthrones.databinding.FragmentTresBinding;

public class FragmentTres extends Fragment {
    private FragmentTresBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTresBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnAtras.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentTres_to_fragmentDos);
        });


        binding.btnSiguiente.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentTres_to_videoFragment);
        });

        binding.btnHome.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentTres_to_homeFragment);
        });
    }
}
