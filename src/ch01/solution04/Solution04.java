package ch01.solution04;

public class Solution04 {

    // 배열 출력을 위한 유틸리티 메서드
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 예시 배열 [5, 3, 8, 2]로 테스트
        int[] arr = {5, 3, 8, 2};

        System.out.println("정렬 전 배열:");
        printArray(arr);

        // 버블 정렬 수행
        bubbleSort(arr);

        System.out.println("정렬 후 배열:");
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n -i - 1; j++) {
                if(arr[j] > arr[j + 1] ){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}