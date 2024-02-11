package PassagemDeObjeto;

import com.sun.security.jgss.GSSUtil;

public class Garage {
    public void park(Car car){
        System.out.println(car.getMarca() + " de cor " + car.getCor() +  " está estacionando na garagem.");
    }
}
