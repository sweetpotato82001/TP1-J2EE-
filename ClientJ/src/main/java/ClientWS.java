import mypackage.BankService;
import mypackage.BanqueWS;
import mypackage.Compte;

public class ClientWS {
    public  static void main(String[] args){
        BankService stub = new BanqueWS().getBankServicePort();
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
