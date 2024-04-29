package ArrayAssignment;

public class question1 {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        question1 question = new question1();  // Create an instance of the class
        int[] nums = {1, 2, 3,1};
        boolean result = question.containsDuplicate(nums);
        System.out.println(result);
    }
}
