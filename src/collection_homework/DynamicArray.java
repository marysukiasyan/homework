package collection_homework;

public class DynamicArray {

    private Student[] studentsArray;
    private int size;
    private int count;

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public int getSize() {
        return size;
    }

    public DynamicArray(){
        studentsArray = new Student[1];
        count = 0;
        size = 1;
    }

    public void add(Student student){
        if(count == size){
            growSize();
        }
        studentsArray[count] = student;
        count++;
    }

    public void growSize(){
        Student tempStudentArr[] = null;
        if(count == size) {
            tempStudentArr = new Student[size + 1];
            for (int i = 0; i < size; i++) {
                tempStudentArr[i] = studentsArray[i];
            }
        }
        studentsArray = tempStudentArr;
        size ++;
    }

    public void remove(Student student) {
        int removedStudentIndex = 0;
        Student tempStudentArr[] = null;
        for (int i = 0; i < size; i++) {
            if (studentsArray[i].equals(student)) {
                removedStudentIndex = i;
                break;
            }
        }
        tempStudentArr = new Student[size - 1];
        for (int i = 0; i < removedStudentIndex; i++) {
            tempStudentArr[i] = studentsArray[i];
        }
        for (int i = removedStudentIndex; i < size - 1; i++) {
            tempStudentArr[i] = studentsArray[i + 1];
        }
        studentsArray = tempStudentArr;
        size--;
    }
        public int size() {
            return size;
        }

        Student get(int index){
            if (index < size) {
                return studentsArray[index];
            }
            else {
                return null;
            }
        }
}