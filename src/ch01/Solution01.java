package ch01;

public class Solution01 {

    static int cnt = 0;

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        cnt = 0;

        int result = binarySearch(arr, target);
        if(result != -1) {
            System.out.println("찾는 위치" + result);
            System.out.println("검색 횟수" + cnt);
        } else {
            System.out.println("값을 찾지 못했습니다.");
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            cnt++;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }
        return -1;
    }
}