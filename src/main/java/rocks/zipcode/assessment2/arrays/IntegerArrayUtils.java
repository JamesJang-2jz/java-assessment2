package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        List<Integer> result = new ArrayList<>();
        Collections.addAll(result, integerArray);
        Collections.addAll(result, valueToBeAdded);
        return result.toArray(new Integer[0]);
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return Arrays.stream(integerArray)
                .skip(indexToFetch)
                .findFirst()
                .orElse(null);
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return Arrays.stream(integerArray)
                .map(i -> i % 2 == 0 ? i + 1 : i - 1)
                .toArray(Integer[]::new);
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        List<Integer> result = new ArrayList<>();
        for (Integer i :integerArray) {
            if (i % 2 == 0){
                result.add(i + 1);
            } else {
                result.add(i);
            }
        }
        return result.toArray(new Integer[0]);
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : input) {
            if (i % 2 != 0){
                result.add(i - 1);
            } else {
                result.add(i);
            }
        }
        return result.toArray(new Integer[0]);
    }
}
