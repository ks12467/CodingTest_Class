package ch01.solution03;

import java.util.Arrays;

public class Solution03 {
    
    public static void main(String[] args) {
        // 테스트를 위한 예제 배열과 목표 합 설정
        int[] arr = {1, 2, 3, 1, 2};  // 예시 배열
        int target = 3;         // 목표값

        // 입력 데이터 출력
        System.out.println("원본 배열: " + Arrays.toString(arr));
        System.out.println("목표 합: " + target);

        // 결과 계산 및 출력
        int result = findExactSum(arr, target);
        System.out.println("합이 정확히 " + target + "인 연속된 구간의 개수: " + result);

        // 모든 가능한 구간 출력 (설명을 위한 추가 코드)
        System.out.println("\n만족하는 구간들:");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1))
                            + " (합: " + sum + ")");
                }
            }
        }
    }

    private static int findExactSum(int[] arr, int target) {
        int start = 0;
        int end = 1;

        int currentSum = arr[0];

        int count = 0;

        while (start < arr.length) {
            if(currentSum == target) {
                count++;

                if(end < arr.length) {
                    currentSum += arr[end++];
                } else {
                    currentSum -= arr[start++];
                }
            } else if (end < arr.length && currentSum < target) {
                currentSum += arr[end++];
            } else {
                currentSum -= arr[start++];
            }
        }
        return count;
    }
}