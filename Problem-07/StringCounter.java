public class StringCounter {
    public static void main(String[] args) {
        String text = "cybersecurity";

        int letters = countCharacters(text);
        int vowelS = countVowels(text);
        int consonants = countConsonants(text);

        System.out.println("Letters: "+ letters);
        System.out.println("Vowels: "+ vowelS);
        System.out.println("Consonants: " + consonants);
    }

    //methods
    public static int countCharacters(String text){
        int numOfCharacter=0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                numOfCharacter++;
            }
        }
        return numOfCharacter;
    }

    public static int countVowels(String text){
        String vowels = "aeiou";
        int numOfVowels = 0;
        String newText = text.toLowerCase();

        for (int i = 0; i < newText.length(); i++) {
            if (vowels.contains(String.valueOf(newText.charAt(i)))) {
                numOfVowels++;
            }
        }
        return numOfVowels;
    }

    public static int countConsonants(String text){
        String vowels = "aeiou";
        int numOfConsonants = 0;
        String newText = text.toLowerCase();

        for (int i = 0; i < newText.length(); i++) {

            if (Character.isLetter(newText.charAt(i))) {
                if (vowels.contains(String.valueOf(newText.charAt(i)))) {
                
            } else {
                numOfConsonants++;
            }
            }
        }
        return numOfConsonants;
    }
}
