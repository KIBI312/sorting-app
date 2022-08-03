package com.kibi312;

/**
* <p>Class to validate and process command line arguments</p>
* <a href="https://github.com/KIBI312/">Source codes can be found at my gh account</a>
* @author Seitov Iskender
* 
*/
public class ProcessArgs {
    
    /**
     * <p>Converts array from String[] to int[]. Can throw variants of IllegalArgumentException
     * with following error messages</p>
     * <ul>
     *   <li>Null array detected</li>
     *   <li>Number of arguments should be from 1 to 10 inclusively</li>
     *   <li>Non integer argument detected</li>
     * </ul>
     * @param args Array of strings created from command line arguments
     * @throws IllegalArgumentException
     * @return <b>int[] result</b> in case of successful convertation
     */
    public static int[] convertToInt(String[] args) {
        if(args == null) 
            throw new IllegalArgumentException("Null array detected");
        if(args.length > 10 || args.length==0)
            throw new IllegalArgumentException("Number of arguments should be from 1 to 10 inclusively");
        int[] result = new int[args.length];
        for (int i = 0; i < result.length; i++) {
            try {
                result[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Non integer argument detected");
            }
        }
        return result;
    }

}
