package com.example.gameofthrones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.example.gameofthrones.databinding.FragmentVideoBinding;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VideoFragment extends Fragment {
    private FragmentVideoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentVideoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Configurar el WebView para cargar el video
        binding.webView.setWebViewClient(new WebViewClient()); // Evita abrir en el navegador
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        binding.webView.loadUrl("https://www.youtube.com/watch?v=JRmz4N6ao5o");

        // Configurar el botón de regreso
        binding.btnBack.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_videoFragment_to_fragmentTres);
        });
        binding.btnHome.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_videoFragment_to_homeFragment); // Regresa al HomeFragment
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; //
    }
}
