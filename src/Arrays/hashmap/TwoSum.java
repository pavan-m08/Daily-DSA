// TWO PONTERS
/*You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/
package Arrays.hashmap;
import java.util.*;

class Solution {
    public int[] sum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(required)) {
                int[] arr= {map.get(required), i};
                return arr;
            }
            map.put(nums[i], i);
        }

        return null;
    }
}

public class TwoSum {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array");
    int n=sc.nextInt();
    int[] nums=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    System.out.print("Enter the target");
    int target=sc.nextInt();
    Solution s=new Solution();
    int[] ans=s.sum(nums,target);

    System.out.println(Arrays.toString(ans));
}

        
    }
    

