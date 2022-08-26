import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTestRule2 {

    @Test
    void addRomanNumber() {
        // Given
        String romanNumber = "VII";

        // When
        final int value = new Parser().parse(romanNumber);

        // Then
        assertThat(value).isEqualTo(7);
    }

    @Test
    void addRomanNumber53() {
        // Given
        String romanNumber = "LIII";

        // When
        final int value = new Parser().parse(romanNumber);

        // Then
        assertThat(value).isEqualTo(53);
    }
}
