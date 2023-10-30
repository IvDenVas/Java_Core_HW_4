package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String login, password, confirmPassword;
        boolean x = true;
        while (x) {
            try {
                UserData userData = new UserData();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите логин: ");
                login = scanner.nextLine();
                System.out.println("Введите пароль: ");
                password = scanner.nextLine();
                System.out.println("Подтвердите пароль: ");
                confirmPassword = scanner.nextLine();
                if(Service.check(login,password,confirmPassword)) {
                    userData.setLogin(login);
                    userData.setPassword(password);
                    userData.setConfirmPassword(confirmPassword);
                    x = false;
                }
                scanner.close();
                System.out.println("Добавлен пользователь, его данные: ");
                System.out.println(userData);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}