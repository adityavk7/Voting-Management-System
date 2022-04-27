package voting.management;

class Administrator {

    private static Administrator head = null;

    public admin h;

    private Administrator() {
        h = new admin();
        h.setVisible(true);
    }

    public static Administrator getInstance() {
        if (head == null) {
            head = new Administrator();
        }

        return head;
    }
}

public class VotingSystem {

    public static void main(String[] args) {

        Administrator x;
        x = Administrator.getInstance();
    }

}
