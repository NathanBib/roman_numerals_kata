import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTestsRule1 {


    @Test
    void parseICharacter() {
        // Given
        final Parser parser = new Parser();
        final String romanNumber = "I";

        // When
        final int parsedNumber = parser.parse(romanNumber);

        // Then
        assertThat(parsedNumber).isEqualTo(1);
    }

    @Test
    void parseXCharacter() {
        // Given
        final Parser parser = new Parser();
        final String romanNumber = "X";

        // When
        final int parsedNumber = parser.parse(romanNumber);

        // Then
        assertThat(parsedNumber).isEqualTo(10);
    }

    @Test
    void parseCCharacter() {
        // Given
        final Parser parser = new Parser();
        final String romanNumber = "C";

        // When
        final int parsedNumber = parser.parse(romanNumber);

        // Then
        assertThat(parsedNumber).isEqualTo(100);
    }

    @Test
    void parseIII() {
        // Given
        final Parser parser = new Parser();
        final String romanNumber = "III";

        // When
        final int parsedNumber = parser.parse(romanNumber);

        // Then
        assertThat(parsedNumber).isEqualTo(3);
    }

    @Test
    void characterOccurencesFine() {
        final List<CharacterOccurence> characterOccurences = CharacterOccurence.from("VVIIIIXXL");
        final var expected = List.of(
                new CharacterOccurence(RomanNumber.V, 2),
                new CharacterOccurence(RomanNumber.I, 4),
                new CharacterOccurence(RomanNumber.X, 2),
                new CharacterOccurence(RomanNumber.L, 1)
        );
        assertThat(characterOccurences).isEqualTo(expected);
    }
}
