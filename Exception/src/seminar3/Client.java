package seminar3;

public class Client {
    public void setNaim(String naim) {
        this.naim = naim;
    }

    public void setSumCheck(int sumCheck) {
        this.sumCheck = sumCheck;

    }

    private String naim;
    private int sumCheck;

    @Override
    public String toString() {
        return "Client{" +
                "naim='" + naim + '\'' +
                ", sumCheck=" + sumCheck +
                '}';
    }

    public Client(String naim, int sumCheck) {
        this.naim = naim;
        this.sumCheck = sumCheck;
    }

    public String getNaim() {
        return naim;
    }

    public int getSumCheck() {
        return sumCheck;
    }
}
