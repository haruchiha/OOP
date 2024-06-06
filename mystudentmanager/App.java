package hus.oop.mystudentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                // Create Student object from data
                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();

                // Add Student object to StudentManager
                StudentManager.getInstance().append(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (String data : splitData) {
                result.add(data.trim());
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        init();

        // Test the original data
        testOriginalData();

        // Test filter by average grade
        testFilterStudentsByAverageGrade();

        // Test filter by math grade
        testFilterStudentsByMathGrade();
    }

    public static void init() {
        String filePath = "data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        StudentManager manager = StudentManager.getInstance();
        MyList students = manager.getStudentList();
        MyIterator iterator = students.iterator();

        System.out.println("Original Data:");
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("ID: " + student.getId() +
                    ", Name: " + student.getFirstname() + " " + student.getLastname() +
                    ", Year of Birth: " + student.getYearOfBirth() +
                    ", Maths: " + student.getMathsGrade() +
                    ", Physics: " + student.getPhysicsGrade() +
                    ", Chemistry: " + student.getChemistryGrade() +
                    ", Average: " + student.getAverageGrade());
        }
    }

    public static void testFilterStudentsByAverageGrade() {
        StudentManager manager = StudentManager.getInstance();
        MyList filteredStudents = manager.filterStudentsByAverageGrade();
        MyIterator iterator = filteredStudents.iterator();

        System.out.println("Filtered by Average Grade > 15:");
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("ID: " + student.getId() +
                    ", Name: " + student.getFirstname() + " " + student.getLastname() +
                    ", Year of Birth: " + student.getYearOfBirth() +
                    ", Maths: " + student.getMathsGrade() +
                    ", Physics: " + student.getPhysicsGrade() +
                    ", Chemistry: " + student.getChemistryGrade() +
                    ", Average: " + student.getAverageGrade());
        }
    }

    public static void testFilterStudentsByMathGrade() {
        StudentManager manager = StudentManager.getInstance();
        MyList filteredStudents = manager.filterStudentsByMathGrade();
        MyIterator iterator = filteredStudents.iterator();

        System.out.println("Filtered by Maths Grade > 5:");
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("ID: " + student.getId() +
                    ", Name: " + student.getFirstname() + " " + student.getLastname() +
                    ", Year of Birth: " + student.getYearOfBirth() +
                    ", Maths: " + student.getMathsGrade() +
                    ", Physics: " + student.getPhysicsGrade() +
                    ", Chemistry: " + student.getChemistryGrade() +
                    ", Average: " + student.getAverageGrade());
        }
    }
}
