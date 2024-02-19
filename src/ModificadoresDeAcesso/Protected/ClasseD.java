package ModificadoresDeAcesso.Protected;

public class ClasseD {
    private int valorPrivado = 40;

    public int getValorPrivado() {
        return valorPrivado;
    }

    public void setValorPrivado(int valorPrivado) {
        this.valorPrivado = valorPrivado;
    }


    public static void main(String[] args) {
        var d = new ClasseD();

        System.out.println(d.valorPrivado);
    }
}
