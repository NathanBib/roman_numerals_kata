import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTestRule3 {

    @Test
    void subtractNumber() {
        // Given
        String romanNumber = "IV";

        // When
        final int value = new Parser().parse(romanNumber);

        // Then
        assertThat(value).isEqualTo(4);
    }

    @Test
    void subtractNumber159() {
        // Given
        String romanNumber = "CLIX";

        // When
        final int value = new Parser().parse(romanNumber);

        // Then
        assertThat(value).isEqualTo(159);
    }

    @Test
    void subtractNumber29() {
        // Given
        String romanNumber = "XXIX";

        // When
        final int value = new Parser().parse(romanNumber);

        // Then
        assertThat(value).isEqualTo(29);
    }

    @Test
    void subtractNumber45() {
        // Given
        String romanNumber = "XLV";

        // When
        final int value = new Parser().parse(romanNumber);

        // Then
        assertThat(value).isEqualTo(45);
    }
}
