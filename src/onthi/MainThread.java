package onthi;

import java.util.ArrayList;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Game> listGame = new ArrayList<>();
        while (true){
            System.out.println("Quản lý thông tin game");
            System.out.println("1. Nhập thông tin game.");
            System.out.println("2. Hiển thị thông tin game.");
            System.out.println("3. Xóa game.");
            System.out.println("4. Thoát chương trình.");
            System.out.println("Mời nhập vào lựa chọn của bạn: ");
            int choice = 0;
            while (true){
                try {
                    choice = scanner.nextInt();
                    break;
                } catch (Exception ex) {
                    System.out.println("Bạn phải nhập vào ký tự là số");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice){
                case 1:
                    System.out.println("Nhập mã game: ");
                    int id = 0;
                    while (true){
                        try{
                            id = scanner.nextInt();
                            break;
                        } catch (Exception ex) {
                            System.out.println("Bạn phải nhập vào ký tự là số !");
                        } finally {
                            scanner.nextLine();
                        }
                    }
                    System.out.println("Nhập tên game: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá game: ");
                    double price = 0;
                    while (true){
                        try{
                            price = scanner.nextDouble();
                            break;
                        } catch (Exception ex){
                            System.out.println("Bạn phải nhập vào ký tự là số !");
                        } finally {
                            scanner.nextLine();
                        }
                    }
                    System.out.println("Nhập tên nhà phát hành: ");
                    String publicBy = scanner.nextLine();
                    System.out.println("Nhập ngày phát hành: ");
                    String publicDate = scanner.nextLine();
                    System.out.println("Nhập trạng thái game: ");
                    int status = 0;
                    while (true){
                        try {
                            status = scanner.nextInt();
                            break;
                        } catch (Exception ex) {
                            System.out.println("Bạn phải nhập vào ký tự là số !");
                        } finally {
                            scanner.nextLine();
                        }
                    }

                    Game game = new Game(id, name, price, publicBy, publicDate, status);
                    listGame.add(game);
                    break;

                case 2:
                    if (listGame.size() != 0){
                        for (int i = 0; i < listGame.size(); i++) {
                            System.out.println(listGame.get(i).toString());
                        }
                    } else {
                        System.out.println("Hiện không có game nào trong danh sách");
                    }
                    break;

                case 3:
                    if (listGame.size() != 0){
                        System.out.println("Nhập vào id game bạn muốn xóa: ");
                        int deleteGame = 0;
                        while (true){
                            try{
                                deleteGame = scanner.nextInt();
                                break;
                            } catch (Exception ex) {
                                System.out.println("Bạn phải nhập vào ký tự là số!");
                            } finally {
                                scanner.nextLine();
                            }
                        }
                        for (int i = 0; i < listGame.size(); i++) {
                            if (deleteGame == listGame.get(i).getId()){
                                listGame.remove(i);
                                System.out.println("Bạn đã xóa game thành công");
                            } else {
                                System.out.println("không có game nào có mã game như vậy");
                            }
                        }
                    } else {
                        System.out.println("Hiện không có game nào trong danh sách");
                    }
                    break;

                case 4:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn sai, mời nhập lại");
                    break;
            }

        }
    }
}
