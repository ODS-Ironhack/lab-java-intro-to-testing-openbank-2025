import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeywordDetector {
    public static boolean detectJavaKeyword(String sentence){
         Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
                "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto",
                "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package",
                "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
                "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
        ));
        String[] words = sentence.split(" ");

        for(String word: words){
            if(JAVA_KEYWORDS.contains(word)){
                return true;
            }
        }
        return false;
    }
}
