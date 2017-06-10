package pl.edu.agh.tkk17;

public class NodeSub extends Node{

    public NodeSub(Node l, Node r)
    {
        super(l,r);
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }
}
