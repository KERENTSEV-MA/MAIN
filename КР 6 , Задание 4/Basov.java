/**
 * Класс Basov наследует Abs и хранит название фильма.
 */
public class Basov extends Abs {
    private String name;
    /**
     * Возвращает название фильма.
     * @return название фильма
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название фильма.
     * @param name название фильма
     */
    public void setName(String name) {
        this.name = name;
    }
}