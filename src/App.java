
public class App {
	
	static void factorial (Integer n) {
		if(n == 0)
			return;
		
		Integer result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
//		System.out.println(result);
	}
	
	static void smartFactorial(Integer n) {
		int odd = 1;
		if(n % 2 == 1){
			odd = n;
			n--;
		}
		int result = n;
		int add = n - 2;
		int lastAdded = n;
		while (add >= 2){
			result = result * (lastAdded + add);
			lastAdded = lastAdded + add;
			add = add - 2;
		}
		result = result * odd;
//		System.out.println(result);
	}

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i <= 1000; i++){
			for(int n = 0; n <= 10; n++){
				factorial(n);
			}	
		}
		
		System.out.println("1. Execution time: " + (System.currentTimeMillis() - startTime));
		
		
		long startTime2 = System.currentTimeMillis();
		
		for (int i = 0; i <= 1000; i++){
			for(int n = 0; n <= 10; n++){
				smartFactorial(n);
			}	
		}
		
		System.out.println("2. Execution time: " + (System.currentTimeMillis() - startTime2));
	}
}
