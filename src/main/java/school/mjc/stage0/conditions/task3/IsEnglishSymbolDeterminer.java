package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
             if (!(symbol >= 'A' && symbol <= 'Z') && !(symbol >= 'a' && symbol <= 'z')) {
            System.out.println("Non English");
        } else System.out.println("English");
    }
}
