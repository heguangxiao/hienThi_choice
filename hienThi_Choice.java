import java.util.Scanner;

public class hienThi_Choice {

    static void chuNhat(int a, int b){
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++){
                System.out.printf("  *  ");
            }
            System.out.println(" ");
        }
    }

    static void tamGiac(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.printf("  *");
            }
            System.out.println(" ");
        }
    }

    static void tamGiacNguoc(int a){
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++){
                System.out.printf("  *");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice!=4) {
            System.out.println("Menu: ");
            System.out.println("1 . Print the rectangle");
            System.out.println("2 . Print the square triangle");
            System.out.println("3 . Print isosceles triangle");
            System.out.println("4 . Exit");


            System.out.println("Input your choice : ");
            choice = input.nextInt();
            int width = 0;
            int height = 0;
            switch (choice) {
                case 1:
                    System.out.println("Input your width : ");
                    width = input.nextInt();
                    System.out.println("Input your height : ");
                    height = input.nextInt();
                    chuNhat(width, height);
                    break;
                case 2:
                    System.out.println("Input your width : ");
                    width = input.nextInt();
                    tamGiac(width);
                    break;
                case 3:
                    System.out.println("Input your width : ");
                    width = input.nextInt();
                    tamGiacNguoc(width);
                    break;
                case 4:
                    //System.exit(0);
                    break;
                default:
                    System.out.println("No choice !");
            }
        }
    }
}
