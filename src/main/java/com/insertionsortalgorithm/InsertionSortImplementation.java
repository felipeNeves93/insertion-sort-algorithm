package com.insertionsortalgorithm;


public class InsertionSortImplementation {

  /**
   * The implementation of the insertion sort algorithm
   *
   * @param arr        The Array to be sorted
   * @param descending If the array should be ordered by descending order. Default ascending order
   */
  public static void sort(int[] arr, boolean descending) {

    for (int i = 1; i < arr.length; i++) {
      var currentElement = arr[i];
      var previousIndex = i - 1;

      if(descending) {
        while (previousIndex >= 0 && currentElement >= arr[previousIndex]) {
          arr[previousIndex + 1] = arr[previousIndex];
          arr[previousIndex] = currentElement;

          previousIndex--;
        }
      } else {
        while (previousIndex >= 0 && currentElement <= arr[previousIndex]) {
          arr[previousIndex + 1] = arr[previousIndex];
          arr[previousIndex] = currentElement;

          previousIndex--;
        }
      }
    }
  }
}

