import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i <20; i++)
			executor.execute(new MultiThreadedFib(i));
		executor.shutdown();
	}

}
