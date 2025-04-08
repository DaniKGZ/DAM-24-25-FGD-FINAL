package ud5.exercicios.horas;


public class HoraExacta extends Hora{
    int sec;

    HoraExacta(int horaIn, int minIn, int secIn) throws Exception{
        super(horaIn, minIn);
        if (secIn>=0 && secIn<=60) {
            sec=secIn;
        } else throw new Exception("La hora debe estar entre 0 y 23 y el minuto/segundo entre 0 y 60.");
    }

   

}
