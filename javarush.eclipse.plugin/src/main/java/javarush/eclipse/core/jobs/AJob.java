package javarush.eclipse.core.jobs;

import java.util.Map;

import javarush.eclipse.core.utils.Util;
import javarush.eclipse.core.utils.WorkspaceUtil;
import javarush.eclipse.security.Authorization;
import javarush.eclipse.ws.client.IJarCommonService;
import javarush.eclipse.ws.client.JarCommonService;

import javax.xml.ws.BindingProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.Job;

public abstract class AJob extends Job {

    public AJob(String name) {
        super(name);
    }

    protected String authorize() throws CoreException {
        return Authorization.login(
                WorkspaceUtil.getProject(Util.getPrefProjectName()),
                getClient());
    }

    protected IJarCommonService getClient() {
        IJarCommonService client = new JarCommonService()
                .getJarCommonServicePort();

        // Set request context property.
        Map<String, Object> requestContext = ((BindingProvider) client)
                .getRequestContext();
        requestContext.put("com.sun.xml.ws.request.timeout", 600000);
        requestContext.put("com.sun.xml.ws.connect.timeout", 10000);
        // JAX-WS
        requestContext.put("com.sun.xml.internal.ws.request.timeout", 600000);
        requestContext.put("com.sun.xml.internal.ws.connect.timeout", 10000);

        return client;
    }
}
