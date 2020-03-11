//Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). 
//We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. 
//(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

public int countYZ(String str) {
    str = str.toLowerCase();
    String[] words = str.split("[^a-z]");
    int count = 0;
    for(String word : words){
      if(word.endsWith("y") || word.endsWith("z"))
        count++;
    }
    return count;
  }

  //Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). 
  //You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

  public String withoutString(String base, String remove) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<base.length();i++){
      int j = 0;
      while(base.charAt(i) == remove.charAt(j)){
        j++;
      }
      if(j == remove.length())
          i = i+j;
      else
        sb.append(base.charAt(i));
    }
    return sb.toString();
  }
  