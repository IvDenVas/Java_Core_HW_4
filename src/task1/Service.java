package task1;
public class Service {

    public static boolean check(String login, String password, String confirmPassword) throws Exception {
        try {
            if (login.length() > 19 ) throw new WrongLoginException();
            else if (password.length() > 19) throw new WrongPasswordException("Пароль должен быть менее 20 символов!");
            else if (!password.equals(confirmPassword)) throw new WrongPasswordException("Пароль не подтвержден!");
            else {
                System.out.println("Успешно.");
                return true;
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new Exception(e.getMessage());
        }
    }
}
