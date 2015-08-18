package javarush.eclipse.ui.action;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;

import javarush.eclipse.core.jobs.UserInfoJob;

public class UserInfoHandler extends AbstractHandler {
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Job job = new UserInfoJob();
        job.schedule();

        return null;
    }
}
