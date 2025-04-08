package ud5.exercicios.horas.herenciaejercicios.cajas;

public class Unidad {
    String ud;
    Unidad(String ud) throws Exception{
            if (ud=="mm" || ud=="cm" || ud=="dm" || ud=="m" || ud=="dam" || ud=="hm" || ud=="km") {
                this.ud=ud;
            } else throw new Exception("Unidad no valida. Usa desde mm hasta km.");
    }
}
