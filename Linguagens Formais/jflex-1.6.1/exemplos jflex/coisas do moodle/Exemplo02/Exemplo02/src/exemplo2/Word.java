package exemplo2;

public class Word extends Token {
    public final String lexeme;

    public Word(int t, String s) {
        super(t);
        lexeme = new String(s);
    }

    @Override
    public String toString() {
        return "<" + this.tag + ",\"" + this.lexeme + "\">";
    }

}