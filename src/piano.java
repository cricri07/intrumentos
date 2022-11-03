public class piano extends instrumentos implements Icuerda {

    @Override
    public void punteo() {

    }

    @Override
    public void teclas() {
        System.out.println("Piano tengo un sonido de teclas");
    }

    @Override
    protected void tocar() {
        System.out.println("Piano inicio a tocar");
    }
}
