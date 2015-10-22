package javarush.eclipse.ui.preferences;

import static javarush.eclipse.core.Constants.DEFAULT_MINUTES;
import static javarush.eclipse.core.Constants.DEFAULT_PROJECT_NAME;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.core.Constants;

public class PreferencesInitializer extends AbstractPreferenceInitializer {

    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = JavarushEclipsePlugin.getDefault()
                .getPreferenceStore();
        store.setDefault(Constants.FIELD_PROJECT, DEFAULT_PROJECT_NAME);
        store.setDefault(Constants.FIELD_MINUTES, DEFAULT_MINUTES);
    }

}
