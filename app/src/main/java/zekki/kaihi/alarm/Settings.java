package zekki.kaihi.alarm;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class Settings extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.setting, rootKey);
    }
}