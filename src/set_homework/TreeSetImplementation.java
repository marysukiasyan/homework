package set_homework;

import set_homework.exception.ElementIsNull;
import set_homework.exception.IndexIsIncorrect;

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

        public int getSize() {
            return arrayList.size();
        }

        public void remove(T elem){
            if(elem == null){
                throw new ElementIsNull("Null element");
            }
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

        public void print(){

            for (T i: arrayList) {
                System.out.println(i);
            }
        }
    }