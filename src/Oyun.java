public class Oyun {
    private Konsol konsol;

    public Oyun(Konsol konsol) {
        this.konsol = new Hucum();
    }

    public void ucgen() {
        konsol.ucgenBas();
    }

    public void kare() {
        konsol.kareBas();
    }

    public void yuvarlak() {
        konsol.yuvarlakBas();
    }

    public void x() {
        konsol.xBas();

    }

    public void topuKap() {
        System.out.println("Top kapıldı hücuma çıkılıyor");
        konsol = new Hucum();
    }

    public void topuKaptir() {
        System.out.println("Top kaptırıldı defansa geçiliyor");
        konsol = new Defans();
    }
}
