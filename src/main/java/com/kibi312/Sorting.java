package com.kibi312;

/**
* <p>Class to sort array of integers</p>
* <a href="https://github.com/KIBI312/">Source codes can be found at my gh account</a>
* @author Seitov Iskender
* 
*/
public class Sorting {
    
    /**
     * <p>Sorts array of integers using bubbleSort algorithm optimized via checks 
     * was array already sorted or not between iterations. Will throw exception with following message if on input will be null array</p>
     * <ul>
     *   <li> Null array on input</li>
     * </ul>
     * <p><b>returns void</b> since this method modifies <b>original</b> array passed as argument</p>
     * @param array Array of integers
     * @throws IllegalArgumentException
     */
    public static void bubbleSort(int[] array){
        if(array==null) throw new IllegalArgumentException("Null array on input");   
        boolean isSorted = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]) {
                    isSorted=false;
                    array[j] = array[j] ^ array[j+1];
                    array[j+1] = array[j] ^ array[j+1];
                    array[j] = array[j] ^ array[j+1];
                }
            }
            if(isSorted==true) break;
            isSorted = true;
        }
    }

}
