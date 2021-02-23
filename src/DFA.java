import java.util.HashMap;

public class DFA {
    private final int[] terminalStates;
    private final int startState;
    private final HashMap<Character, Integer>[] transitions;

    public DFA(int countOfStates, Transition[] transitions, int startState, int[] terminalStates) {
        this.startState = startState;
        this.terminalStates = terminalStates;

        this.transitions = new HashMap[countOfStates];

        for (int i = 0; i < countOfStates; i++) {
            this.transitions[i] = new HashMap<>();
        }

        for (Transition t : transitions) {
            this.transitions[t.from()].putIfAbsent(t.input(), t.to());
        }
    }

    public boolean recognize(String input) {
        int curState = this.startState;

        for (char curChar : input.toCharArray()) {
            HashMap<Character, Integer> curTransition = transitions[curState];

            if (curTransition.containsKey(curChar)) {
                curState = curTransition.get(curChar);
            } else {
                return false;
            }
        }

        // Is terminal state?
        for (int tState : terminalStates) {
            if (curState == tState) {
                return true;
            }
        }

        return false;
    }
}
