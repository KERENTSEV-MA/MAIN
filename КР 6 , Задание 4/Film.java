import java.util.Scanner;

/**
 * Класс Film наследует Basov и реализует интерфейс Intr.
 * Содержит поле Cena для цены билета.
 */
public class Film extends Basov implements Intr {
    private double cena;

    /**
     * Возвращает цену билета.
     * @return цена билета
     */
    public double getCena() {
        return cena;
    }

    /**
     * Устанавливает цену билета.
     * @param cena цена билета
     */
    public void setCena(double cena) {
        this.cena = cena;
    }

    public void Read(Basov[] array, int count) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            Film film = new Film();
            System.out.print("Введите название фильма: ");
            film.setName(scanner.nextLine());
            System.out.print("Введите цену билета: ");
            film.setCena(scanner.nextDouble());
            scanner.nextLine(); // потребление новой строки
            array[i] = film;
        }
    }
}