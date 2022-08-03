package com.kibi312;

/**
* Project for epam's java training
* <a href="https://github.com/KIBI312/">Source codes can be found at my gh account</a>
* @author Seitov Iskender
* 
*/
public class App {
/**
 * <p>Main method from where program starts</p>
 * <p>Takes as input array of cl arguments(up to 10 values) and sorts them</p>
 * <p>As result prints sorted array or error message</p>
 * @param args Array of strings created from command line arguments
 * 
 */
    public static void main(String[] args) {
        try {
            int[] toSort = ProcessArgs.convertToInt(args);
            Sorting.bubbleSort(toSort);
            for (int i : toSort) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
