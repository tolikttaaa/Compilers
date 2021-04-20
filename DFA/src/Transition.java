public class Transition {
    private final int fromState;
    private final char input;
    private final int toState;

    public Transition(int fromState, char  input, int toState) {
        this.fromState = fromState;
        this.input = input;
        this.toState = toState;
    }

    public int from() {
        return this.fromState;
    }

    public int to() {
        return this.toState;
    }

    public char input() {
        return this.input;
    }
}
