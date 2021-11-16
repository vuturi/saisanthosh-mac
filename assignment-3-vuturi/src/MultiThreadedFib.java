

class MultiThreadedFib implements Runnable{  
	public int num;
	 public MultiThreadedFib(int n) {
		num = n; 
	 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long multi = 1;
		for(int i = 1; i <= num; i++)
			multi *= i;
		
		System.out.println("From " + Thread.currentThread().getName() + ": Factorial of "+num+" is: "+multi);
	}  
	}  