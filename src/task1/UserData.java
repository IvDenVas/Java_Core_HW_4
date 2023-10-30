package task1;

public class UserData {
    private String login;
    private String password;
    private String confirmPassword;

    public UserData() {
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "Логин: " + login + "\nПароль: " + password;
    }
}
