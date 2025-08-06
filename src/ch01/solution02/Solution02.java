package ch01.solution02;

import java.util.Arrays;

public class Solution02 {

    public static void main(String[] args) {
        // 테스트를 위한 예제 배열과 목표 합 설정
        int[] arr = {4, 1, 8, 7, 3, 2};  // 정렬되지 않은 배열
        int target = 10;  // 찾고자 하는 합

        // 투 포인터 탐색 수행 및 결과 출력
        System.out.println("원본 배열: " + Arrays.toString(arr));
        System.out.println("목표 합: " + target);
        boolean result = findTwoSum(arr, target);
        System.out.println("합이 " + target + "이 되는 두 수가 " +
                (result ? "존재합니다." : "존재하지 않습니다."));
    }

    private static boolean findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println(arr[left] +", "+ arr[right]);
                return true;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}