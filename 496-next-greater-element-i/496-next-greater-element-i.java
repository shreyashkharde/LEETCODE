class Solution {
    public int[] nextGreaterElement(int[] shreyash, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        // map from x to next greater element of x
        
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < shreyash.length; i++)
            shreyash[i] = map.getOrDefault(shreyash[i], -1);
        return shreyash;
    }
}