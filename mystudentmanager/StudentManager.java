package hus.oop.mystudentmanager;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private MyList studentList;

    private StudentManager() {
        studentList = new MyLinkedList();  // Assuming MyLinkedList is implemented
    }

    public static StudentManager getInstance() {
        if (instance == null) {
            synchronized (StudentManager.class) {
                if (instance == null) {
                    instance = new StudentManager();
                }
            }
        }
        return instance;
    }

    public MyList getStudentList() {
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        studentList.insertAtEnd(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        studentList.insertAtPosition(student, index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        studentList.remove(index);
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        MyIterator iterator = studentList.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(student)) {
                studentList.remove(index);
                return;
            }
            index++;
        }
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        return (Student) studentList.get(index);
    }

    /**
     * Lọc ra những sinh viên có điểm trung bình trên 15 điểm.
     * @return
     */
    public MyList filterStudentsByAverageGrade() {
        MyList filteredList = new MyLinkedList();
        MyIterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getAverageGrade() > 15) {
                filteredList.insertAtEnd(student);
            }
        }
        return filteredList;
    }

    /**
     * Lọc ra những sinh viên có điểm toán trên 5 điểm.
     * @return
     */
    public MyList filterStudentsByMathGrade() {
        MyList filteredList = new MyLinkedList();
        MyIterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getMathsGrade() > 5) {
                filteredList.insertAtEnd(student);
            }
        }
        return filteredList;
    }
}
