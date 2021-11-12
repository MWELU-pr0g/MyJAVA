import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mmutinda
 */
public class addArray {

    /**
     * @param args the command line arguments
     */
    
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
    public static void main(String args[]) {
        int[] otherList ={1,2,3,4,5};
       
//     ArrayList<Integer> arList = new ArrayList<Integer>();  
//     Integer[] otherList = new Integer[] {1, 2, 3, 4, 5};
//        arList.addAll(Arrays.asList(otherList));
        int target = 4;
        System.out.println(Arrays.toString(otherList));
        System.out.println(Arrays.toString(twoSum(otherList,target)));
        
        addArray.twoSum(otherList,target);
    }


}
