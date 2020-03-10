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

//Given an array of ints, return true if the array contains no 1's and no 3's

public boolean lucky13(int[] nums) {
  for(int n : nums){
    if(n == 1 || n == 3)
      return false;
  }
  return true;
}

//Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

public boolean sum28(int[] nums) {
  int sum =0;
  for(int n : nums)
    if(n == 2) sum +=n;
  return sum ==8;
}

//Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
  int ones = 0, fours = 0;
  for(int n : nums){
    if(n == 1) ones++;
    if(n == 4) fours++;
  }
  return ones > fours;
}

//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
//The given n may be 0, in which case just return a length 0 array. 
//You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. 
//The syntax to make a new int array is: new int[desired_length]

public int[] fizzArray(int n) {
  if (n == 0) return new int[0];
  int[] result = new int[n];
  for(int i = 0; i<n;i++)
    result[i] = i;
  return result;
}

//Given an array of ints, return true if every element is a 1 or a 4.


//Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. 
//Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]

public String[] fizzArray2(int n) {
  if(n == 0) return new String[0];
  String[] result = new String[n];
  for(int i = 0; i<n; i++){
    result[i] = String.valueOf(i);
  }
  return result;
}

//Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  int one = 0, four = 0; 
  for(int n : nums){
    if(n == 1 ) one++;
    if(n == 4) four++;
  }
  return one ==0 || four==0;
}

//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. 
//Return true if the given value is everywhere in the array.

public boolean isEverywhere(int[] nums, int val) {
  for(int i =0; i<nums.length-1;i++){
    if(nums[i] != val && nums[i + 1] != val)
            return false;
  }
  return true;
}

//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public boolean either24(int[] nums) {
  boolean has22 = false, has44 = false;
  for(int i =0; i<nums.length -1;i++){
    if(nums[i] == 2 && nums[i+1] ==2)
      has22 = true;
    if(nums[i] == 4 && nums[i+1] ==4)
      has44 = true;
  }
  return has22!=has44;
}
