package javarush.eclipse.plugin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javarush.eclipse.JavarushEclipsePlugin;

/**
 * Sample integration test. In Eclipse, right-click > Run As > JUnit-Plugin.
 * <br/>
 * In Maven CLI, run "mvn integration-test".
 */
public class ActivatorTest {

    @Test
    public void veryStupidTest() {
        assertEquals("javarush.eclipse.plugin", JavarushEclipsePlugin.getId());
        assertTrue("Plugin should be started",
                JavarushEclipsePlugin.getDefault().started);
    }
}
