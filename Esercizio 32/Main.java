import java.util.ArrayList;

public class Main {

    public static class Stack<T> {
        private ArrayList<T> stack;

        public Stack() {
            stack = new ArrayList<>();
        }

        public void push(T elemento) {
            stack.add(elemento);
        }

        public T pop() {
            if (stack.isEmpty()) {
                System.out.println("Lo stack è vuoto!");
                return null;
            }
            return stack.remove(stack.size() - 1);
        }

        public T peek() {
            if (stack.isEmpty()) {
                System.out.println("Lo stack è vuoto!");
                return null;
            }
            return stack.get(stack.size() - 1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("Primo");
        stringStack.push("Secondo");
        stringStack.push("Terzo");

        System.out.println("Peek (in cima allo stack): " + stringStack.peek());

        System.out.println("Pop (rimuovi in cima allo stack): " + stringStack.pop());

        System.out.println("Peek (in cima allo stack dopo il pop): " + stringStack.peek());

        System.out.println("Pop (rimuovi in cima allo stack): " + stringStack.pop());
        System.out.println("Pop (rimuovi in cima allo stack): " + stringStack.pop());

        System.out.println("Lo stack è vuoto? " + stringStack.isEmpty());
    }
}
