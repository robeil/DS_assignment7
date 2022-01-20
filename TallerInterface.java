package CS221Course.src.DS_assignment7;

public interface TallerInterface<E> {

    E push(E obj);
    E peek();
    E pop();
    boolean empty();
    int size();

}
