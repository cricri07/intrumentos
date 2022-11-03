public class saxofon extends instrumentos implements Iviento{
    @Override
    public void tenor() {
        System.out.println("Saxofòn tengo un sonido de tenor");
    }

    @Override
    protected void tocar() {
        System.out.println("saxofon inicio a tocar");

    }
}
