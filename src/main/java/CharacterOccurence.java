import java.util.ArrayList;
import java.util.List;

public record CharacterOccurence(RomanNumber character, int number) {

    public static final char INIT_CHARACTER = 'O';

    public static List<CharacterOccurence> from(String romanNumber) {
        List<CharacterOccurence> characterOccurences = new ArrayList<>();
        Character currentCharacterParsed = INIT_CHARACTER;
        int occurences = 0;
        for (Character character : romanNumber.toCharArray()) {
            if (currentCharacterParsed != character && currentCharacterParsed != INIT_CHARACTER) {
                characterOccurences.add(new CharacterOccurence(RomanNumber.valueOf(currentCharacterParsed.toString()), occurences));
                occurences = 0;
            }
            ++occurences;
            currentCharacterParsed = character;
        }
        characterOccurences.add(new CharacterOccurence(RomanNumber.valueOf(currentCharacterParsed.toString()), occurences));
        return characterOccurences;
    }
}
