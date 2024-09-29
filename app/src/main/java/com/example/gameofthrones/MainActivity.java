package com.example.gameofthrones;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.example.gameofthrones.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private NavController navController;
    private boolean isRestart = false; // Bandera para verificar si es la segunda vez que se presiona

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener el NavController desde el NavHostFragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        // Configurar el botón para navegar al HomeFragment
        binding.btnComenzar.setOnClickListener(v -> {
            if (!isRestart) {
                // Mostrar el FragmentContainerView
                binding.navHostFragment.setVisibility(View.VISIBLE);
                // Navegar al HomeFragment
                navController.navigate(R.id.homeFragment);
                // Cambiar el texto del botón a "REINICIAR"
                binding.btnComenzar.setText("REINICIAR");
                isRestart = true; // Cambiar la bandera a true
            } else {
                // Reiniciar la aplicación
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); // Cerrar la actividad actual
            }
        });
    }
}
