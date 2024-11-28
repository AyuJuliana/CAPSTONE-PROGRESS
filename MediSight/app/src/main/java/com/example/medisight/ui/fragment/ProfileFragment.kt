package com.example.medisight.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medisight.R
import com.example.medisight.data.preferences.UserPreferences
import com.example.medisight.ui.activity.OnBoardingActivity
import com.google.android.material.button.MaterialButton

class ProfileFragment : Fragment() {

    private lateinit var userPreferences: UserPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userPreferences = UserPreferences(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val logoutButton: MaterialButton = view.findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener {
            handleLogout()
        }

        return view
    }

    private fun handleLogout() {
        userPreferences.clearSession()

        val intent = Intent(requireContext(), OnBoardingActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}