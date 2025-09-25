import java.util.Scanner;

public class Maximum_Circular_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = sc.nextInt() ;
        }
        sc.close();

        int maxSum = MAX_kadanes_algo(nums) ;
        int total = 0 ; 
        for (int i = 0; i < nums.length; i++) {
            total += nums[i] ;    //  calculate the total sum 
            nums[i] = nums[i] * -1 ;
        }

        int minSum = MAX_kadanes_algo(nums) ;
        int circular = total + minSum ;
        if(maxSum < 0)
        {
            System.out.print(maxSum) ;
        }
        else{
            System.out.println(Math.max(maxSum, circular)); ;
        }
    }

    public static int MAX_kadanes_algo(int [] nums)
    {
        int ans = Integer.MIN_VALUE ;
        int sum = 0 ; 
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] ; 
            ans = Math.max(ans, sum) ;
            if(sum < 0)
            {
                sum = 0 ; 
            }
        }
        return ans ;
    }
}
