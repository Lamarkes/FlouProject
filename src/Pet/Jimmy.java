package Pet;

import Exceptions.ValorIncorreto;
import Interfaces.Acoes.*;
import Interfaces.Ambientes.*;
import Interfaces.IBrincar;
import Pet.Model.PetModel;

public class Jimmy extends PetModel implements IAssistir, IComer, ITomarBanho, IBanheiro, ICozinha, ISala, IBrincar {

    boolean fazerCambalhota;

    IBrincar brincar;

    public Jimmy(IBrincar brincar) {
        this.brincar = brincar;
    }

    public void fazerCambalhota(boolean fC) {
        this.fazerCambalhota = fC;
    }

    public void sorri(String s) {
        super.sorri(s);
    }

    public void grita(boolean g){
        super.grita(g);
    }

    public void idade(int i){
        super.idade(i);
    }

    public void nadar(boolean n){
        super.nadar(n);
    }


    @Override
    public void assistir() {
        System.out.println("Jimmy esta assistindo tv.");
    }

    @Override
    public void comer() {
        System.out.println("Jimmy esta comendo.");

    }

    @Override
    public void tomarBanho() {
        System.out.println("Jimmy esta tomando banho.");
    }

    @Override
    public void banheiro() {
        System.out.println("Jimmy esta no banheiro.");
    }

    @Override
    public void cozinha() {
        System.out.println("Jimmy esta na cozinha.");

    }

    @Override
    public void sala() {
        System.out.println("Jimmy esta na sala.");
    }


    public void brincarCom() throws ValorIncorreto {
        this.brincar.brincarCom();
    }
}