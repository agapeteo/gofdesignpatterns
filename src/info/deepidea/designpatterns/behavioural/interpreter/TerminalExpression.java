package info.deepidea.designpatterns.behavioural.interpreter;

public class TerminalExpression implements Expression {
    private final String literal;

    public TerminalExpression(String name) {
        literal = name;
    }

    @Override
    public boolean interpret(String context) {
        final String[] names = context.split(" ");
        for (String eachName : names) {
            if (eachName.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
