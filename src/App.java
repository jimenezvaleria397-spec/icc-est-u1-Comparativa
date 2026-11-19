public class App {
    public static void main(String[] args) throws Exception {
        Generador g = new Generador();
        BenchMark b = new BenchMark();
        Metodos m = new Metodos();

        System.out.println("==== Math.Random ====");
        int[] list = g.generate(10000);
        System.out.println(list);
        Results benGenList = b.medir(
            () -> g.generate(100), "Generacion de listado ", "10000");
        System.out.println(benGenList);
        //=====================================================================================================
        //Tres arreglos base
        //10000 
        int[] list1= g.generate(10000);
        //50000
        int[] list2= g.generate(50000);
        //100000
        int[] list3= g.generate(100000);

        //HAGO COPIAS DE MI ARREGLO SON 4 COPIAS PARA 4 METODOS
        int[] list1c1 = list1.clone();
        int[] list1c2 = list1.clone();
        int[] list1c3 = list1.clone();
        int[] list1c4 = list1.clone();
        //Copias arr 2
        int[] list2c1 = list2.clone();
        int[] list2c2 = list2.clone();
        int[] list2c3 = list2.clone();
        int[] list2c4 = list2.clone();
        //copias arr 3
        int[] list3c1 = list3.clone();
        int[] list3c2 = list3.clone();
        int[] list3c3 = list3.clone();
        int[] list3c4 = list2.clone();



        //RESULTADOS 
        System.out.println("==== MEDIDAS BUBBLE SORT ====");
        Results resultaM1S1= BenchMark.medir(() -> m.sortBubble(list1c1), "Burbuja", "10.000");
        Results resultaM1S2= BenchMark.medir(() -> m.sortBubble(list2c1), "Burbuja", "50.000");
        Results resultaM1S3= BenchMark.medir(() -> m.sortBubble(list3c1), "Burbuja", "100.000");
        System.out.println(resultaM1S1);
        System.out.println(resultaM1S2);
        System.out.println(resultaM1S3);
        System.out.println("==== MEDIDAS MERGE SORT ====");
        Results resultaM2S1= BenchMark.medir(() -> m.mergeSort(list1c2), "Burbuja", "10.000");
        Results resultaM2S2= BenchMark.medir(() -> m.mergeSort(list2c2), "Burbuja", "50.000");
        Results resultaM2S3= BenchMark.medir(() -> m.mergeSort(list3c2), "Burbuja", "100.000");
        System.out.println(resultaM2S1);
        System.out.println(resultaM2S2);
        System.out.println(resultaM2S3);



        

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
