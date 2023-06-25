package leson4;

public class BancAcaunt {
    int id;
    String name;
    int balans;
    int popolnenieScheta(int summ){

        balans += summ;
        return balans;
    }

    int  snyatieSoScheta( int summ){
        if (summ > balans){
            System.out.println("na schety nedostatochno");
        }else {
            balans -= summ;
        }
        return balans;

    }
}


class BencAccoyntTest {
    public static void main(String[] args) {
        BancAcaunt myAccount = new BancAcaunt();
        BancAcaunt yourAccount = new BancAcaunt();
        BancAcaunt HisAccount = new BancAcaunt();

        myAccount.id = 1;
        myAccount.name = "Вася";
        myAccount.balans = 3000;

        yourAccount.id = 1;
        yourAccount.name = "Вася";
        yourAccount.balans = 1000;

        HisAccount.id = 1;
        HisAccount.name = "Вася";
        HisAccount.balans = 1000;

       // System.out.println(HisAccount.id);
        myAccount.popolnenieScheta(2);
        System.out.println(myAccount.balans);
        myAccount.snyatieSoScheta(5000);
        System.out.println(myAccount.balans);
        System.out.println(HisAccount.balans);

    }
}
