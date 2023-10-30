package task1;

public class WrongLoginException extends Exception{

    @Override
    public String getMessage() {
        return "Логин должен быть менее 20 символов!";
    }
}
