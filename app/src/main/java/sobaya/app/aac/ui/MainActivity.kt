package sobaya.app.aac.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import sobaya.app.aac.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setupWithNavController(Navigation.findNavController(this, R.id.main_contents))
        navigation.setOnNavigationItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, Navigation.findNavController(this, R.id.main_contents))
        }
    }
}
