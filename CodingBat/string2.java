//Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
    StringBuilder sb = new StringBuilder();
    for(char c : str.toCharArray()){
      sb.append(c);
      sb.append(c);
    }
    return sb.toString();
  }

//Return the number of times that the string "hi" appears anywhere in the given string.
public int countHi(String str) {
    int count = 0;
    for(int i = 0 ; i <str.length()-1; i++){
      if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
      count++;
    }
    return count;
  }

  //Return true if the string "cat" and "dog" appear the same number of times in the given string.

  public boolean catDog(String str) {
    int count =0;
    for(int i=0;i<str.length()-2;i++){
      if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't')
        count++;
      if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g')
      count--;
    }
    if(count == 0)
      return true;
    return false;
  }

  //Return the number of times that the string "code" appears anywhere in the given string, 
  //except we'll accept any letter for the 'd', so "cope" and "cooe" count.
  
  public int countCode(String str) {
    int count = 0;
    for(int i=0;i<str.length()-3;i++){
      if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3)== 'e')
        count++;
    }
    return count;
  }
  
//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public boolean xyzThere(String str) {
    int index = str.lastIndexOf("xyz");
    if(index == 0)
      return true;
    return index>0 && str.charAt(index-1)!='.';
  }

//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

public boolean bobThere(String str) {
    for(int i = 0; i< str.length()-2; i++){
      if(str.charAt(i) == 'b' && str.charAt(i+2)=='b')
      return true;
    }
    return false;
  }

//We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. 
//So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

