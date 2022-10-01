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




    }
}
