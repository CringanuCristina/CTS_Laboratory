package ro.ase.csie.cts.g1092.dp.command;

import java.util.ArrayList;

public class TaskManager {

	ArrayList<AsynsTask> tasks = new ArrayList<>();
	public void addAsyncTask(AsynsTask task) {
		tasks.add(task);
	}
	public void execute() {
		if(task.size()>0) {
		AsynsTask taskToExecute = task.get(0);
		if(taskToExecute != null) {
			tasks.remove(0);
			tastToExecute.asynsExecute();
		}}
	}
}
