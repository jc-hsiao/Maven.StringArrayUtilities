package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean flag = false;
        for(int i=0; i<array.length ; i++){
            if(array[i].equals(value))
                flag = true;
        }
        return flag;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] array2 = new String[array.length];
        int j = array.length;
        for(int i=0; i<array.length; i++){
            array2[j-1] = array[i];
            j--;
        }
        return array2;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean flag = true;
        int j = array.length;
        int mid = array.length/2 ;

        for(int i = 0; i<mid; i++){
            if(!array[i].equals(array[j-1])){
                flag=false;
            }
            j--;
        }
        return flag;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String all = "";
        for(int i=0; i<array.length;i++) {
            all += array[i];
        }
        return all.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0 ; i<array.length; i++){
            if(array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int n = array.length - getNumberOfOccurrences(array, valueToRemove);
        String[] array2 = new String[n];
        int j = 0;
        for(int i=0; i<array.length; i++){
            if(array[i].equals(valueToRemove)){
                continue;
            }
            array2[j++] = array[i];
        }
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> a = new ArrayList<>();
        String temp = array[0];
        a.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(temp)){
                a.add(array[i]);
                temp = array[i];
            }
        }
        return a.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> a = new ArrayList<>();
        String temp = array[0];
        a.add(array[0]);
        int counter = 0;
        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(temp)){
                temp = array[i];
                a.add(array[i]);
                counter++;
            }else{
                a.set(counter, a.get(counter)+temp);
            }
        }
        return a.toArray(new String[0]);
    }


}
