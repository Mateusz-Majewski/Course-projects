package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(null);

        list.addItem(new Node("S"));
        list.addItem(new Node("E"));
        list.addItem(new Node("X"));


        list.addItem(new Node("1"));
        list.addItem(new Node("2"));
        list.addItem(new Node("3"));

        list.addItem(new Node("W"));
        list.addItem(new Node("S"));
        list.addItem(new Node("A"));

        list.traverse(list.getRoot());

        list.removeItem(new Node("W"));


    }
}
