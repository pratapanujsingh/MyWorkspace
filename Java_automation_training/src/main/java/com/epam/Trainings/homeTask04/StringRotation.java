package com.epam.Trainings.homeTask04;

class StringRotation
{

	static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main (String[] args)
    {
        String str1 = "radar";
        String str2 = "adarr";
  
        if (areRotations(str1, str2))
            System.out.println("YES, Strings are rotations of each other");
        else
            System.out.printf("NO, Strings are not rotations of each other");
    }
}