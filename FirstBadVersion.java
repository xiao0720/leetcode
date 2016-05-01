/**
 * Problem: #278 First Bad Version
 *
 * Idea:
 *
 * Solutions:
 *  firstBadVersion: uses basic binary search, but StackOverflowError occurs.
 *
 * Note: #canbefaster
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion {
    public int binarySearch(int left, int right) {
        int middle = left + (right-left)/2;

        if (isBadVersion(middle)  == true) {
            if (!isBadVersion(middle - 1)) {
                return middle;
            } else {
                return binarySearch(left, middle-1);
            }
        }

        if (!isBadVersion(middle)) {
            return binarySearch(middle + 1, right);
        }

        return -1;
    }

    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    private boolean isBadVersion(int n) {
        if (n >= 1702766719) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(2126753390));
    }
}
