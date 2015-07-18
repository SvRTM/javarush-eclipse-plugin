package javarush.eclipse.ui.preferences;

import static javarush.eclipse.core.Constants.DEFAULT_PROJECT_NAME;
import javarush.eclipse.JavarushEclipsePlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferencesInitializer extends AbstractPreferenceInitializer {

    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = JavarushEclipsePlugin.getDefault()
                .getPreferenceStore();
        store.setDefault("projectName", DEFAULT_PROJECT_NAME);
    }

}
