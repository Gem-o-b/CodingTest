package src.exam.mega.num3;

import java.util.Arrays;

class Solution {
    public int solution(String road, int n) {
        int length = road.length();
        int[] damaged = new int[length];
        int[] normal = new int[length];

        // 도로의 손상된 부분과 정상적인 부분을 나누어 저장합니다.
        for (int i = 0; i < length; i++) {
            if (road.charAt(i) == '0') {
                damaged[i] = 1;
            } else {
                normal[i] = 1;
            }
        }

        // 최대 3개의 0을 1로 바꿔서 만들 수 있는 모든 경우의 정상 도로 구간의 길이를 구합니다.
        int max = 0;
        for (int i = 0; i <= n; i++) {
            int j = n - i;
            if (i > length || j > length) {
                continue;
            }
            int[] repaired = Arrays.copyOf(damaged, length);
            for (int k = 0; k < length; k++) {
                if (repaired[k] == 1 && i > 0) {
                    repaired[k] = 0;
                    i--;
                } else if (repaired[k] == 1 && j > 0) {
                    j--;
                }
                if (i == 0 && j == 0) {
                    break;
                }
            }
            int[] combined = new int[length];
            for (int k = 0; k < length; k++) {
                combined[k] = normal[k] + repaired[k];
            }
            int lengthOfRoad = findMaxLengthOfNormalRoad(combined);
            if (lengthOfRoad > max) {
                max = lengthOfRoad;
            }
        }

        return max;
    }

    // 주어진 도로에서 연속된 정상 도로 구간 중 가장 긴 구간의 길이를 반환하는 메서드입니다.
    private int findMaxLengthOfNormalRoad(int[] road) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < road.length; i++) {
            if (road[i] == 1) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        return maxLength;
    }
}


public class Main {
    public static void main(String[] args) {
        String road = "001100";
        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.solution(road, n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}