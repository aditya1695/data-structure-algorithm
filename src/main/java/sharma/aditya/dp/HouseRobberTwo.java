package sharma.aditya.dp;

public class HouseRobberTwo {

    public static void main(String[] args) {
        int [] houses = {2,3,2};
        int ignoreFirstHouse = findMaxLoot(houses, 1, houses.length - 1);
        int ignoreLastHouse = findMaxLoot(houses, 0, houses.length - 2);
        System.out.println("Maximum Loot: " +Math.max(ignoreFirstHouse, ignoreLastHouse));
    }

    private static int findMaxLoot(int[] houses, int start, int end) {
        int prevOne = houses[start];
        int prevTwo = 0;
        int answer = prevOne;
        for(int i = start + 1; i <= end; i++){
            int include = prevTwo + houses[i];
            int exclude = prevOne;
            answer = Math.max(include, exclude);
            prevTwo = prevOne;
            prevOne = answer;
        }
        return answer;
    }
}
