/**
 * Problem: #278 First Bad Version
 *
 * Idea: brute force will exceed time limit, binary search is able to solve.
 *
 * Solutions:
 *  firstBadVersion: uses binary search, but StackOverflowError occurs.
 *  firstBadVersion2: standard binary search, efficient.
 *
 * Note: #canbefaster
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion {
    public int binarySearch(int left, int right) {
        int middle = left + (right-left)/2; // (left + right)/2 may cause StackOverflowError

        if (isBadVersion(middle)) {
            if (!isBadVersion(middle - 1)) {
                return middle;
            } else {
                return binarySearch(left, middle-1);
            }
        } else {
            return binarySearch(middle + 1, right);
        }
    }

    public int binarySearch2(int left, int right) {
        while (left < right) {
            int middle = left + (right-left)/2;
            if (isBadVersion(middle)) {
                right = middle;// might or might not be the one, so without -1
            } else {
                left = middle + 1; // definitely not the one, therefore +1
            }
        }
        return left;
    }

    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    public int firstBadVersion2(int n) {
        return binarySearch2(1, n);
    }

    private boolean isBadVersion(int n) {
        if (n >= 342354) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(34252345));
        System.out.println(new FirstBadVersion().firstBadVersion2(34252345));
    }
}
