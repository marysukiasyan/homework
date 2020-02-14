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
    public boolean add(T elem) {
        if (elem == null) {
            throw new ElementIsNull("Null element");
        }
        if (!containsElem(arrayList, elem)) {
            arrayList.add(elem);
            Collections.sort(arrayList);
            return true;
        }
            return false;
    }

    /**
     * Checks if element contains in given arrayList
     * @param arrList
     * @param elem
     * @return
     */

    public boolean containsElem(ArrayList<T> arrList, T elem){
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i).equals(elem)) {
                return true;
            }
        }
        return false;
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
        public boolean remove(T elem){
            if(elem == null){
                throw new ElementIsNull("Null element");
            }
            if(containsElem(arrayList, elem)){
                arrayList.remove(elem);
                return true;
            }
            return false;
        }

    /**
     *
     *
     * @param arrayList
     * @param elem element to check if TreeSet contains
     * @return true if element is contained false otherwise
     */

    public boolean contains(ArrayList<T> arrayList, T elem){
            if(this.arrayList.contains(elem)){
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