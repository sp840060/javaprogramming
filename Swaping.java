// public class Swaping {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = 20;

//         x = x ^ y;
//         y = x ^ y;
//         x = x ^ y;

//         System.out.println("x = " + x);
//         System.out.println("y = " + y);
//     }
// }

// Check Power of 2

// public class Swaping {

//     public static void main(String[] args) {
//         int number = 16;
//         boolean isPowerOfTwo = (number & (number - 1)) == 0;

//         if (isPowerOfTwo) {
//             System.out.println(number + " is a power of 2");
//         } else {
//             System.out.println(number + " is not a power of 2");
//         }
//     }
// }

// Count Set bit

public class Swaping {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(countSetBits(n));
    }
}

