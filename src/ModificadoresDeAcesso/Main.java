package ModificadoresDeAcesso;

import ModificadoresDeAcesso.Protected.ClasseB;
// import ModificadoresDeAcesso.Protected.ClasseC;

public class Main  {
    public static void main(String[] args) {
        var b = new ClasseB();
        // var c = new ClasseC();

        // System.out.println(c.getValorPadrao());
        b.imprirValorProtegido();
    }
}
