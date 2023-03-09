package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
             if ('A'== character || 'E'== character ||  'I'== character ||  'O'== character ||  'U'== character ||
                'Y'== character || 'a'== character ||  'e'== character || 'i'== character ||  'o'== character ||
                'u'== character ||  'y'== character) {
            System.out.println("Vowel");
        } else if ((!(character >= 'A' && character <= 'Z') && !(character >= 'a' && character <= 'z'))) {
            System.out.println("wrong alphabet!");
        } else System.out.println("Consonant");
    }
}
