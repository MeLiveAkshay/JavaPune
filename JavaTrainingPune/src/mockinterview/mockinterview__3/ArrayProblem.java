package mockinterview.mockinterview__3;

public class ArrayProblem {
	public static void main(String[] args) {
		int [] array= {11,22,33,44};
		
		
		for(int i =0;i<array.length;i++) {
			
			int lastNumber=array[i]%10;
			int firstNumber=array[i]/10;
			int sum= firstNumber+lastNumber;
			System.out.print(sum +" ");
		}
	}
}
