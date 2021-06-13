import java.util.Scanner;

public class Manager {
    static int i = 0;
    static int[] arrID = new int[10];

    public static Student[] create(Student[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Id:");
        int id = Integer.parseInt(sc.nextLine());
        arrID[i] = id;
        i++;
        System.out.println("Nhập Name:");
        String name = sc.nextLine();
        System.out.println("Nhập Gender:");
        String gender = sc.nextLine();
        System.out.println("Nhập Age:");
        int age = Integer.parseInt(sc.nextLine());

        Student student = new Student(id, name, gender, age);
        Student[] arrNew = new Student[arr.length + 1];


        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];

        }

        arrNew[arrNew.length - 1] = student;

        return arrNew;

    }


}