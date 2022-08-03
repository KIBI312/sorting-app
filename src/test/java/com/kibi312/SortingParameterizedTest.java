package com.kibi312;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SortingParameterizedTest {
    
    private int[] toSort;
    private int[] sorted;

    public SortingParameterizedTest(int[] toSort, int[] sorted){
        this.toSort = toSort;
        this.sorted = sorted;
    }

    @Parameters
    public static Collection data() {
        return Arrays.asList(new int[][][]{
            {{793,307,824,372,982,459,426,661,715,1000}, {307,372,426,459,661,715,793,824,982,1000}},
            {{740,515,455,401,29,519,246,882,595,70}, {29,70,246,401,455,515,519,595,740,882}},
            {{623,50,629,646,321,947,26,514,718,197}, {26,50,197,321,514,623,629,646,718,947}},
            {{984,52,256,411,740,72,817,218,926,460}, {52,72,218,256,411,460,740,817,926,984}},
            {{588,168,86,64,275,635,923,826,271,46}, {46,64,86,168,271,275,588,635,826,923}},
            {{140,645,553,900,623,888,820,22,180,41}, {22,41,140,180,553,623,645,820,888,900}},
            {{868,661,670,365,257,344,927,98,344,58}, {58,98,257,344,344,365,661,670,868,927}},
            {{302,62,238,348,710,839,571,987,406,276}, {62,238,276,302,348,406,571,710,839,987}},
            {{644,963,596,698,430,291,620,556,280,577}, {280,291,430,556,577,596,620,644,698,963}},
            {{623,750,556,292,386,495,819,373,725,907}, {292,373,386,495,556,623,725,750,819,907}}
        });
    }

    @Test
    public void testOtherCases() {
        Sorting.bubbleSort(toSort);
        assertArrayEquals(sorted, toSort);
    }

}
