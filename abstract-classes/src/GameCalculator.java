import javax.sound.midi.Soundbank;

public abstract class GameCalculator {
    public abstract void hesapla() ;

    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
