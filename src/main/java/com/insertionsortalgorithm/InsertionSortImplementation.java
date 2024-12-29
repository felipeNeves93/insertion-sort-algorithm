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
      // mem copy of the current element
      var currentElement = arr[i];

      var previousIndex = i - 1;

      // Sort in descending order
      if(descending) {
        // Check if there are still elements left in array before the current element, and if the current element is greater than the previous one,
        // Move to the left until there are no more elements in the array or current element < previous element
        while (previousIndex >= 0 && currentElement >= arr[previousIndex]) {
          arr[previousIndex + 1] = arr[previousIndex];
          arr[previousIndex] = currentElement;

          previousIndex--;
        }
        // Sort in ascending order
      } else {
        // Check if there are still elements left in array before the current element, and if the current element is lower than the previous one,
        // Move to the left until there are no more elements in the array or current element > previous element
        while (previousIndex >= 0 && currentElement <= arr[previousIndex]) {
          arr[previousIndex + 1] = arr[previousIndex];
          arr[previousIndex] = currentElement;

          previousIndex--;
        }
      }
    }
  }
}

