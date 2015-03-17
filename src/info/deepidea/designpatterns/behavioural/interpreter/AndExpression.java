package info.deepidea.designpatterns.behavioural.interpreter;

public class AndExpression implements Expression {
    private final Expression first;
    private final Expression second;

    public AndExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean interpret(String context) {
        return first.interpret(context) && second.interpret(context);
    }
}
