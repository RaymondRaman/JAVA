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

