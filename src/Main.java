public class Main {
    public static void main(String[] args) {
        Transition[] transitions = {
                new Transition(0, 'b', 1),
                new Transition(1, 'b', 2),
                new Transition(2, 'b', 3),
                new Transition(1, 'a', 0),
                new Transition(3, 'c', 4)
        };

        DFA dfa = new DFA(5, transitions,0, new int[]{3, 4});

        System.out.println(dfa.recognize("bbbc"));
        System.out.println(dfa.recognize("bababbbc"));
        System.out.println(dfa.recognize("babbbbc"));
        System.out.println(dfa.recognize("bbc"));
        System.out.println(dfa.recognize("abbc"));
    }
}
