abstract class Progression {            //задаём абстрактный класс для дальнейшего использования в качестве основны
    protected double first;
    protected double diff;

    public Progression (double first, double diff) {
        this.first = first;
        this.diff = diff;
    }
    public abstract double calculateSum (int n);

    }

    class ArithmProgression extends Progression {
        public ArithmProgression(double first, double diff) {
            super(first, diff);
        }
        @Override
        public double calculateSum(int n) {
            if (n >= 0)
                return n * (2 * first + (n - 1) * diff) / 2;             //расчёт суммы арифм прогрессии с упрощённой формулой(при n>= 0)
            else
                throw new IllegalArgumentException("Invalid number of elements");
        }
    }
    class GeometrProgression extends Progression {
        public GeometrProgression (double first, double diff) {
            super(first, diff);
        }
        @Override
        public double calculateSum (int n) {
            if (n >= 0)
                return first * (1 - Math.pow(diff, n)) / (1 - diff);   //расчёт суммы геом прогрессии с упрощённой формулой (при n>=0)
            else
                throw new IllegalArgumentException("Invalid number of elements");

        }
    }