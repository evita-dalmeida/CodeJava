//When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
//Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
//Return true if the party with the given values is successful, or false otherwise.

public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend && cigars>40)
        return true;
    return cigars>=40 && cigars<=60;
  }

//You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
//The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). 
//With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

public int dateFashion(int you, int date) {
  if((you>=8  || date>=8) && (you>2 && date>2))
    return 2;
  if(you<=2 || date<=2)
    return 0;
  return 1;
}
//The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, 
//then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

public boolean squirrelPlay(int temp, boolean isSummer) {
  int low = 60 ,high = 90;
  if(isSummer)
    high = 100;
  return (low<=temp && temp<=high);
}

//You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
//If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday)
    speed = speed-5;
  if(speed<= 60)
    return 0;
  if(speed>=61 && speed <= 80)
    return 1;
  if(speed>= 81)
    return 2;
  return -1;    
}

//Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

public int sortaSum(int a, int b) {
  int sum = a+b;
  if(sum>= 10 && sum<=19)
    return 20;
  return sum;
}

//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. 
//Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

public String alarmClock(int day, boolean vacation) {
  String alarm = "7:00";
  if(day<1 || day>5)
    alarm = "10:00";
  if(vacation)
    if(day<1 || day>5){
      alarm = "off";
    }else{
      alarm = "10:00";
    }
  return alarm;
}

//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. 
//Note: the function Math.abs(num) computes the absolute value of a number.

public boolean love6(int a, int b) {
  return (a==6 || b==6) || (a+b == 6 || Math.abs(a-b) == 6);
}

//Given a number n, return true if n is in the range 1..10, inclusive. 
//Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

public boolean in1To10(int n, boolean outsideMode) {
  if(n>=1 && n<=10)
    return true;
  return(outsideMode && (n<=1 || n>=10));
}

//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
//Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

public boolean specialEleven(int n) {
  return n%11 == 0 || n%11 == 1;
}

//Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also

public boolean more20(int n) {
  return n%20 == 1 || n%20 == 2;
}

//Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator

public boolean old35(int n) {
  if(n%3 ==0 && n%5 == 0)
    return false;
  return n%3 ==0 || n%5 == 0;
}

//Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
