/**
 * Абстракт класс Abs содержит метод Iskatel для поиска фильма в массиве объектов.
 */
public abstract class Abs {
    /**
     * Метод Iskatel ищет заданный фильм в массиве объектов.
     * @param array массив объектов типа Basov
     * @param count количество объектов
     * @param filmName наименование искомого фильма
     */
    public void Iskatel(Basov[] array, int count, String filmName) {
        for (int i = 0; i < count; i++) {
            if (array[i].getName().equalsIgnoreCase(filmName)) {
                System.out.println(filmName + " на позиции " + (i + 1));
                return;
            }
        }
        System.out.println(filmName + "не наден");
    }
}