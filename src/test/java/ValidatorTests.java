import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidatorTests {

    @ParameterizedTest
    @ValueSource(strings = {"IIII", "VV", "VIIII", "XVV"})
    void isInvalid(String input) {
        assertThat(RomanNumberValidator.validate(input)).isFalse();
    }
}
