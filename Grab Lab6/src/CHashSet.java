import java.util.LinkedList;

public class CHashSet extends LinkedList<Integer> {
    private int totalAddedElements = 0;

    @Override
    public boolean add(Integer e) {
        totalAddedElements++;
        return super.add(e);
    }

    @Override
    public boolean addAll(java.util.Collection<? extends Integer> c) {
        totalAddedElements += c.size();
        return super.addAll(c);
    }

    public int getTotalAddedElements() {
        return totalAddedElements;
    }

    public static void main(String[] args) {
        CHashSet customSet = new CHashSet();
        customSet.add(1);
        customSet.add(2);
        customSet.add(3);
        System.out.println("Total added elements: " + customSet.getTotalAddedElements());

        CHashSet customSet2 = new CHashSet();
        customSet2.addAll(customSet);
        System.out.println("Total added elements after addAll: " + customSet2.getTotalAddedElements());
    }
}
