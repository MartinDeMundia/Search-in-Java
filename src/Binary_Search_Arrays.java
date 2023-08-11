import java.util.Arrays;
public class Binary_Search_Arrays {
    public int runBinarySearchUsingJavaArrays(int[] sortedArray, Integer key) {
        int index;
        index = Arrays.binarySearch(sortedArray, key);
        return index;
    }
    public static void main(String[] args) {
        int[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
        int key = 6;
        Binary_Search_Arrays binSearch = new Binary_Search_Arrays();
        int index1 = binSearch.runBinarySearchUsingJavaArrays(sortedArray, key);
        System.out.println("Search element found in location index : " + index1);
    }
}
