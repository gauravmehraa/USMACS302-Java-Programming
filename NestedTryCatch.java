public class NestedTryCatch{
	public static void main(String args[]){
		try{
			int[] arr = {1, 2, 3};
			try{
				int n = arr[5];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inner catch");
			}
		}
		catch(Exception e){
			System.out.println("Outer catch");
		}
	}
}