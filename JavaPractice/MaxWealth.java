package JavaPractice;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 5, 6},
                {6, 6, 4},
                {5, 10, 2}
        };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
                if (sum > ans){
                    ans = sum;
                }
            }

        }
        return ans;
    }
}


