/**
 * Given:
 * A pre-written method called computeArea and a main method for testing.
 * 
 * Note:
 * You will modify computeArea() over the course of this quiz. Completing task 2 may cause task 1
 * to not work any longer. That's OK! Similarly, completing task 3 might cause task 2 to no longer work.
 ##############################################################################################
 * TASK 1:
 * Modify computeArea() so it will find the area of a rectangle with length of 4 and height of 3. 
 * Remember that the area of a rectangle is found by multiplying length by width.
 * 
 * We can run this like:
 * computeArea()
 * 
 * STOP HERE FOR: 'B-'
 ##############################################################################################
 * TASK 2:
 * Modify computeArea() so that:
 * 
 * 1. It accepts in two values as parameters.
 * 2. Multiplies those two values and prints the result.
 * 
 * We can run this like:
 * computeArea(5,3)
 * with a print output of: 15
 * 
 * STOP HERE FOR: 'B'
 ##############################################################################################
 * TASK 3:
 * Modify computeArea() from task 2 so that:
 * 
 * 1. Instead of printing the area, the area is returned to the main
 * 
 * STOP HERE FOR: 'B+'
 ##############################################################################################
 * TASK 4:
 * Modify computeArea() so from task 3 so that:
 * 
 * 1. Negative values for length or height return a value of -1
 * 2. Too large values (greater than 100) for length or height return a value of -1
 * 
 * STOP HERE FOR: 'A'
 ##############################################################################################
 * TASK 5:
 * Modify computeArea() from task 4 so that:
 * 1. It accepts a third parameter which is a String. This parameter will describe the type of
 * object.
 * 2. If the String is "rect", calculate as you have before.
 * 3. If the String is "tri", calculate the area using the formula .5 * length * width
 * 
 * The method should still return -1 for negative values and for values that are too large.
 * STOP HERE FOR: 'A+'
 */

public class App {
    /*
     * You will MODIFY THIS ONE METHOD across tasks 1–4.
     * Do not create new methods.
     */
    public static int computeArea(String rect, int l, int w) {
        int area = l*w;
        if (area < 0) {
            return -1;
        } else if (area >= 100) {
            return -1;
        } else {
            return area;
        }
        
    }

    public static void main(String[] args) {
        
        
        //B- range
        // System.out.println("Task 1:");
        // computeArea(); // should PRINT 12.0

        //B range
        // System.out.println("Task 2:");
        // computeArea(5, 3); // should PRINT 15.0
        // computeArea(10, 2); // should PRINT 20.0

        //B+ range
        // System.out.println("Task 3:");
        // double a1 = computeArea(5, 3); // expect 15.0
        // double a2 = computeArea(10, 2); // expect 20.0
        // System.out.println(a1);
        // System.out.println(a2);

        //A range
        // System.out.println("Task 4:");
        // System.out.println(computeArea(5, 3)); // 15.0
        // System.out.println(computeArea(-2, 8)); // -1.0 (invalid)
        // System.out.println(computeArea(100, 1)); // -1.0 (too large)


        //A+ range
         System.out.println("Task 5:");
         System.out.println(computeArea("rect", 5, 3)); // 15.0
         System.out.println(computeArea("tri", 6, 4)/2);  // 12.0
         System.out.println(computeArea("hex", 2, 2));  // -1.0 (unknown)
         System.out.println(computeArea("rect", -1, 9)); // -1.0 (invalid)
    }
}
