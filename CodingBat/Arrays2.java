//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public int countEvens(int[] nums) {
    int count = 0;
    for(int i = 0; i<nums.length; i++){
      if(nums[i]%2 == 0) count++;
    }
    return count;
  }

//Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
//Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

public int bigDiff(int[] nums) {
    if(nums.length == 0) return 0;
    int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    for(int i = 0; i<nums.length; i++){
      largest = Math.max(largest, nums[i]);
      smallest = Math.min(smallest, nums[i]);
    }
    return largest-smallest;
  }

//Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring 
//the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, 
//and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

public int centeredAverage(int[] nums) {
    int n = nums.length-2;
    Arrays.sort(nums);
    int sum = 0 ;
    for(int i = 1 ; i< nums.length-1; i++){
      sum+=nums[i];
    }
    return sum/n;
  }

  //Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count 
  //and numbers that come immediately after a 13 also do not count.

  public int sum13(int[] nums) {
    if(nums.length == 0) return 0;
    int sum = 0;
    for(int i = 0; i< nums.length; i++){
      if(nums[i] == 13){
        i++;
      }else{
        sum += nums[i];
      }
    }
    return sum;
  }
  
  //Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
  //Return 0 for no numbers.
  
  public int sum67(int[] nums) {
    int sum = 0;
    boolean flag= true;
    for(int i = 0; i< nums.length; i++){
      if(nums[i] == 6 ) flag = false;
      if(nums[i] == 7 && flag==false) {
          flag = true;
          continue;
      }
      if(flag) sum += nums[i];
    }  
    return sum;
  }
  