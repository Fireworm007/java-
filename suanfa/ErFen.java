import java.util.Arrays;
//在有序数组中插入一个值，返回插入后的数组
public class erfen {

    public static void Insertelement(int[] arr, int num) {
        int left = 0;
        int right = arr.length-2;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] <= num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        for (int i = arr.length - 1; i > left; i--) {
            arr[i] = arr[i - 1];
        }
        arr[left] = num;
    }

    public static void main(String[] args) {
        int[] data = {1,3,5,7,9,13,0};//在原数组后加了一个0元素
        Insertelement(data, 4);
        System.out.println(Arrays.toString(data));
    }
}
