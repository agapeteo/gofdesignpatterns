package info.deepidea.designpatterns.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Greens needleLeaf = new NeedleLikeLeaf();
        Greens frondLeaf = new FrondLeaf();
        Greens frondLeaf1 = new FrondLeaf();
        Greens needleLeaf1 = new NeedleLikeLeaf();

        CompositeOfLeaves composite = new CompositeOfLeaves();
        CompositeOfLeaves composite1 = new CompositeOfLeaves();
        CompositeOfLeaves composite2 = new CompositeOfLeaves();

        composite.add(needleLeaf);

        composite1.add(frondLeaf);
        composite1.add(needleLeaf1);

        composite2.add(frondLeaf1);
        composite2.add(composite);
        composite2.add(composite1);

        composite2.print();
    }
}
