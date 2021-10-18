package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        // Task implementation
        int firstReverse = 0, secondReverse = 0, result;
        int secondNumDigits = secondNumber.size();

        //First way of getting a reversed number from the List
        for (int i = firstNumber.size()-1; i >= 0; i--) {
            firstReverse += (int) firstNumber.get(i) * Math.pow(10, i);
        }

        //Second (alternative) way of getting a reversed number from the List
        ListIterator<Integer> iter = secondNumber.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }
        while (iter.hasPrevious()) {
            secondNumDigits--;
            secondReverse += (int) iter.previous() * Math.pow(10, secondNumDigits);
        }

        //Counting the sum of two reversed numbers
        result = firstReverse + secondReverse;
        return result;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        List oddElements = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                oddElements.add(list.get(i));
            }
        }

        return oddElements;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        List bounds = new ArrayList();

        if (!list.isEmpty()) {
            if (list.size() > 1) {
                bounds.add(list.get(0));
                bounds.add(list.get(list.size() - 1));
            } else {
                bounds.add(list.get(0));
            }
        }

        return bounds;
    }
}
