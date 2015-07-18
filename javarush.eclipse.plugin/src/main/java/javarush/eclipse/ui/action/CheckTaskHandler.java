package javarush.eclipse.ui.action;

import javarush.eclipse.core.jobs.CheckTaskJob;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Executed by click menu.<br/>
 */
public class CheckTaskHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        Job job = new CheckTaskJob();
        job.setUser(true);
        job.schedule();
        return null;
    }

}
