package com.example.gameofthrones;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.gameofthrones.databinding.FragmentDetailsBinding;

public class DetailsFragment extends Fragment {
    private FragmentDetailsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Configura la navegación al presionar el botón Volver
        binding.btnVolver.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_detailsFragment_to_homeFragment);
        });

        // Configura la navegación al presionar el botón Siguiente
        binding.btnSiguiente.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_detailsFragment_to_fragmentUno);
        });

        // Configura la navegación al presionar el botón Home
        binding.btnHome.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_detailsFragment_to_homeFragment);
        });
    }
}
