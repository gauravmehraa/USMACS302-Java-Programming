import java.util.*;

public class SmallestLargest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[], largest, smallest;
		arr = new int[10];
		for(int i = 0; i < 10; i++){
			System.out.print("Enter a number: ");
			arr[i] = sc.nextInt();
		}
		largest = arr[0];
		smallest = arr[0];
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i]+" ");
			if(arr[i] > largest) largest = arr[i];
			if(arr[i] < smallest) smallest = arr[i];
		}
		System.out.println("\nLargest element: "+largest);
		System.out.println("Smallest element: "+smallest);
	}
}