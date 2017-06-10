package pl.edu.agh.tkk17;

public class Evaluator
{
    public static Float evaluate(Node tree)
    {
        return evaluateRpn(tree);
    }

    private static Float evaluateRpn(Node node)
    {
        RpnEvaluatorVisitor visitor = new RpnEvaluatorVisitor();
        node.accept(visitor);
        return visitor.getValue();
    }

}
