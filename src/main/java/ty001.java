/**
 * 排序好的array. Binary Search移动start和end，核查sum。
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * <p>
 * The function findTwoAddendIdx should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p>
 * Tags: Array Two Pointers, Binary Search
 * Similar Problems: (M) Two Sum
 * <p>
 * Thoughts:bb
 * Do a binary search, but do not over-complicate it:
 * Start, end. Check if nums[start] + nums[end] == target.
 * binary move it: in fact, moving the two border, 1 position at a time
 */
public class ty001 {

    public static void main(String[] args) {
        int[] src = {2, 7, 11, 15};
        int target = 26;
        int[] result = new ty001().findTwoAddendIdx(src, target);
        for (int i : result)
            System.out.println(i);

    }

    public int[] findTwoAddendIdx(int[] nums, int target) {
        int[] rst = new int[2];
        if (nums == null || nums.length <= 1) {
            return rst;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            long sum = (long) (nums[start] + nums[end]);
            if (target == sum) {
                rst[0] = start + 1;
                rst[1] = end + 1;
                break;
            } else if (target > sum) {
                start++;
            } else {
                end--;
            }
        }//END while
        return rst;
    }
}