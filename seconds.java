//WAP to convert a given integer to hours, minutes and seconds.

import java.util.*;
class seconds
{
public static void main(String[] args)
{
int h,rem,m;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of seconds.");
int s = sc.nextInt();
h = s/3600;
rem = s%3600;
m = rem/60;
rem = rem%60;
System.out.println("Hours = "+h);
System.out.println("Minutes = "+m);
System.out.println("Seconds = "+rem);
}
}	