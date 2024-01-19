package pl.julianoo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FractionTests {

    @Test
    public void testGetFractionAsDecimal() {
        // Given
        Fraction fraction = new Fraction(3, 1, 2);

        // When
        double result = fraction.getFractionAsDecimal();

        // Then
        assertEquals(3.5, result);
    }

    @Test
    public void testGetFractionAsString() {
        // Given
        Fraction fraction1 = new Fraction(2, 1, 2);
        Fraction fraction2 = new Fraction(0, 3, 4);

        // When
        String result1 = fraction1.getFractionAsString();
        String result2 = fraction2.getFractionAsString();

        // Then
        assertEquals("2 1 2", result1);
        assertEquals("3/4", result2);
    }

    @Test
    public void testAdd() {
        // Given
        Fraction fraction1 = new Fraction(1, 1, 2);
        Fraction fraction2 = new Fraction(0, 3, 4);

        // When
        Fraction result = fraction1.add(fraction2);

        // Then
        assertEquals(new Fraction(1, 5, 4), result);
    }

    @Test
    public void testSubtract() {
        // Given
        Fraction fraction1 = new Fraction(1, 1, 2);
        Fraction fraction2 = new Fraction(0, 3, 4);

        // When
        Fraction result = fraction1.subtract(fraction2);

        // Then
        assertEquals(new Fraction(0, 1, 4), result);
    }

    @Test
    public void testMultiply() {
        // Given
        Fraction fraction1 = new Fraction(1, 1, 2);
        Fraction fraction2 = new Fraction(0, 3, 4);

        // When
        Fraction result = fraction1.multiply(fraction2);

        // Then
        assertEquals(new Fraction(0, 3, 8), result);
    }

    @Test
    public void testDivide() {
        // Given
        Fraction fraction1 = new Fraction(1, 1, 2);
        Fraction fraction2 =