/**
 * Класс для хранения данных пользователя.
 * Поля защищены, доступ через методы.
 */
public class Main {
    // Приватные поля (инкапсуляция)
    private String login;       // имя пользователя
    private String mail;        // электронная почта
    private String secretCode;  // пароль (не показывается)


    public void setUsername(String name) {
        if (name != null && !name.isEmpty()) {
            this.login = name.trim();
        }
    }

    // Проверка email на наличие @
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.err.println("Ошибка: некорректный email!");
            return;
        }
        this.mail = email;
    }

    // Пароль должен быть не короче 6 символов
    public void setPassword(String pass) {
        if (pass == null || pass.length() < 6) {
            System.err.println("Ошибка: пароль слишком короткий!");
            return;
        }
        this.secretCode = pass;
    }

    // Вывод информации (без пароля)
    public void showProfile() {
        System.out.println("=== Данные пользователя ===");
        System.out.println("Логин: " + (login != null ? login : "не указан"));
        System.out.println("Email: " + (mail != null ? mail : "не указан"));
        System.out.println("Пароль: [скрыто]");
    }
}