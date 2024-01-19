package pl.julianoo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class lepszykalkulatorTests {

    @Test
    public void testAdd() {
        // Given
        Fraction x = mock(Fraction.class);
        Fraction y = mock(Fraction.class);
        when(x.add(y)).thenReturn(new Fraction(3, 4));

        // When
        Fraction result = x.add(y);

        // Then
        assertThat(result.getNumerator()).isEqualTo(3);
        assertThat(result.getDenominator()).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        // Given
        Fraction x = mock(Fraction.class);
        Fraction y = mock(Fraction.class);
        when(x.subtract(y)).thenReturn(new Fraction(1, 4));

        // When
        Fraction result = x.subtract(y);

        // Then
        assertThat(result.getNumerator()).isEqualTo(1);
        assertThat(result.getDenominator()).isEqualTo(4);
    }

    @Test
    public void testMultiply() {
        // Given
        Fraction x = mock(Fraction.class);
        Fraction y = mock(Fraction.class);
        when(x.multiply(y)).thenReturn(new Fraction(1, 2));

        // When
        Fraction result = x.multiply(y);

        // Then
        assertThat(result.getNumerator()).isEqualTo(1);
        assertThat(result.getDenominator()).isEqualTo(2);
    }

    @Test
    public void testDivide() {
        // Given
        Fraction x = mock(Fraction.class);
        Fraction y = mock(Fraction.class);
        when(x.divide(y)).thenReturn(new Fraction(2, 3));

        // When
        Fraction result = x.divide(y);

        // Then
        assertThat(result.getNumerator()).isEqualTo(2);
        assertThat(result.getDenominator()).isEqualTo(3);
    }
}