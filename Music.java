/***
 * Class: Music
 * This class is to create the background music for the calculator!
 * Obviously, it is not so suitable in a calculator
 * But for learning more knowledge, i still put it in here!
 */

import java.applet.*;
import java.net.URL;
import java.io.*;

public class Music {
    AudioClip bgm, click, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    File file, fileClick, fileBtn1, fileBtn2, fileBtn3, fileBtn4, fileBtn5, fileBtn6, fileBtn7, fileBtn8, fileBtn9;
    URL url, urlClick, urlBtn1, urlBtn2, urlBtn3, urlBtn4, urlBtn5, urlBtn6, urlBtn7, urlBtn8, urlBtn9;

    /***
     *  Load the music File!
     */
    public Music() {
        file = new File("bgm.wav");
        try {
            url = file.toURL();
        } catch (Exception e) {
        }
        bgm = Applet.newAudioClip(url);

        fileClick = new File("Click.wav");
        try {
            urlClick = fileClick.toURL();
        } catch (Exception e) {
        }
        click = Applet.newAudioClip(urlClick);

        fileBtn1 = new File("Number 01.wav");
        try {
            urlBtn1 = fileBtn1.toURL();
        } catch (Exception e) {
        }
        btn1 = Applet.newAudioClip(urlBtn1);

        fileBtn2 = new File("Number 02.wav");
        try {
            urlBtn2 = fileBtn2.toURL();
        } catch (Exception e) {
        }
        btn2 = Applet.newAudioClip(urlBtn2);

        fileBtn3 = new File("Number 03.wav");
        try {
            urlBtn3 = fileBtn3.toURL();
        } catch (Exception e) {
        }
        btn3 = Applet.newAudioClip(urlBtn3);

        fileBtn4 = new File("Number 04.wav");
        try {
            urlBtn4 = fileBtn4.toURL();
        } catch (Exception e) {
        }
        btn4 = Applet.newAudioClip(urlBtn4);

        fileBtn5 = new File("Number 05.wav");
        try {
            urlBtn5 = fileBtn5.toURL();
        } catch (Exception e) {
        }
        btn5 = Applet.newAudioClip(urlBtn5);

        fileBtn6 = new File("Number 06.wav");
        try {
            urlBtn6 = fileBtn6.toURL();
        } catch (Exception e) {
        }
        btn6 = Applet.newAudioClip(urlBtn6);

        fileBtn7 = new File("Number 07.wav");
        try {
            urlBtn7 = fileBtn7.toURL();
        } catch (Exception e) {
        }
        btn7 = Applet.newAudioClip(urlBtn7);

        fileBtn8 = new File("Number 08.wav");
        try {
            urlBtn8 = fileBtn8.toURL();
        } catch (Exception e) {
        }
        btn8 = Applet.newAudioClip(urlBtn8);

        fileBtn9 = new File("Number 09.wav");
        try {
            urlBtn9 = fileBtn9.toURL();
        } catch (Exception e) {
        }
        btn9 = Applet.newAudioClip(urlBtn9);
    }


    /***
     * Start the music
     * @param m : it is for selecting the different music in the calculator to start but not loop
     *          Actually, it can expands well
     */
    public void start(int m) {
        switch (m) {
            case 1:
                bgm.play();
                break;
            case 2:
                click.play();
                break;
            case 3:
                btn1.play();
                break;
            case 4:
                btn2.play();
                break;
            case 5:
                btn3.play();
                break;
            case 6:
                btn4.play();
                break;
            case 7:
                btn5.play();
                break;
            case 8:
                btn6.play();
                break;
            case 9:
                btn7.play();
                break;
            case 10:
                btn8.play();
                break;
            case 11:
                btn9.play();
                break;

        }
    }


    /***
     * end the music
     * @param m :it is for selecting the different music in the calculator to end
     */
    public void end(int m) {
        switch (m) {
            case 1:
                bgm.stop();
                break;
        }
    }


    /***
     * Loop the music
     * @param m :it is for selecting the different music in the calculator to loop in the process.
     */
    public void loop(int m) {
        switch (m) {
            case 1:
                bgm.loop();
                break;
        }
    }
}