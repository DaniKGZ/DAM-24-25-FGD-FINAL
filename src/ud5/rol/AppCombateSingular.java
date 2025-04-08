package ud5.rol;

public class AppCombateSingular {
    public static void main(String[] args) throws Exception {
    Personaje p1 = new Personaje("Jose");
    Personaje p2 = new Personaje("Albert", "orco");
    p1.mostrar();
    System.out.println("\n---------------------------\n");
    p2.mostrar();
    System.out.println("\n---------------------------\n");
    if (p1.agi>p2.agi) {
        do {
            System.out.println(p1.nombre+" ataca e inflije "+p1.atacar(p2)+" puntos de daño.");
            System.out.println(p2.toString());
            if (p2.estaVivo()) {
                System.out.println(p2.nombre+" ataca e inflije "+p2.atacar(p1)+" puntos de daño.");
                System.out.println(p1.toString());
            }
        } while (p1.estaVivo() && p2.estaVivo());
    } else {
        do {
            System.out.println(p2.nombre+" ataca e inflije "+p2.atacar(p1)+" puntos de daño.");
            System.out.println(p1.toString());
            if (p1.estaVivo()) {
                System.out.println(p1.nombre+" ataca e inflije "+p1.atacar(p2)+" puntos de daño.");
                System.out.println(p2.toString()); 
            }
        } while (p1.estaVivo() && p2.estaVivo());
    }
    if (p1.estaVivo()==false) {
        System.out.println(p2.nombre+" gana el combate!");
    } else if(p2.estaVivo()==false) {
        System.out.println(p1.nombre+" gana el combate!");
    }
    }
}
