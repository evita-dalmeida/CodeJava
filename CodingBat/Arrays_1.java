//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

public boolean firstLast6(int[] nums) {
  
    if(nums[0]==6) return true;
    if(nums[nums.length-1] == 6) return true;
    return false;
  }

//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

public boolean sameFirstLast(int[] nums) {
  if(nums.length>=1 && nums[0] == nums[nums.length-1]) return true;
  return false;
}

//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

public int[] makePi() {
  return new int[]{3, 1, 4};
}

//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

public boolean commonEnd(int[] a, int[] b) {
  return(a[0] == b[0] || a[a.length-1] == b[b.length-1]);
}

//Given an array of ints length 3, return the sum of all the elements.

public int sum3(int[] nums) {
  int sum = 0;
  for(int n : nums)
    sum += n;
  return sum;
}

//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

public int[] rotateLeft3(int[] nums) {
  int start = nums[0];
  for(int i =1;i<nums.length;i++){
    nums[i-1] = nums[i];
  }
  nums[nums.length-1] = start;
  return nums;
}

//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

public int[] reverse3(int[] nums) {
  int i = 0, j = nums.length-1;
  while(i<j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    i++;
    j--;
  }
  return nums;
}

//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

public int[] maxEnd3(int[] nums) {
  int largest = Math.max(nums[0],nums[nums.length-1]);
  Arrays.fill(nums,largest);
  //for(int i=0; i<nums.length;i++){}
  return nums;
}

//Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

public int sum2(int[] nums) {
  if(nums.length == 0) return 0;
  if(nums.length == 1) return nums[0];
  return nums[0] + nums[1];
}

//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

public int[] middleWay(int[] a, int[] b) {
  return new int[]{a[1],b[1]};
}

