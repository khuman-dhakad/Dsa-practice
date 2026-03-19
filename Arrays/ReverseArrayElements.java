import java.util.Scanner;
public class ReverseArrayElements{
  public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Size of an Array:");
    int size = sc.nextInt();
    //For size case handling
    if(size<=0){
            System.out.print("Enter Valid Size!");
            sc.close();
            return;
    }


    int []arr=new int[size];
    //For taking array input from user
    for(int i=0;i<arr.length;i++){
      System.out.print("Enter Element Number "+(i+1)+ " :");
      arr[i]=sc.nextInt();
    }

    int start = 0;
    int end = arr.length-1;

    
    //For reversing array elements
    while(start<end){
      int temp = arr[start];
      arr[start]=arr[end];
      arr[end]=temp;

      start++;
      end--;
    }
      System.out.print("Reverse Order of Array Is : ");
     //For print array element after reverse
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

    sc.close();
  }
}