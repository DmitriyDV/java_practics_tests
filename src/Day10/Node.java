package Day10;
/*
*
* */
public class Node {
    private Node leftSon, rightSon;

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(final Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setRightSon(final Node rightSon) {
        this.rightSon = rightSon;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(final int root) {
        this.root = root;
    }

    private int root;
    public void printNode(){
        System.out.println(" Выбранный узел имеет значение :" + root);
    }
    public String toString(){
        return "Node{" +
                "value=" + root +
                ", leftChild=" + leftSon +
                ", rightChild=" + rightSon +
                '}';
    }
}
