package majewski.mateusz;

public class LinkedList implements NodeList{

    private ListItem root = null;

    public LinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
//            Adding a first item to an empty list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0) {
//                New item should be put to right
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else if (currentItem.next() == null) {
//                    Next item does not exist, insert newItem at the end of the list.
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
//              New item should be put to left
                if (currentItem.previous() == null) {
                    newItem.setNext(currentItem).setPrevious(newItem);
                    this.root = newItem;
                } else if (currentItem.previous() != null) {
//                  The previous node is the root
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }
                return true;
            } else {
                System.out.println("The item already exists");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        if(currentItem.getValue() == item.getValue()){
            System.out.println("The item has been removed");
        }
        return true;
    }
}
