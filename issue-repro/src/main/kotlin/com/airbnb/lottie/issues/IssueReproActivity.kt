package com.airbnb.lottie.issues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.issues.databinding.IssueReproActivityBinding

class IssueReproActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = IssueReproActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view, MainFragment())
                .addToBackStack("MainFragment")
                .commit()
        }
    }
}
