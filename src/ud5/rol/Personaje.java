package ud5.rol;

public class Personaje {

    public String nombre, raza;
    public int nivel, exp, hp, hpAct;
    double fuerza, agi, cons;

    Personaje(String nombreIn, String razaIn, int nivelIn, int expIn, double fuerzaIn, double agiIn, double consIn, int hpIn) throws Exception {
        if (razaIn.toLowerCase().equals("humano")|| razaIn.toLowerCase().equals("orco") || razaIn.toLowerCase().equals("humano")|| razaIn.toLowerCase().equals("elfo")|| razaIn.toLowerCase().equals("hobbit")|| razaIn.toLowerCase().equals("troll") ) {
            raza=razaIn.toLowerCase();
        } else raza=null;
        nombre=nombreIn;
        if (nivelIn>0 && expIn>=0 && nombre!=null && fuerzaIn>0 && agiIn>0 && consIn>0 && hpIn>0 && raza!=null) {
            nombre=nombreIn;
            nivel=nivelIn;
            exp=expIn;
            fuerza=fuerzaIn;
            agi=agiIn;
            cons=consIn;
            hp=hpIn;
            hpAct=hp;
        } else throw new Exception("Valores incorrectos");
        }

    Personaje(String nombreIn, String razaIn, double fuerzaIn, double agiIn, double consIn) throws Exception {
        if (razaIn.toLowerCase().equals("humano")|| razaIn.toLowerCase().equals("orco") || razaIn.toLowerCase().equals("humano")|| razaIn.toLowerCase().equals("elfo")|| razaIn.toLowerCase().equals("hobbit")|| razaIn.toLowerCase().equals("troll") ) {
            raza=razaIn.toLowerCase();
        } else raza=null;
        nombre=nombreIn;
        if (fuerzaIn>0 && nombre!=null && agiIn>0 && consIn>0 && raza!=null) {
            nivel=1;
            exp=0;
            nombre=nombreIn;
            fuerza=fuerzaIn;
            agi=agiIn;
            cons=consIn;
            hp=50+(int)cons;
            hpAct=hp;
        }  else throw new Exception("Valores incorrectos");
    }

    Personaje(String nombreIn, String razaIn) throws Exception {
        if (razaIn.toLowerCase().equals("humano")|| razaIn.toLowerCase().equals("orco") || razaIn.toLowerCase().equals("humano")|| razaIn.toLowerCase().equals("elfo")|| razaIn.toLowerCase().equals("hobbit")|| razaIn.toLowerCase().equals("troll") ) {
            raza=razaIn.toLowerCase();
        } else raza=null;
        nombre=nombreIn;
        if (raza!=null && nombre!=null) {
            nivel=1;
            exp=0;
            nombre=nombreIn;
            fuerza=rng(1,100);
            agi=rng(1,100);
            cons=rng(1,100);
            hp=50+(int)cons;
            hpAct=hp;
        } else throw new Exception("Valores incorrectos");
    }

    Personaje(String nombreIn) throws Exception {
            nombre=nombreIn;
            if (nombre!=null) {
                nivel=1;
                exp=0;
                nombre=nombreIn;
                raza="humano";
                fuerza=rng(1,100);
                agi=rng(1,100);
                cons=rng(1,100);
                hp=50+(int)cons;
                hpAct=hp;
            }
    }

    void mostrar() {
        System.out.println("NOMBRE: "+nombre);
        System.out.println("RAZA: "+raza);
        System.out.println("NIVEL//EXP: "+nivel+" // "+exp);
        System.out.println("VIDA MAXIMA: "+hp);
        System.out.println("FUERZA: "+ fuerza);
        System.out.println("CONSTITUCION: "+cons);
        System.out.println("AGILIDAD: "+agi);
    }

    public String toString() {
            return nombre+"("+hpAct+"/"+hp+")";
        }

    static int rng(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    byte sumarExp(int puntos) {
        byte totalNiveles=0;
        exp=exp+puntos;
        for (int i = 0; i < Math.floor(exp/1000); i++) {
            totalNiveles++;
            subirNivel();
            exp=exp-1000;
        }
        return totalNiveles;
    }

    void subirNivel() {
        nivel++;
        fuerza=fuerza*1.05;
        agi=agi*1.05;
        cons=cons*1.05;
    }

    void curar() {
        if (hpAct<hp) {
            hpAct=hp;
        }
    }

    Boolean perderVida(int puntos) {
        hpAct=hpAct-puntos;
        if (hpAct<=0) {
            hpAct=0;
            return true;
        } else return false;
    }

    Boolean estaVivo() {
        if (hpAct>0) {
            return true;
        } else return false;
    }

    int atacar(Personaje enemigo) {
        int atk, def, dif;
        atk=(int)fuerza+rng(1, 100);
        def=(int)agi+rng(1, 100);
        dif = atk-def;
        if (dif>0) {
            if (dif>enemigo.hpAct) {
                dif=enemigo.hpAct;
            }
            enemigo.perderVida(dif);
            enemigo.sumarExp(dif);
            sumarExp(dif);
            return dif;
        } return 0;
    }
}
