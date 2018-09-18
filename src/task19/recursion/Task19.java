package task19.recursion;

public class Task19 {

	public static void main(String[] args) {
		
		Task19 task = new Task19();
		System.out.println(task.recursion(15));
		
	}
	
	public long recursion(long n) {
		
		if(n>1) {
			return n*recursion(n-1);
		}
		else {
			return n;
		}
	}
	
}
