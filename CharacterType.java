public class CharacterType {
    
    public static void determineCharacterType(char[] chars) {
        for (char c : chars) {
            if (Character.isLetter(c)) {
                System.out.println(c + " is a letter.");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " is a digit.");
            } else if (Character.isWhitespace(c)) {
                System.out.println("Whitespace detected.");
            }
        }
    }

    public static void main(String[] args) {
        char[] characters = {'A', ' ', '5', 'b', '9', '#'};
        determineCharacterType(characters);
    }
}