package threadprint;


public class Simbolo implements Runnable{
    public String carattere;
    public int nVolte;

    public Simbolo(String carattere, int nVolte) {
        this.carattere = carattere;
        this.nVolte = nVolte;
    }

    public String getCarattere() {
        return carattere;
    }

    public void setCarattere(String carattere) {
        this.carattere = carattere;
    }

    public int getnVolte() {
        return nVolte;
    }

    public void setnVolte(int nVolte) {
        this.nVolte = nVolte;
    }

    @Override
    public void run() {
        for(int i=0; i<getnVolte(); i++){
            if(i % 10 == 0 && i!=0){
                System.out.println("");
            }
            System.out.print(this.carattere);
        }
    }
}
