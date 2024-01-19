package pl.julianoo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CircleTests {

    @Mock
    private Circle circle;

    @Test
    public void testArea() {
        // Given
        lenient().when(circle.getRadius()).thenReturn(5.0);

        // When
        double result = circle.area();

        // Then
        assertThat(result).isEqualTo(78.54);
    }

    @Test
    public void testCircumference() {
        // Given
        lenient().when(circle.getRadius()).thenReturn(5.0);

        // When
        double result = circle.circumference();

        // Then
        assertThat(result).isEqualTo(31.42);
    }
}