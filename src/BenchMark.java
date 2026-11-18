public class BenchMark {
    public static Results medir(Runnable accion , String nombre, String sample){
        System.out.println("Funcion " + nombre);
        //tiempo actual 
        long tA = System.nanoTime();
        //accion
        accion.run();
        //tiempo final
        long tF = System.nanoTime();
        Results results = new Results(nombre ,(tF - tA), sample);
        //retornar el timepo de duracion
        return results;
    }
}
