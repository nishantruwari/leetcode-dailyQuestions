class Solution {
    public int f(int numBottles, int numExchange) {
        if ((numBottles / numExchange + numBottles % numExchange) < numExchange && numBottles / numExchange == 0) {
            return 0;
        }
        return numBottles / numExchange + f(numBottles / numExchange + numBottles % numExchange, numExchange);

    }

    public int numWaterBottles(int numBottles, int numExchange) {
        return f(numBottles, numExchange) + numBottles;

    }
}