/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Asus
 */
public class BinarySearch {
    
    int binarySearch(int array[], int findingValue, int low, int high) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {
      int mid = low + (high - low) / 2;
      

      if (array[mid] == findingValue)
        return mid;

      if (array[mid] < findingValue)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Binary Search in Java
      BinarySearch ob = new BinarySearch();
    int array[] = { 3, 44, 56, 69, 71, 80, 91 };
    int n = array.length;
    int x = 3;
    int result = ob.binarySearch(array, x, 0, n - 1);
    // SUSU = 3
    // JAMU = 44
    // JAHE = 56
    // FRUTI = 69
    // TEH PUCUK = 71
    // TEH BOTOL = 80
    // TEH KOTAK = 91
    if (result == 0)
      System.out.println("SUSU");
    else if (result == 1)
      System.out.println("JAMU");
    else if (result == 2)
      System.out.println("JAHE");
    else if (result == 3)
      System.out.println("FRUTI");
    else if (result == 4)
      System.out.println("TEH PUCUK");
    else if (result == 5)
      System.out.println("TEH BOTOL");
    else if (result == 6)
      System.out.println("TEH KOTAK");
    else if (result == -1)
      System.out.println("barang yang anda cari tidak ada");
  }  
}

