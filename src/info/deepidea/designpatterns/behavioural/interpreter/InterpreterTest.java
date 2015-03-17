package info.deepidea.designpatterns.behavioural.interpreter;

public class InterpreterTest {
    private static Expression buildTree() {
        final Expression vova = new TerminalExpression("Vova");
        final Expression stepa = new TerminalExpression("Stepa");
        final Expression denis = new TerminalExpression("Denis");
        final Expression pasha = new TerminalExpression("Pasha");

        final Expression vovaAndStepa = new AndExpression(vova, stepa);
        final Expression vovaStepaAndDenis = new AndExpression(vovaAndStepa, denis);

        final OrExpression pashaOrOthers = new OrExpression(pasha, vovaStepaAndDenis);

        return pashaOrOthers;
    }
    public static void main(String[] args) {
        final String context = "Pasha";
        final Expression expr = buildTree();
        System.out.println(expr.interpret(context));
    }
}
