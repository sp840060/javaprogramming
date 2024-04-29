public class questions {
        public static void main(String[] args) {
            int[] nums = {2, 2, 1, 5, 5, 7, 3, 6, 6, 6}; 
            int result = 0;
    
            for (int num : nums) {
                result ^= num; 
            }
    
            System.out.println("The single number is: " + result);
        }
}
