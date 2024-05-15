import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во фильмов: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Basov[] films = new Film[count];
        Film film = new Film();
        film.Read(films, count);


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("films.dat"))) {
            out.writeObject(films);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("Введите назван фильма для поиска: ");
        String filmName = scanner.nextLine();
        film.Iskatel(films, count, filmName);

        Arrays.sort(films, Comparator.comparingDouble(o -> ((Film) o).getCena()));

        System.out.println("Отсортированный список фильмов по цене:");
        for (Basov b : films) {
            Film f = (Film) b;
            System.out.println(f.getName() + ", Цена: " + f.getCena());
        }
    }
}