import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 25000 );
        empl[1] = new Employee("Петров Петр Петрович", 2, 30000);
        empl[2] = new Employee("Сидоров Иван Петрович", 3, 35000);
        empl[3] = new Employee("Фролов Александр Александрович", 4, 27500);
        empl[4] = new Employee("Садовникова Екатерина Владимировна", 5, 36000);
        for (Employee e: empl) {
            System.out.println(e);
        }
        int salaryOfEmployee = empl[1].getSalary();
        int salaryOfEmployee1 = empl [0].getSalary();
        int salaryOfEmployee2 = empl [2].getSalary();
        int salaryOfEmployee3 = empl [3].getSalary();
        int salaryOfEmployee4 = empl [4].getSalary();
        System.out.println(IntStream.of(salaryOfEmployee1+salaryOfEmployee2+salaryOfEmployee3+salaryOfEmployee4+salaryOfEmployee).sum());

        Arrays.sort(empl);
    }

}
