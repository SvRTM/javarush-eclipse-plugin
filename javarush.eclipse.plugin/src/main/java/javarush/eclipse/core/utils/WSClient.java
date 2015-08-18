package javarush.eclipse.core.utils;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.eclipse.core.runtime.CoreException;

import javarush.eclipse.JavarushEclipsePlugin;
import javarush.eclipse.security.Authorization;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.JarCommonService;

public class WSClient {

    private final Authorization authorization;
    private final IJarCommonService service;

    public WSClient() {
        service = createService();
        authorization = new Authorization(service);
    }

    public IJarCommonService getService() {
        return service;
    }

    /**
     * @return HTTP session ID
     * @throws CoreException
     */
    public String authorize() throws CoreException {
        return authorization
                .login(WorkspaceUtil.getProject(Util.getPrefProjectName()));
    }

    public void logout() {
        try {
            authorization.logout();
        }
        catch (Exception e) {
            JavarushEclipsePlugin.logError(e);
        }
    }

    private IJarCommonService createService() {
        final IJarCommonService service = new JarCommonService()
                .getJarCommonServicePort();

        // Set request context property.
        final Map<String, Object> requestContext = ((BindingProvider) service)
                .getRequestContext();
        requestContext.put("com.sun.xml.ws.request.timeout", 600000);
        requestContext.put("com.sun.xml.ws.connect.timeout", 10000);
        // JAX-WS
        requestContext.put("com.sun.xml.internal.ws.request.timeout", 600000);
        requestContext.put("com.sun.xml.internal.ws.connect.timeout", 10000);

        return service;
    }
}
