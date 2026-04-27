public class EventAttendees {
    public static void main(String[] args) {
        String[] names1 = {"Alice", "Bob", "Charlotte", "David", "Eve"};
        manageNames(names1);
        String[] names2 = {"Tom", "Sam", "Jim", "Tim", "Kim"};
        manageNames(names2);
        String[] names3 = {"Ann", "Elizabeth", "Joe", "Alex", "Zoe"};
        manageNames(names3);
        String[] names4 = {"alice", "Bob", "CHARLOTTE", "david", "EVE"};
        manageNames(names4);
        String[] names5 = {"A", "B", "C", "D", "E"};
        manageNames(names5);
    }

    public static void manageNames(String[] names) {
        String longestName = names[0];
        String shortestName = names[0];
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.print("Names in Reverse Order: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
        System.out.println();
    }
}
