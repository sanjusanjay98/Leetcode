import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    hs.add(nums1[i]);
                }
            }
        }
        
        int[] result = new int[hs.size()];
        int index = 0;
        for (Integer num : hs) {
            result[index++] = num;
        }
        return result;
    }
}
