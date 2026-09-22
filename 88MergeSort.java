class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;          // last valid element in nums1
        int p2 = n - 1;          // last element in nums2
        int p = m + n - 1;       // last index of nums1 (write target)

        // Compare from the end and write the larger element to nums1[p]
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy any remaining elements from nums2 into nums1
        // (If nums1 has elements left, they are already in place)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
