
public class Main {
    public static void main(String[]args){ // для передачи массива аргументов вот ниже
        System.out.println("N1"); // вывод в к.строку
        System.out.println(convert(2));
        System.out.println(convert(3));
        System.out.println(convert(8));

        System.out.println("N2");
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));

        System.out.println("N3");
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));

        System.out.println("N4");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));

        System.out.println("N5");
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println(ternaryEvaluation(-2, -5));

        System.out.println("N6");
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));

        System.out.println("N7");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));

        System.out.println("N8");
        System.out.println(gcdByBruteForce( 48, 18));
        System.out.println(gcdByBruteForce( 8, 52));
        System.out.println(gcdByBruteForce( 259, 28));

        System.out.println("N9");
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));

        System.out.println("N10");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));


    }
    public static float convert(int a) {
        return (a * 3.785f);
    }

    public static int fitCalc(int a, int b) {
        return (a * b);
    }

    public static int containers(int a, int b, int c) {
        return (a * 20 + (b * 50) + (c * 100));
    }

    public static String triangleType(int a, int b, int c) {
        if (a < b + c && c < a + b && b < a + c) //проверка на треуг. (кажд сторона меньше суммы двух других) (&& = и)
            if (a == b && b == c) return ("Равносторонний");
            else if (a == b || b == c || c == a) return ("Равнобедренный"); // || это or
            else return ("Разносторонний");
        else return ("Не треугольник");

    }

    public static int ternaryEvaluation(int a, int b) {
        var eva = (a > b) ? (a) : (b); // условие, ?, затем то что если тру, :, то что если фолс
        return (eva);
    }

    public static int howManyItems(double n, double w, double h) {
        if (w <= 2 && h <= 2 && w > 0 && h > 0) // <= (меньше или равно)
            return (int) ((n / (w * h)/2));
        else return (0);
    }

    public static int factorial(int a) {
        return (a != 1) ? (a * factorial(a - 1)) : 1; // != это не равно как в питоне
    }

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1; //1 всегда может быть нод'ом
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int ticketSaler(int a, double b) { // б - процент скидки
        return (int) (a * b - a* (b / 100 * 28 )); // вторая часть это вычисление которое нужно вычесть чтобы получить цену после скидки
    }
    //28 это комиссия(подгоняется для задачи), 100 для перевода в проценты
    public static int tables(int a, int b) {
        return ( b * 2 >= a) ?  (0):  ((a - b*2) / 2 + a % 2);} // % как и везде остаток
}
