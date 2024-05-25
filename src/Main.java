import Algorithms.Misc.TestArrays;
import Algorithms.Sorting.InsertionSort;

import java.util.Arrays;

public class Main {


    public Main(){
        //Do Stuff Here
        System.out.println(Arrays.toString(InsertionSort.InsertionSortIntDebug(TestArrays.hundredElements)));
    }

    public static void main(String[] args) {
        new Main();

    }
}