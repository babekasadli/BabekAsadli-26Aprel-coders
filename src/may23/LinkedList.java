package may23;
import java.util.HashSet;

class LinkedList {
    int value;
    LinkedList next;

    LinkedList(int value) {
        this.value = value;
        next = null;
    }

    void add(int value) {
        LinkedList newNode = new LinkedList(value);
        LinkedList current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    LinkedList getIntersection(LinkedList list) {
        LinkedList intersection = new LinkedList(-1); // Dummy node
        LinkedList current = intersection;
        HashSet<Integer> set = new HashSet<>();

        LinkedList list1 = this;
        LinkedList list2 = list;

        while (list1 != null) {
            set.add(list1.value);
            list1 = list1.next;
        }

        while (list2 != null) {
            if (set.contains(list2.value)) {
                current.next = new LinkedList(list2.value);
                current = current.next;
            }
            list2 = list2.next;
        }

        return intersection.next;
    }

    LinkedList getUnion(LinkedList list) {
        HashSet<Integer> set = new HashSet<>();
        LinkedList union = new LinkedList(-1); // Dummy node
        LinkedList current = union;

        LinkedList list1 = this;
        LinkedList list2 = list;

        while (list1 != null) {
            set.add(list1.value);
            current.next = new LinkedList(list1.value);
            current = current.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            if (!set.contains(list2.value)) {
                current.next = new LinkedList(list2.value);
                current = current.next;
            }
            list2 = list2.next;
        }

        return union.next;
    }

    void printList() {
        LinkedList current = this;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class LinkedListIntersectionUnion {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        LinkedList list2 = new LinkedList(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        LinkedList intersection = list1.getIntersection(list2);
        System.out.println("Intersection:");
        intersection.printList();

        LinkedList union = list1.getUnion(list2);
        System.out.println("Union:");
        union.printList();
    }
}
