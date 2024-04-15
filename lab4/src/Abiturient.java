import java.util.Arrays;
import java.util.Comparator;

class Abiturient {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String phone;
    private int[] grades;

    public Abiturient(int id, String lastName, String firstName, String patronymic, String address, String phone, int[] grades) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.grades = grades;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void printAbiturientsInAlphabeticalOrder(Abiturient[] abiturients) {
        Arrays.sort(abiturients, Comparator.comparing(Abiturient::getLastName));
        for (Abiturient abiturient : abiturients) {
            System.out.println(abiturient.getLastName() + " " + abiturient.getFirstName() + " " + abiturient.getPatronymic());
        }
    }

    public static void main(String[] args) {
        Abiturient[] abiturients = new Abiturient[3];
        abiturients[0] = new Abiturient(1, "Іванов", "Петро", "Олександрович", "вул. Шевченка 1", "123456789", new int[]{80, 85, 90});
        abiturients[1] = new Abiturient(2, "Петров", "Іван", "Олегович", "вул. Лесі Українки 2", "987654321", new int[]{75, 85, 95});
        abiturients[2] = new Abiturient(3, "Сидоров", "Олег", "Ігорович", "вул. Київська 3", "111222333", new int[]{70, 80, 90});

        System.out.println("Список абітурієнтів в алфавітному порядку:");
        Abiturient.printAbiturientsInAlphabeticalOrder(abiturients);
    }
}

