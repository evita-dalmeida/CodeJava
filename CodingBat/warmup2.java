// Given a string and a non-negative int n, return a larger string that is n copies of the original string.

public String stringTimes(String str, int n) {
  StringBuilder sb = new StringBuilder();
  while(n!=0){
    sb.append(str);
    n--;
  }
  return sb.toString();
}
//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//or whatever is there if the string is less than length 3. Return n copies of the front;

public String frontTimes(String str, int n) {
  StringBuilder sb = new StringBuilder();
  if(str.length()>=3)
    str = str.substring(0,3);
  
  while(n!=0){
    sb.append(str);
    n--;
  }
  return sb.toString();
}
//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
int countXX(String str) {
  int count = 0;
  for(int i=0;i<str.length()-1;i++){
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
      count++;
    }
  }
  return count;
}

// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
boolean doubleX(String str) {
  for(int i =0;i<str.length()-1;i++){
    if (str.charAt(i)== 'x' && str.charAt(i+1)== 'x'){
      return true;
    }else if(str.charAt(i) == 'x' && str.charAt(i+1) != 'x'){
      return false;
    }
  }
  return false;
}

//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
public String stringBits(String str) {
  StringBuilder sb = new StringBuilder();
  for(int i=0;i<str.length();i+=2){
    sb.append(str.charAt(i));
  }
  return sb.toString();
}

//Given a non-empty string like "Code" return a string like "CCoCodCode".
public String stringSplosion(String str) {
  StringBuilder sb = new StringBuilder();
   for (int i=0; i<str.length(); i++) {
    sb = sb.append(str.substring(0, i+1));
  }
  return sb.toString();
  /*
  StringBuilder sb = new StringBuilder();
   for (int i=0; i<str.length(); i++) {
    sb = sb + str.substring(0, i+1);
  }
  return sb.toString();
  */
}

//Given a string, return the count of the number of times that a substring length 2
// appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


//Given an array of ints, return the number of 9's in the array.
public int arrayCount9(int[] nums) {
  int count=0;
  for(int i = 0;i<nums.length;i++){
    if(nums[i] == 9) count++;
  }
  return count++;
}

//Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
public boolean arrayFront9(int[] nums) {
  int n = nums.length;
  n = n<4?n:4;
  for(int i=0;i<n;i++){
    if(nums[i] == 9)return true;
  }
  return false;
}

//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
public boolean array123(int[] nums) {
  for(int i=0;i<nums.length-2;i++){
    if(nums[i] ==1 && nums[i+1] ==2 && nums[i+2] == 3){
      return true;
    }
  }
  return false;
}

//Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
// So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
public int stringMatch(String a, String b) {
  int count=0;
  int minLen = Math.min(a.length(),b.length());
  for(int i = 0; i<minLen-1; i++){
    // (a.substring(i,i+2)).equals(b.substring(i,i+2));
    if(a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1))
      count++;
  }
  return count;
}

//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
public String stringX(String str) {
  StringBuilder sb = new StringBuilder();
  for(int i=0;i<str.length();i++){
    if(i==0 || i== str.length()-1 || str.charAt(i)!='x'){
      sb.append(str.charAt(i));
    }
  }
  return sb.toString();
}

//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
public String altPairs(String str) {
  StringBuilder sb = new StringBuilder();
  int i = 0;
  while(i<str.length()){
    sb.append(str.charAt(i));
   if(i+1<str.length()) 
      sb.append(str.charAt(i+1));
    else
      break;
    i +=4;
  }
  return sb.toString();
}

//Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, 
//but the "a" can be any char. The "yak" strings will not overlap.
public String stringYak(String str) {
  return str.replaceAll("yak","");
  /*boolean notValid = true;
  while(notValid){
    int i = str.indexOf("yak");
    if(i>0){
      str = str.substring(0,i) + str.substring(i+3);
    }else{
      notValid = false;
    }
  }
  return str;*/
}

//Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
public int array667(int[] nums) {
  int count=0;
  for(int i=0;i<nums.length-1;i++){
   if(nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7)
    count++;
  } 
  return count;
}
//Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
public boolean noTriples(int[] nums) {
  for(int i =0;i<nums.length-2;i++){
    if(nums[i] == nums[i+1]){
      if(nums[i] == nums[i+2])
        return false;
    }
  }
  return true;
}

//Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. 
//Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
public boolean has271(int[] nums) {
  for(int i=0;i<nums.length-2;i++){
    if( nums[i+1] == nums[i]+5 && Math.abs(nums[i+2] - (nums[i]-1)) <= 2) 
      return true;
  }
  return false;
}
