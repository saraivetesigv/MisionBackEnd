package Practicas.practicaLineUp;

class Artistas {
    void EscogerVestuario(){
        System.out.println("Escogiendo Vestuario...");
    }
}

class Ropa extends Artistas{
    void EscogerVestuario(){
        System.out.println("Escogiendo pantalon, camisa y tenis");
    }
}

class Accesorios extends Artistas{
    void EscogerVestuario(){
        System.out.println("Escogiengo lentes y sombrer");
    }
}

public class MostrarVestuarioArtista{
    public static void main(String[] args) {
        Artistas Dj1;
        Dj1 = new Artistas();
        Dj1.EscogerVestuario();
        Dj1 = new Ropa();
        Dj1.EscogerVestuario();



    }
}
