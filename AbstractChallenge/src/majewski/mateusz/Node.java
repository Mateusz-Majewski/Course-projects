package majewski.mateusz;

public class Node extends ListItem{

    public Node(String value) {
        super(value);
    }


    public int compareTo(ListItem value) {
        if(value != null) {
            return ((String) super.getValue()).compareTo((String) value.getValue());
        } else {
            return -1;
        }
    }

    @Override
    ListItem next() {
        return next;
    }

    @Override
    ListItem previous() {
        return previous;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        this.previous = previous;
        return this.previous;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.next = next;
        return this.next;
    }
}
