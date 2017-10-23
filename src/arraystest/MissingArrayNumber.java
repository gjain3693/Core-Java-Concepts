package arraystest;

public class MissingArrayNumber {
	
	
	public int sumOfNumbers(int n) {
		
		int sum = (n*(n+1))/2;
		return sum;
		
	}
	
	public int sumOfElements(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int arr[]={1,2,5,4,6,7};
		MissingArrayNumber obj = new MissingArrayNumber();
		int sumOfEle = obj.sumOfElements(arr);
		int sumOfNum = obj.sumOfNumbers(7);
		
		int missingNum = sumOfNum - sumOfEle;
		
		System.out.println(missingNum);
		
	}

}
