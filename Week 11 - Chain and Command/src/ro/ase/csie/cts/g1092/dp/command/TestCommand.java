package ro.ase.csie.cts.g1092.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		TakManager = new TaskManager();
		manager.addAsynsTask(new AsynsCommand("Autosave", new BackupModule()));
		manager.addAsynsTask(new AsyncCommand("Update 3d models", new UpdateModule()));
		
		System.out.println("Game is running");
		
		manager.execute();
		manager.execute();

	}

}
