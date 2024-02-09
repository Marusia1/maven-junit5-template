package org.example;

public class Calculator {
    //1.1 Sum of two positive Integer values
    public int calculateSumOfTwoIntegerValues(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    // 1.2 Check if the sum of a positive number and zero is equal to the positive number
    public int calculateSumOfIntegerAndZero(int thirteenthValue, int fourteenthValue) {
        return thirteenthValue + fourteenthValue;
    }

    // 1.3 Check if the sum of a negative number and zero is equal to the negative number
    public int calculateSumOfNegativeIntegerAndZero(int fifteenValue, int sixteenthValue) {
        return fifteenValue + sixteenthValue;
    }

    /// 1.4 Check if the sum of two negative numbers is negative
    public int calculateSumOfTwoNegativeValues(int seventeenthValue, int eighteenthValue) {
        return seventeenthValue + eighteenthValue;
    }

    // 2.1 Subtraction of two positive integer valuesSubtraction of two positive integer values
    public int calculateSubtractionOfTwoIntegerValues(int thirdValue, int fourthValue) {
        return thirdValue - fourthValue;
    }

    // 2.2 Subtracting zero from a positive number equals the same positive number
    public int calculateSubtractionOfZeroValueFromPositiveNumber(int nineteenValue, int twentiethValue) {
        return nineteenValue - twentiethValue;
    }
    //2.3 Subtracting zero from a negative number equals the same negative number
    public int calculateSubtractionOfZeroFromNegativeNumber(int twentyFirstValue, int twentySecondValue) {
        return twentyFirstValue - twentySecondValue;

    }

    // 2.4 Subtracting a greater number from less number equals a negative number
    public int calculateSubtractionFromLessNumber(int twentyThirdValue, int twentyFourthValue) {
        return twentyThirdValue - twentyFourthValue;

    }
    // 3.1 checking that the first value is greater than second one (Positive scenario)
    public boolean calculateTheFirstValueIsGreaterThanSecond(int ninthValue, int tenthValue) {
        return ninthValue > tenthValue;
    }


    // 3.2 checking that the first value  is greater than second one (Negative scenario)
    public boolean calculateTheFirstValueIsGreaterThanSecondNegative(int eleventhValue, int twelfthValue) {
        return eleventhValue > twelfthValue;
    }



    // multiplication of two integer values
    public int calculateMultiplicationOfTwoIntegerValues(int fifthValue, int sixthValue) {
        return fifthValue * sixthValue;

    }
    // division of two integer values
    public int calculateDivisionOfTwoIntegerValues(int seventhValue, int eighthValue) {
        return seventhValue / eighthValue;
    }



}
