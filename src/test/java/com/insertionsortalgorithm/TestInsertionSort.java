package com.insertionsortalgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestInsertionSort {

  @DisplayName("Should order array in ascending order")
  @Test
  void shouldOrderArrayInAscendingOrder() {

    // Given
    int[] arr = {7, 2, 4, 9, 1};

    // Then
    InsertionSortImplementation.sort(arr, false);

    // Should return in order 1-2-4-7-9
    Assertions.assertEquals(1, arr[0]);
    Assertions.assertEquals(2, arr[1]);
    Assertions.assertEquals(4, arr[2]);
    Assertions.assertEquals(7, arr[3]);
    Assertions.assertEquals(9, arr[4]);
  }

  @DisplayName("Should order array in descending order")
  @Test
  void shouldOrderArrayInDescendingOrder() {

    // Given
    int[] arr = {7, 2, 4, 9, 1};

    // Then
    InsertionSortImplementation.sort(arr, true);

    // Should return in order 9-7-4-2-1
    Assertions.assertEquals(9, arr[0]);
    Assertions.assertEquals(7, arr[1]);
    Assertions.assertEquals(4, arr[2]);
    Assertions.assertEquals(2, arr[3]);
    Assertions.assertEquals(1, arr[4]);
  }
}

