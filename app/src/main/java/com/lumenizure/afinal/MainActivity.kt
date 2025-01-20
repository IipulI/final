package com.lumenizure.afinal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lumenizure.afinal.ui.dosen.DosenFragment
import com.lumenizure.afinal.ui.home.HomeFragment
import com.lumenizure.afinal.ui.kegiatan.KegiatanFragment
import com.lumenizure.afinal.ui.peminatan.PeminatanFragment
import com.lumenizure.afinal.ui.profil.ProfilFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Set HomeFragment as the default
        loadFragment(HomeFragment())

        bottomNavigationView.setOnItemSelectedListener { item ->
            val selectedFragment: Fragment = when (item.itemId) {
                R.id.navigation_home -> HomeFragment()
                R.id.navigation_kegiatan -> KegiatanFragment() // Placeholder for other fragments
                R.id.navigation_dosen -> DosenFragment()       // Placeholder for other fragments
                R.id.navigation_peminatan -> PeminatanFragment() // Placeholder for other fragments
                R.id.navigation_profil -> ProfilFragment()   // Placeholder for other fragments
                else -> HomeFragment()
            }
            loadFragment(selectedFragment)
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}