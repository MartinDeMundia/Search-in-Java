//Interpolation search is an algorithm for searching for a given key in an indexed array
//that has been ordered by numerical values assigned to the keys (key values).
public class Binary_Search_Interpolation {
    private static int[] sorted = null;
    // Assuming the array is sorted
    public static int find(int value, int[] array) {
        Binary_Search_Interpolation.sorted = array;
        try {
            return recursiveFind(value, 0, Binary_Search_Interpolation.sorted.length - 1);
        } finally {
            Binary_Search_Interpolation.sorted = null;
        }
    }
    private static int recursiveFind(int value, int start, int end) {
        if (start == end) {
            int lastValue = sorted[start]; // start==end
            if (value == lastValue)
                return start; // start==end
            return Integer.MAX_VALUE;
        }

        final int mid = start + ((value - sorted[start]) * (end - start)) / (sorted[end] - sorted[start]);
        if (mid < 0 || mid > end)
            return Integer.MAX_VALUE;
        int midValue = sorted[mid];
        if (value == midValue)
            return mid;
        if (value > midValue)
            return recursiveFind(value, mid + 1, end);
        return recursiveFind(value, start, mid - 1);
    }
    public static void main(String[] args) {
        int[] integers = {10,20,30,40,50,60,70,80,90,100};
        //the element that should be found
        int key = 100;
        int atIndex = find(key, integers);

        System.out.println("Remember array index starts from 0");
        System.out.println("The size of the array is : " + integers.length);
        System.out.println("The element found at index : " + atIndex);
    }
}
