import java.util.Scanner;
public class MoveZeros{
    // Brute force
    public static void moveZeros(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){

            int mover = i;
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] != 0){
                    mover = j;
                    break;
                }
            }
            if(mover != i){
            int temp = nums[i];
            nums[i] = nums[mover];
            nums[mover] = temp;
            }
          }
        }
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
           
        }
    }
    // Optimal Approach
    public static void moveZeros_Optimal(int[] nums){
        int write = 0;
        int read = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
            read++;
        }
          for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      int size = sc.nextInt();
      int[] nums = new int[size]; 
      for(int i = 0;i<nums.length;i++){
        nums[i] = sc.nextInt();
      }
      moveZeros(nums);
      System.out.println();
      moveZeros_Optimal(nums);
    }
}