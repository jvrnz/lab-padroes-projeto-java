public class HabilitarResfriamento implements Comportamento {
    @Override
    public void resfriar(){
        System.out.println("Aquecimento ON.");
    }

    @Override
    public void aquecer() {
        System.out.println("Resfriamento OFF.");
    }
}
