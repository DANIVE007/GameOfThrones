package com.example.gameofthrones;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import com.example.gameofthrones.databinding.FragmentUnoBinding;

public class FragmentUno extends Fragment {
    private FragmentUnoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUnoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnAtras.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentUno_to_detailsFragment);
        });

        binding.btnSiguiente.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentUno_to_fragmentDos);
        });

        binding.btnHome.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentUno_to_homeFragment); // Regresa al HomeFragment
        });
    }
}

