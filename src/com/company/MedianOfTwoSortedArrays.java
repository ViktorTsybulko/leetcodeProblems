package com.company;
/*
* Given two sorted arrays nums1 and nums2 of size m and n respectively,
* return the median of the two sorted arrays.
* The overall run time complexity should be O(log (m+n)).
*
* Example 1:
*
* Input: nums1 = [1,3], nums2 = [2]
* Output: 2.00000
* Explanation: merged array = [1,2,3] and median is 2.
*
* Example 2:
*
* Input: nums1 = [1,2], nums2 = [3,4]
* Output: 2.50000
* Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
* */

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        System.out.println(m.findMedianSortedArrays(new int[] {1, 2}, new int[] {4, 5}));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] array = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while ((i < nums1.length) && (j < nums2.length)) {
            array[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < nums1.length) {
            array[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            array[k++] = nums2[j++];
        }

        if (array.length % 2 == 0) {
            return ((double)array[array.length / 2] + (double)array[array.length/2 - 1]) / 2;
        } else {
            return array[array.length / 2];
        }
    }
}
