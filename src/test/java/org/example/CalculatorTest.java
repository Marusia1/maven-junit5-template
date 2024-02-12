package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setUpForAllTest() {
        System.out.println("Setting up ALL");
    }

    @AfterAll
    static void tearDownForAllTest() {
        System.out.println("Closing up All");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up calculator object for new test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("This is execution of post condition after each test");
    }


    // 1.1 Check the sum of two positive integer values
    @Test
    public void testAdditionTwoPositiveIntegersReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.calculateSumOfTwoIntegerValues(2, 2));
    }

    // 1.2. Check if the sum of a positive number and zero is equal to the positive number
    @Test
    public void testAdditionPositiveIntegersAndZeroReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calculateSumOfIntegerAndZero(2, 0));
    }

    // 1.3 Check if the sum of a negative number and zero is equal to the negative number
    @Test
    public void testAdditionNegativeValueAndZeroReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.calculateSumOfNegativeIntegerAndZero(-2, 0));

    }

    // 1.4 Check if the sum of two negative numbers is negative
    @Test
    public void testAdditionTwoIntegerNegativeNumbersReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.calculateSumOfTwoNegativeValues(-2, -3));
    }


    // 2.1 Subtraction of two positive integer valuesSubtraction of two positive integer values
    @Test
    public void testSubtractionTwoPositiveIntegersReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calculateSubtractionOfTwoIntegerValues(4, 2));

    }

    // 2.2 Subtracting zero from a positive number equals the same positive number
    @Test
    public void testSubtractingZeroFromPositiveNumberReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.calculateSubtractionOfZeroValueFromPositiveNumber(7, 0));

    }

    //2.3 Subtracting zero from a negative number equals the same negative number
    @Test
    public void testSubtractionZeroFromNegativeNumberReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(-10, calculator.calculateSubtractionOfZeroFromNegativeNumber(-10, 0));

    }
    // 2.4 Subtracting a greater number from less number equals a negative number

    @Test
    public void testSubtractingGreaterNumberFromLessNumberReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.calculateSubtractionFromLessNumber(5, 10));
    }

    // 3.1 The First value is Greater than the Second value (positive)

    @Test
    public void testFirstValueGreaterSecondValue() {
        Calculator calculator = new Calculator();
        assertTrue(15 > 10);

    }


    // 3.2 The First value is Greater than the Second value (negative)
    @Test
    public void testFirstValueGreaterSecondValueNegativeScenario() {
        Calculator calculator = new Calculator();
        assertFalse(5 > 10);

    }

    // 6 HOMEWORK. Task with multiplication floating dot and division floating dot.
    //6.1 multiplication of two integer values with floating dot with delta

    @Test
    public void testMultiplicationTwoPositiveIntegersReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(8.75, calculator.calculateMultiplyOfTwoIntegerValues(2.5, 3.5), 0.0001);

    }

    // 6.2 division of two integer values with floating dot with delta
    @Test
    public void testDivisionTwoPositiveIntegersReturnCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.calculateDivisionOfTwoIntegerValues(1.5, 0.5), 0.0001);
    }


}
