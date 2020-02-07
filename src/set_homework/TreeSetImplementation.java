package set_homework;

import set_homework.exception.ElementIsNull;

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
     *Adds element to TreeSet
     * @param elem desired element to add to this TreeSet
     */
        public void add(T elem) {
            if(elem == null){
                throw new ElementIsNull("Null element");
            }
            if(!arrayList.contains(elem)) {
                arrayList.add(elem);
            }
            Collections.sort(this.arrayList);
        }

    /**
     * Gets size of TreeSet
     * @return size of TreeSet
     */

    public int getSize() {
            return arrayList.size();
        }

    /**
     * Removed element from TreeSet
     * @param elem desired element to be removed
     */
        public void remove(T elem){
            if(elem == null){
                throw new ElementIsNull("Null element");
            }
            if(arrayList.contains(elem)){
                arrayList.remove(elem);
            }
        }

    /**
     *
     * @param elem element to check if TreeSet contains
     * @return true if element is contained false otherwise
     */

    public boolean contains(T elem){
            if(arrayList.contains(elem)){
                return true;
            }
            return false;
        }

    /**
     * prints TreeSet
     */

    public void print(){
            for (T i: arrayList) {
                System.out.println(i);
            }
        }
    }