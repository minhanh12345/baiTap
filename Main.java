import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[0];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Thêm");
            System.out.println("2.Tìm kiếm theo id");
            System.out.println("3.Xoa");
            System.out.println("4.Show");
            System.out.println("5.Exit");
            System.out.println("6.Edit");

            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    arrStudent = Manager.create(arrStudent);

                    break;
                case 2:
                    System.out.println("nhap ID");
                    int id = sc.nextInt();
                    int count = 0;
                    for (int i = 0; i < Manager.arrID.length; i++) {
                        if (Manager.arrID[i] == id) {
                            count = 1;
                            System.out.println(arrStudent[i]);
                            break;
                        } else count = 0;
                    }
                    if (count == 0) {
                        System.out.println("ko co id do");
                    }
                    break;
                case 3:
                    System.out.println("nhap id can xoa");
                    int idxoa = sc.nextInt();
                    int countxoa = 0;
                    for (int i = 0; i < Manager.arrID.length; i++) {
                        if (Manager.arrID[i] == idxoa) {
                            countxoa = 1;
                            for (int j = i; j < arrStudent.length-1; j++) {
                                arrStudent[j] = arrStudent[j + 1];
                                Manager.arrID[j] = Manager.arrID[j + 1];

                            }
                            arrStudent[arrStudent.length-1]=null;
                            Manager.arrID[arrStudent.length-1]=0;
                            break;

                        } else countxoa = 0;
                    }
                    if (countxoa == 0) {
                        System.out.println("ko co id do");
                    }
                    break;

                case 4:
                    for (int i=0;i< arrStudent.length;i++) {if(arrStudent[i]!=null)
                        System.out.println(arrStudent[i]);
                    }
                    break;
                case 5:
                    System.exit(0);
                case 6:
                    System.out.println("nhap id can sua");
                    int idsua=sc.nextInt();
                    for (int i=0;i<Manager.arrID.length;i++){
                        if(Manager.arrID[i]==idsua){
                            System.out.println("Nhập Name:");
                            String name = sc.next();
                            System.out.println("Nhập Gender:");
                            String gender = sc.next();
                            System.out.println("Nhập Age:");
                            int age = Integer.parseInt(sc.next());
                            arrStudent[i]=new Student(idsua,name,gender,age);
                            break;
                        }
                    }
                    break;
            }
        } while (true);
    }
}