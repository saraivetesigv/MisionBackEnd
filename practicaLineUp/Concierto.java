package Practicas.practicaLineUp;

//Herencia

public class Concierto {
    int cantidadArtistas = 33;
    double costoboleto = 2500;

}

class DetallesConcierto extends  Concierto{

    String dia1 = "Viernes";
    String dia2 = "Sabado";
    String dia3 = "Domingo";

    public void detalleConcert(){
        DetallesConcierto dias = new DetallesConcierto();
        System.out.println("El dia "+dias.dia1+ " inicia el evento");
        System.out.println("El dia "+dias.dia3+ " Finaliza el evento");
    }
    void NombreConcierto(){
        System.out.println("El nombre del conicerto es: Melodia");
        detalleConcert();
    }
}


class Detalles extends DetallesConcierto{
    public static void main(String[] args) {
        Detalles concert = new Detalles();
        concert.NombreConcierto();

    }
}


