package set_homework;

import java.util.ArrayList;
import java.util.Collections;

public class SetImplementation<T extends Comparable<T>> {

        private ArrayList<T> arrayList;

        public SetImplementation() {
            this.arrayList = new ArrayList<T>();
        }

        public void add(T elem) throws IllegalAccessException {
            if(elem == null){
                throw new IllegalAccessException("bla");
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

        public T get(int i) throws Exception {
            if(i>arrayList.size()){
                throw new Exception("bla");
            }
            return arrayList.get(i);
        }
    }