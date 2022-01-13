public class Main {

    public static void main(String[] args) {
      Konsol konsol=new Hucum();
      Oyun oyun=new Oyun(konsol);
      konsol.xBas();
      konsol.yuvarlakBas();
      oyun.topuKaptir();
      konsol.kareBas();
      konsol.xBas();
      konsol.kareBas();
      konsol.yuvarlakBas();
      oyun.topuKap();
      konsol.kareBas();
      konsol.xBas();
      konsol.yuvarlakBas();

    }
}
