import java.util.concurrent.Executor;
import java.util.ArrayList;

public class ExecutorImpl implements Executor {
	private ArrayList<Runnable> queue;

	public void execute(Runnable runnable) {
		queue.add(runnable);
		runnable.run();
		queue.remove(runnable);
	}
	
	public int getMaxPendingTime() {
		int time = 1000 * queue.size();
		return time;
	}
	
	
}