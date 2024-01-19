package pl.julianoo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Scanner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class liczonkoTests {

    @Test
    public void testMain_addition() {
        // Given
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextLine()).thenReturn("yes");

        // When
        liczonko.main(new String[]{});

        // Then
        verify(scanner, times(1)).nextLine();
    }

    @Test
    public void testMain_defaultCase() {
        // Given
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextLine()).thenReturn("no");

        // When
        liczonko.main(new String[]{});

        // Then
        verify(scanner, times(1)).nextLine();
    }
}