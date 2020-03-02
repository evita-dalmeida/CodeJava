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

//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, 
//the second char of b, and so on. Any leftover chars go at the end of the result.

public String mixString(String a, String b) {
  StringBuilder sb = new StringBuilder();
  int i=0, j=0;
  for(; i<Math.min(a.length(), b.length());i++, j++){
    sb.append(a.charAt(i));
    sb.append(b.charAt(j));
  }
  while(j!=b.length()){
    sb.append(b.charAt(j));
    j++;
  }
  while(i!=a.length()){
    sb.append(a.charAt(i));
    i++;
  }
  return sb.toString();
}

//Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

public String repeatEnd(String str, int n) {
  int i =0;
  StringBuilder sb = new StringBuilder();
  String s = str.substring(str.length()-n);
  while(i!=n){
    sb.append(s);
    i++;
  }
  return sb.toString();
}

//Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. 
//You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

public String repeatFront(String str, int n) {
  int i =0;
  StringBuilder sb = new StringBuilder();
  while(i!=n){
    sb.append(str.substring(0,n-i));
    i++;
  }
  return sb.toString();
}

//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
