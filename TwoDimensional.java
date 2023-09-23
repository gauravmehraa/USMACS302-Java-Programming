import java.util.*;

public class TwoDimensional{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows for array 1: ");
		int rows = sc.nextInt();
		System.out.print("Enter no. of columns for array 1: ");
		int cols = sc.nextInt();
		int arr1[][] = new int[rows][cols];
		int arr2[][] = new int[rows][cols];

		for(int a = 1; a <= 2; a++){
			System.out.println("Array "+a);
			for(int i = 0; i < rows; i++){
				for(int j = 0; j < cols; j++){
					System.out.print("Enter no. for row "+(i+1));
					System.out.print(" column "+(j+1)+": ");
					if(a == 1) arr1[i][j] = sc.nextInt();
					if(a == 2) arr2[i][j] = sc.nextInt();
				}
			}
		}
		Operations obj = new Operations();
		obj.addition(arr1, arr2);
		obj.multiplication(arr1, arr2);
		obj.transpose(arr1);
	}
}

class Operations{
	static void addition(int arr1[][], int arr2[][]){
		int rows = arr1.length;
		int cols = arr1[0].length;
		int s[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				s[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		display(s);
	}
	static void multiplication(int arr1[][], int arr2[][]){
		int rows = arr1.length;
		int cols = arr1[0].length;
		int p[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				p[i][j]=0;      
				for(int k=0;k<3;k++){      
					p[i][j] += arr1[i][k] * arr2[k][j];      
				}
			}
		}
		display(p);
	}
	static void transpose(int arr[][]){
		int rows = arr.length;
		int cols = arr[0].length;
		int t[][] = new int[cols][rows];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				t[i][j] = arr[j][i];
			}
		}
		display(t);
	}
	static void display(int arr[][]){
		int r = arr.length;
		int c = arr[0].length;
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}