//Given a list of integers, return a list of the integers, omitting any that are less than 0.
/* In Place */

public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf(num -> num<0);
    return nums;
  }
  
    // public List<Integer> noNeg(List<Integer> nums) {
    //     List<Integer> list = new ArrayList<>();
    //     for(int num : nums)
    //       if(num>=0) list.add(num);
    //     return list;
    //   }

//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

public List<Integer> no9(List<Integer> nums) {
    nums.removeIf((num -> num%10 == 9));
    return nums;
    }

//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf(num -> num>=13 && num<=19);
    return nums;
  }
  
      