import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        String source = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(source);
        Color[][] grayed = new Color[sourceImage.length][sourceImage[0].length];
        grayed = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, grayed, n);
    }
}
