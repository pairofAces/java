import java.util.*;

public class nonConstructibleChange {
    public int nonConstructibleChangeMain(int[] coins) {
        // sort the coins array
        Arrays.sort(coins);

        // create variable to reference the current amount of change.
        int currentChange = 0;

        // traverse through the sorted coins array
        for (int coin : coins) {
            // if the value of the current coin is greater than the value of (currentChange + 1)
            if (coin > currentChange + 1) {
                // return the value of (currentChange + 1)
                return currentChange + 1;
            }

            // increment the value of (currentChange) by the value of the current coin
            currentChange += coin;
        }

        // after the for loop, the value of (currentChange + 1) will be the lowest amount of change
        // that cannot be created
        return currentChange + 1;
    }
}
