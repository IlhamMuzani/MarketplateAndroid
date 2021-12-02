package com.ilham.marketplace.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilham.marketplace.R
import com.ilham.marketplace.databinding.ActivityLoginBinding
import com.ilham.marketplace.databinding.FragmentDashboardBinding
import com.ilham.marketplace.util.Prefs

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val s = Prefs(this)
        if (s.getIsLogin()) {
            binding.tvStatus.text = "SUdah Login"
        }else binding.tvStatus.text = "Belum Login"

            binding.btnLogin.setOnClickListener {
                s.setIsLogin(true)
                onBackPressed()
            }
        binding.btnLogout.setOnClickListener {
            s.setIsLogin(false)
            onBackPressed()
        }
        }

}