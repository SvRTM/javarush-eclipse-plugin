package javarush.eclipse.ui.action;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;

import javarush.eclipse.core.jobs.TaskListJob;

public class TaskListHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Job job = new TaskListJob();
        job.schedule();

        return null;
    }

}
