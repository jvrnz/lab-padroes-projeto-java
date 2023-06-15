// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    private Comportamento controleTemp;

    public void setControleTemp(Comportamento controleTemp) {
        this.controleTemp = controleTemp;
    }

    public void onAquecimento() {
        controleTemp.aquecer();
    }

    public void onResfriar() {
        controleTemp.resfriar();
    }

}