import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]<arr[j]){// if you put greater than syb=mbol it will print ascending order
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	    }
	}
}
