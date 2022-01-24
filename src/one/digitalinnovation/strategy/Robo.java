package one.digitalinnovation.strategy;

public class Robo {
    private IComportamento comprtamento;

    public void setComprtamento(IComportamento comprtamento) {
        this.comprtamento = comprtamento;
    }

    public void mover(){
        comprtamento.mover();
    }
}
