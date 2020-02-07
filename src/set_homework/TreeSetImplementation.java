package set_homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Implementation of TreeSet
 * @param <T>
 * @author Mary Sukiasyan
 * @see Comparable
 * @see ArrayList
 * @see Collections
 */
public class TreeSetImplementation<T extends Comparable<T>> {

        private ArrayList<T> arrayList;

    /**
     * Initialization of empty TreeSet
     */
        public TreeSetImplementation() {
            this.arrayList = new ArrayList<T>();
        }

    /**
     *
     * @param elem desired element to add to this TreeSet
     * @throws IllegalArgumentException
     */
        public void add(T elem) throws IllegalArgumentException {
            if(elem == null){
                throw new IllegalArgumentException("Null element");
            }
            if(!arrayList.contains(elem)) {
                arrayList.add(elem);
            }
            Collections.sort(this.arrayList);
        }

        public int getSize() {
            return arrayList.size();
        }

        public void remove(T elem){
            if(arrayList.contains(elem)){
                arrayList.remove(elem);
            }
        }

        public boolean contains(T elem){
            if(arrayList.contains(elem)){
                return true;
            }
            return false;
        }

        public T get(int i) throws ArrayIndexOutOfBoundsException {
            if(i>arrayList.size() || i<arrayList.size()){
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            }
            return arrayList.get(i);
        }
    }