package de.pf.terminal.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import de.pf.terminal.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}