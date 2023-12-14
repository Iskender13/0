package com.example.retrofit.onBoarding

import android.content.Context

object SharedPreferencesManager {

    private const val ONBOARDING_PREFERENCES = "onBoarding"
    private const val KEY_FINISHED = "Finished"

    fun setOnboardingFinished(context: Context, isFinished: Boolean) {
        val sharedPref = context.getSharedPreferences(ONBOARDING_PREFERENCES, Context.MODE_PRIVATE)
        sharedPref.edit().apply {
            putBoolean(KEY_FINISHED, isFinished)
            apply()
        }
    }

    fun isOnboardingFinished(context: Context): Boolean {
        val sharedPref = context.getSharedPreferences(ONBOARDING_PREFERENCES, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(KEY_FINISHED, false)
    }
}