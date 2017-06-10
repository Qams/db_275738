package pl.edu.agh.tkk17;

public class NodeDiv extends Node {
    public NodeDiv(Node l, Node r)
    {
        super(l,r);
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }
}
