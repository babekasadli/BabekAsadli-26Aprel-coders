package may11;

import static may11.MathOperations.add;
import static may11.MathOperations.subtact;
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;

        int sum = add(num1,num2);
        int difference = subtact(num1,num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);


        JazzMusicPlayer jazzPlayer = new JazzMusicPlayer();
        jazzPlayer.PlayJazzMusic();
        jazzPlayer.play();
        jazzPlayer.pause();
        jazzPlayer.stop();

        ClassicalMusicPlayer classicalPlayer = new ClassicalMusicPlayer();
        classicalPlayer.PlayClassicalMusic();
        classicalPlayer.play();
        classicalPlayer.pause();
        classicalPlayer.stop();
    }
}
