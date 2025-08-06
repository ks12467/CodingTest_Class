package ch01.solution05;

public class Solution05 {
    // 배열 출력을 위한 유틸리티 메서드
    public static void countingSort(int[] arr) {
        // 1. 최댓값 찾기 - O(N)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 2. 카운팅 배열 생성 및 초기화
        int[] counts = new int[max + 1];

        // 3. 숫자 세기 - O(N)
        for (int num : arr) {
            counts[num]++;
        }

        // 4. 결과 배열 생성
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (counts[i] > 0) {
                arr[index] = i;
                index++;
                counts[i]--;
            }
        }
    }

    // 배열 출력을 위한 유틸리티 메서드
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 예시 배열 [4, 1, 3, 1, 2]로 테스트
        int[] arr = {4, 1, 3, 1, 2};

        System.out.println("정렬 전 배열:");
        printArray(arr);

        // 계수 정렬 수행
        countingSort(arr);

        System.out.println("정렬 후 배열:");
        printArray(arr);
    }
}