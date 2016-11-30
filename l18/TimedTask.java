public class TimedTask implements Runnable {
	int time;
	public TimedTask(int time) {
		if (time <= 1000) {
			this.time = time;
		}
		else {
			this.time = 1000;
		}
	}
	
	public void run() {
        try {
			Thread.sleep(this.time);
		} catch (InterruptedException ex) {
			ex.printStackTrace(); // Nothing to do, sleep a bit less }
		}
	}
	
	/**private void sleep(int time) { 
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200); 
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace(); // Nothing to do, sleep a bit less }
		}*/
}
