public class Guitarra extends instrumentos implements Icuerda{
    @Override
    public void punteo() {
        System.out.println("Guitarra tengo un sonido de punteo");
    }

    @Override
    public void teclas() {

    }

    @Override
    protected void tocar() {
        System.out.println("Guitarra inicio a tocar");
    }
}
