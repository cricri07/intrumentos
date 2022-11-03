public class Sonido_musical {
    public static void main(String[] args) {
        Guitarra g= new Guitarra();
        piano p=new piano();
        saxofon s =new saxofon();
        g.tocar();
        g.punteo();
        p.tocar();
        p.teclas();
        s.tocar();
        s.tenor();
    }
}