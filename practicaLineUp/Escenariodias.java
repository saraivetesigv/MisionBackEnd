package Practicas.practicaLineUp;


public class Escenariodias extends Thread{
    @Override
    public void run() {
        System.out.println("El Concierto va iniciando");
    }

    public static void main(String[] args) {
        Escenariodias Dia1 = new Escenariodias();
        Dia1.start();
    }
}


class MainStage implements Runnable{
    @Override
    public void run() {
        System.out.println("El esceario esta lleno");
    }

    public static void main(String[] args) {
        Practicas.practicaLineUp.MainStage h = new  Practicas.practicaLineUp.MainStage();
        Thread t = new Thread(h);
        t.start();
    }
}
