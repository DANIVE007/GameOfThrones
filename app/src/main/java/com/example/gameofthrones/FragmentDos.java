package com.example.gameofthrones;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import com.example.gameofthrones.databinding.FragmentDosBinding;

public class FragmentDos extends Fragment {
    private FragmentDosBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDosBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnAtras.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentDos_to_fragmentUno);
        });

        binding.btnSiguiente.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentDos_to_fragmentTres);
        });

        binding.btnHome.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentDos_to_homeFragment);
        });
    }
}
