public class Homework {
	public static void main(String[] args) {
		for(int i = 1, x = 300; (x = Fibonacci.of(i)) <= 200; i++) {
			System.out.println(x);
		}
	}
}

class Fibonacci {
	public static int of(int index) {
		if(index == 1) {
			return 1;
		}else if(index > 1){
			int[] x = new int[index];
			x[0] = 1;
			x[1] = 1;
			for(int i = 2; i < index; i++) {
				x[i] = x[i-1] + x[i-2];
			}
			return x[index - 1];
		}else {
			return 0;
		}
	}
}