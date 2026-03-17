package Arrays_Strings.Stack;

import java.util.*;

class NextGreaterElements {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack empty → no greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }

    // Testing
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        int[] res = nextGreater(arr);

        System.out.println(Arrays.toString(res));
    }
}