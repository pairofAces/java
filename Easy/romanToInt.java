// Roman numeral to integer

class Solution {
    public int romanToInt(String s) {
        // create refernce array
        int nums[] = new int[s.length()];

        // initiate the for loop
        for (int i = 0; i < s.length(); i++) {
            // initiate switch case, for each of the cases when a 
            // specific letter roman numeral will come
            switch (s.charAt(i)) {
                case "M":
                    // in this case, change the value of the element at the
                    // (i)th index to 1000
                    nums[i] = 1000;
                    break;
                case "D":
                    nums[i] = 500;
                    break;
                case "C":
                    nums[i] = 100;
                    break;
                case "L":
                    nums[i] = 50;
                    break;
                case "X":
                    nums[i] = 10;
                    break;
                case "V":
                    nums[i] = 5;
                    break;
                case "I":
                    nums[i] = 1;
                    break;
            }
        }

        // create a sum variable for reference
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            
        }
    }
}