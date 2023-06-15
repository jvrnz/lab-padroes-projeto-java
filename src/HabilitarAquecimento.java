public class HabilitarAquecimento implements Comportamento {
    @Override
    public void resfriar() {
        System.out.println("Resfriamento ON.");
    }

    @Override
    public void aquecer() {
        System.out.println("Aquecimento OFF.");
    }
}