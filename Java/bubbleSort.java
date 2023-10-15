import java.util.*;
public class Sorting{
    public static void printArray(int arr[],int n){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void bubbleSort(int arr[],int n){
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter the array size: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element of array: ");
		for(int i = 0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		bubbleSort(arr,n);
		printArray(arr,n);
	}
}
