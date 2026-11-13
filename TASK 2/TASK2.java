import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Song A");
        arrayList.add("Song B");
        arrayList.add("Song C");

        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Song A");
        linkedList.add("Song B");
        linkedList.add("Song C");

        linkedList.addFirst("New Song");
        System.out.println("LinkedList: " + linkedList);

        // ArrayDeque
        ArrayDeque<String> upNext = new ArrayDeque<>();
        upNext.addLast("Song A");
        upNext.addLast("Song B");
        upNext.addLast("Song C");

        System.out.println("Up Next Playlist: " + upNext);

        System.out.println("Now Playing: " + upNext.removeFirst());
        System.out.println("Next Song: " + upNext.peekFirst());
        System.out.println("Updated Playlist: " + upNext);
    }
}
