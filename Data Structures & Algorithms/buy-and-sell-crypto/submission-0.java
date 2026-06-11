class Solution {
    public int maxProfit(int[] prices) {
        int p1 = 0;
        int p2 = 1;
        int max = 0;

        if(prices.length<2){
            return 0;
        }

        while(p1<prices.length-1 && p2<prices.length){
            int potentialProfit = prices[p2]-prices[p1];

            if(prices[p2]<prices[p1]){
                p1=p2;
            } else if(potentialProfit>max){
                max = potentialProfit;
            }

            p2++;
        }

        return max;

    }
}

/*

[1,2,3,4,5,6]


[10,11,1,0,10,20]

Step 1
p1 - 10
p2 - 11
profit = 1

Step 2
p1 - 10
p2 - 1
profit = -9, less than 1, shift p1

Step 3
p1=11
p2=1
profit = -9

less than 1, shift p1, p1=p2 shift p2

Step 4
p1 = 1
p2 = 0

less than 1, shift p1, p1=p2 shift p2

Step 5
p1 = 0
p2 = 10
profit = 10

new max, shift p2

Step 6
p1 = 0
p2 = 20
profit = 20

p2 has reached end, move p1

Step 7
p1 = 10
p2 = 20
profit = 10
*/

