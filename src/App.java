import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Generador g = new Generador();
        BenchMark b = new BenchMark();

        System.out.println("==== Math.Random ====");
        List<Integer> list = g.generate(10000);
        System.out.println(list);

        

        Results benGenList = b.medir(
            () -> g.generate(100), "Generacion de listado ", "10000");
        System.out.println(benGenList);

        /*long nanoTime = System.nanoTime();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Nano Time: " +nanoTime);
        System.out.println("Current Time: " + currentTimeMillis);

        Runnable x = () -> {
            System.out.println("Ejecutando Tarea 1");
            System.out.println("Ejecutando Tarea 2");

        };
        System.out.println("Ejecucion de la funcion Runnable");
        x.run();*/
    }
}
