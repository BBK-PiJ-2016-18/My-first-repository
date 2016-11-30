import java.util.concurrent.Executor;
//import java.util.concurrent.ScheduledThreadPoolExecutor;

public class TextLoopWithMyExecutor implements Runnable { 
    public static final int COUNT = 10;
    private final String name;
    
    public TextLoopWithMyExecutor(String name) { 
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
           // sleep();
           System.out.println("Loop:" + name + ", iteration:" + i + ".");
        } 
    }

    /** private void sleep() { 
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200); 
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace(); // Nothing to do, sleep a bit less }
		}
    }*/
    
    public static void main(String args[]) {
        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>"); 
			System.out.println(" mode 0: without threads"); 
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoopWithMyExecutor("Thread " + i);
				r.run();
			}
		} else {
			 Executor e = new ExecutorImpl();
             for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoopWithMyExecutor("Thread " + i);
				System.out.println("Launching task " + i);
                e.execute(r);
			}
		}
	}
}