// Given a Linked List, you are required to find the length of the list using recursion.
public static int lengthOfList(Node head) {
    if (head == null) {
      return 0;
    } else {
      return 1 + lengthOfList(head.next);
    }
}  

// Write a recursive method that computes the GCD of two integers.
// The Euclidean algorithm states that the GCD of num1 and num2 is the same as the GCD of num2 and the remainder of num1 divided by num2.
public static int gcd(int num1, int num2) {
    if (num2 == 0) {
        return num1;
    } else {
        return gcd(num2, num1 % num2);
    } 
}

// reversing a string (recursion)
public static String reverseString(String myStr) {
  if (myStr.isEmpty()) {
      return myStr;
  }
  else {
      // it takes the substring of the string from the 1st index using substring(1) until the end of that string.
      return reverseString(myStr.substring(1)) + myStr.charAt(0);
  }
}

// Removing Duplicates in a String
private static String remDuplicates(String text) {
    if (text.length() == 1) {
        return text;
    }

    if (text.substring(0,1).equals(text.substring(1,2))) {
        return remDuplicates(text.substring(1));
    }
    else {
        return text.substring(0,1) + remDuplicates(text.substring(1));
    }
}

// Permutations of a String
public static void permutations(char[] array, int length) {
    if (length == 1) {
        System.out.println(array);
        return;
    }
    else {
        for (int i = 0; i < length; i++) {
            swap(array, i, length-1);
            permutations(array, length-1);
            swap(array, i, length-1);
        }
    }
}  

public static void swap(char[] array, int i, int j) {
    char c;
    c = array[i]; 
    array[i] = array[j]; 
    array[j] = c;
}

// Sort an Array
class Solution {
    public static void sortArray(int[] array, int n) {
        if (n==1) {
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        sortArray(array, n-1);
    }
}

//  Search for a Value in a Linked List
class Solution {
    public static boolean search(Node head, int num) {
      if(head == null) {
        return false;
      } else {
          if (head.data == num) {
          return true;
        } else {
          return search(head.next, num);
        }
      }
    } 
}

