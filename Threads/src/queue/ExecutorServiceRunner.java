package queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService  executorService = Executors.newSingleThreadExecutor();
           executorService.execute(new Task1());   
           executorService.execute(new Thread(new Task2()));
           executorService.shutdown();
	}

}
