package net.yupol.transmissionremote.app.preferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import net.yupol.transmissionremote.app.R;


public class AdvancedPreferencesFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.advanced_preferences);
    }
}
