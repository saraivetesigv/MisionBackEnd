package Practicas.practicaLineUp;

//interfaces
abstract class Cancion{
    void SeleccionarCancion(){
        System.out.println("¿Cual cancion quieres?");
        System.out.println("¿Quieres subir el volumen?");
    }
}

interface MostrarCancion{
    void show();
    abstract void TocarCancion();
}

public class VideoCancion implements  MostrarCancion {
    public void show() {
        System.out.println("La cancion que seleccionaste es:");
    }

    public static void main(String[] args) {
        VideoCancion c1 = new VideoCancion();
        c1.TocarCancion();
    }
    public void TocarCancion(){
        System.out.println("Tocando la cancion que seleccionaste");
    }
}
