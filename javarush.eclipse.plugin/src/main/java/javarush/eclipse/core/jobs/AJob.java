package javarush.eclipse.core.jobs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.Job;

import javarush.eclipse.core.utils.WSClient;
import javarush.eclipse.ws.client.IJarCommonService;

public abstract class AJob extends Job {
    private final WSClient wsClient;

    public AJob(final String name) {
        super(name);
        setUser(true);
        wsClient = new WSClient();
    }

    protected IJarCommonService getWSClient() {
        return wsClient.getService();
    }

    protected String authorize() throws CoreException {
        return wsClient.authorize();
    }

    protected void logout() {
        wsClient.logout();
    }
}
