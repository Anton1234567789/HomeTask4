
import java.util.*;
import java.util.EmptyStackException;
import java.util.Objects;

public interface Stack<E>  {

    void push(E o) throws StackException;

    E pop() throws  StackException;

    void clear();

    void print();

}
class StackException extends Exception {

    EmptyStackException exception = new EmptyStackException();


    public Exception getException() {
        return exception;
    }
}