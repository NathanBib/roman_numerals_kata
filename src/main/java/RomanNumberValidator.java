import java.util.List;

public class RomanNumberValidator {
    public static boolean validate(String romanNumber) {
        final List<CharacterOccurence> sequence = CharacterOccurence.from(romanNumber);
        for (CharacterOccurence occurence : sequence) {
            if (occurence.character().untilThreePermitted()) {
                if(occurence.number() > 3) {
                    return false;
                }
            }
            else if (occurence.number() > 1) {
                return false;
            }
        }
        return true;
    }
}
