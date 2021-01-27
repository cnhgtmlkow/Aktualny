package edu.ib;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import javax.sound.midi.SysexMessage;

import static edu.ib.DystrybucjaKart.*;
import static edu.ib.Gra.zagrajKarta;
import static edu.ib.Gra.zagranie;
import static edu.ib.Main.widokKrolaTrefl;

public class gameController {
//    private DystrybucjaKart dystrybucjaKart = new DystrybucjaKart();
    private Gracz gamer = new Gracz();
    private Gracz npc = new Gracz();
    private Stol stol = new Stol();
    private Karta aktywna = new Karta();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane GamePane;

    @FXML
    private ImageView gracz;

    @FXML
    private ImageView NPCsmieszne;

    @FXML
    private Button btnKartyOczekujace;

    @FXML
    private Button btnKartaAktywna;

    @FXML
    private ImageView kartaAktywna;

    @FXML
    private Button btnKartaNPC1;

    @FXML
    private ImageView imageKartaNPC1;

    @FXML
    private Button btnKartaNPC2;

    @FXML
    private ImageView imageKartaNPC2;

    @FXML
    private Button btnKartaNPC3;

    @FXML
    private ImageView imageKartaNPC3;

    @FXML
    private Button btnKartaNPC4;

    @FXML
    private ImageView imageKartaNPC4;

    @FXML
    private Button btnKartaNPC5;

    @FXML
    private ImageView imageKartaNPC5;

    @FXML
    private Button btnKartaNPC6;

    @FXML
    private ImageView imageKartaNPC6;

    @FXML
    private Button btnKartaNPC7;

    @FXML
    private ImageView imageKartaNPC7;

    @FXML
    private Button btnKartaNPC8;

    @FXML
    private ImageView imageKartaNPC8;

    @FXML
    private Button btnKartaGracz1;

    @FXML
    private ImageView imageKartaGracz1;

    @FXML
    private Button btnKartaGracz2;

    @FXML
    private ImageView imageKartaGracz2;

    @FXML
    private Button btnKartaGracz3;

    @FXML
    private ImageView imageKartaGracz3;

    @FXML
    private Button btnKartaGracz4;

    @FXML
    private ImageView imageKartaGracz4;

    @FXML
    private Button btnKartaGracz5;

    @FXML
    private ImageView imageKartaGracz5;

    @FXML
    private Button btnKartaGracz6;

    @FXML
    private ImageView imageKartaGracz6;

    @FXML
    private Button btnKartaGracz7;

    @FXML
    private ImageView imageKartaGracz7;

    @FXML
    private Button btnKartaGracz8;

    @FXML
    private ImageView imageKartaGracz8;

    @FXML
    void KartaNPC1(ActionEvent event) {

    }

    @FXML
    void KartaNPC2(MouseEvent event) {

    }

    @FXML
    void KartaNPC3(ActionEvent event) {

    }

    @FXML
    void KartaNPC4(ActionEvent event) {

    }

    @FXML
    void KartaNPC5(ActionEvent event) {

    }

    @FXML
    void KartaNPC6(ActionEvent event) {

    }

    @FXML
    void KartaNPC7(ActionEvent event) {

    }

    @FXML
    void KartaNPC8(ActionEvent event) {

    }

    @FXML
    void imKartaGracz1(MouseEvent event) {

    }

    @FXML
    void imKartaGracz2(MouseEvent event) {

    }

    @FXML
    void imKartaGracz3(MouseEvent event) {

    }

    @FXML
    void imKartaGracz4(MouseEvent event) {

    }

    @FXML
    void imKartaGracz5(MouseEvent event) {

    }

    @FXML
    void imKartaGracz6(MouseEvent event) {

    }

    @FXML
    void imKartaGracz7(MouseEvent event) {

    }

    @FXML
    void imKartaGracz8(MouseEvent event) {

    }

    @FXML
    void imKartaNPC1(MouseEvent event) {

    }

    @FXML
    void imKartaNPC2(ActionEvent event) {

    }

    @FXML
    void imKartaNPC3(MouseEvent event) {

    }

    @FXML
    void imKartaNPC4(MouseEvent event) {

    }

    @FXML
    void imKartaNPC5(MouseEvent event) {

    }

    @FXML
    void imKartaNPC6(MouseEvent event) {

    }

    @FXML
    void imKartaNPC7(MouseEvent event) {

    }

    @FXML
    void imkartaNPC8(MouseEvent event) {

    }

    @FXML
    void kartaAktywna(ActionEvent event) {

    }

    @FXML
    void kartaGracz1(ActionEvent event) {

        // algorytm metody klikniecia:

        /* modyfikacja
            sprawdza czy karta ukryta pod przyciskiem (ale sama nie bedaca przyciskiem!)
            moze byc zagrana czyli czy zgadza sie kolorem lub rangą

            jezeli tak to zamienia aktywna na siebie
            karta z przycisku (Czyli z kart gracza) musi byc usunieta
         */

        Karta kartaGracza = gamer.getKarty().get(0);
        Karta [] Kar = new Karta[2];
         Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);

        System.out.println(aktywna);
//        btnKartaGracz1.setPrefSize(90, 90);
//        btnKartaGracz1.setGraphic(k);



    }

    @FXML
    void kartaGracz2(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(1);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);

    }

    @FXML
    void kartaGracz3(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(2);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);

    }

    @FXML
    void kartaGracz4(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(3);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);

    }

    @FXML
    void kartaGracz5(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(4);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);

    }

    @FXML
    void kartaGracz6(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(5);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);


    }

    @FXML
    void kartaGracz7(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(6);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);


    }

    @FXML
    void kartaGracz8(ActionEvent event) {
        Karta kartaGracza = gamer.getKarty().get(7);
        Karta [] Kar = new Karta[2];
        Kar = zagranie(aktywna, kartaGracza);
        stol.dodaj(Kar[1]);
        if (Kar[1]!=null) {
            gamer.getKarty().remove(kartaGracza);
        }
        aktywna = Kar[0];
        ImageView k = aktywna.getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(k);

    }

    @FXML
    void kartyOczekujace(ActionEvent event) {

    }

    @FXML
    void pictureOfCard(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert GamePane != null : "fx:id=\"GamePane\" was not injected: check your FXML file 'Game.fxml'.";
        assert gracz != null : "fx:id=\"gracz\" was not injected: check your FXML file 'Game.fxml'.";
        assert NPCsmieszne != null : "fx:id=\"NPCsmieszne\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartyOczekujace != null : "fx:id=\"btnKartyOczekujace\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaAktywna != null : "fx:id=\"btnKartaAktywna\" was not injected: check your FXML file 'Game.fxml'.";
        assert kartaAktywna != null : "fx:id=\"kartaAktywna\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC1 != null : "fx:id=\"btnKartaNPC1\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC1 != null : "fx:id=\"imageKartaNPC1\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC2 != null : "fx:id=\"btnKartaNPC2\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC2 != null : "fx:id=\"imageKartaNPC2\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC3 != null : "fx:id=\"btnKartaNPC3\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC3 != null : "fx:id=\"imageKartaNPC3\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC4 != null : "fx:id=\"btnKartaNPC4\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC4 != null : "fx:id=\"imageKartaNPC4\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC5 != null : "fx:id=\"btnKartaNPC5\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC5 != null : "fx:id=\"imageKartaNPC5\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC6 != null : "fx:id=\"btnKartaNPC6\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC6 != null : "fx:id=\"imageKartaNPC6\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC7 != null : "fx:id=\"btnKartaNPC7\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC7 != null : "fx:id=\"imageKartaNPC7\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaNPC8 != null : "fx:id=\"btnKartaNPC8\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaNPC8 != null : "fx:id=\"imageKartaNPC8\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz1 != null : "fx:id=\"btnKartaGracz1\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz1 != null : "fx:id=\"imageKartaGracz1\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz2 != null : "fx:id=\"btnKartaGracz2\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz2 != null : "fx:id=\"imageKartaGracz2\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz3 != null : "fx:id=\"btnKartaGracz3\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz3 != null : "fx:id=\"imageKartaGracz3\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz4 != null : "fx:id=\"btnKartaGracz4\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz4 != null : "fx:id=\"imageKartaGracz4\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz5 != null : "fx:id=\"btnKartaGracz5\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz5 != null : "fx:id=\"imageKartaGracz5\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz6 != null : "fx:id=\"btnKartaGracz6\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz6 != null : "fx:id=\"imageKartaGracz6\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz7 != null : "fx:id=\"btnKartaGracz7\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz7 != null : "fx:id=\"imageKartaGracz7\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnKartaGracz8 != null : "fx:id=\"btnKartaGracz8\" was not injected: check your FXML file 'Game.fxml'.";
        assert imageKartaGracz8 != null : "fx:id=\"imageKartaGracz8\" was not injected: check your FXML file 'Game.fxml'.";

        ArrayList<Karta> oczekujace =  talia();
        ArrayList<Karta> srajace =  talia();
        oczekujace = tasowansko(oczekujace);
////        Gracz gracz = new Gracz();
////        Gracz npc = new Gracz();
        Gracz [] gracze = {gamer, npc};
////        Stol stol = new Stol();
        ArrayList<Karta> [] stosy = new ArrayList[3];
        stosy = rozdanie(oczekujace, 2, gracze, stol);


        gamer.setKarty(stosy[0]);
        npc.setKarty(stosy[1]);
        stol.setOczekujace(stosy[2]);

        aktywna = stol.getOczekujace().get(0);
        stol.setAktywna(aktywna);


//        kartaAktywna.setPrefSize(90, 90);
//        aktywna.setFitHeight(90);
//        aktywna.setFitWidth(90);
        ImageView ch = aktywna.getObrazek();
        ch.setFitHeight(90);
        ch.setFitWidth(90);
        btnKartaAktywna.setPrefSize(90, 90);
        btnKartaAktywna.setGraphic(ch);

////        Karta aktywna = new Karta();
//        srajace = stol.getOczekujace();
//        ArrayList<Double> list = new ArrayList<Double>();
//        System.out.println("tutaj");
//        int g = 2;
//        for (int i = 0; i<stosy[g].size(); i++){
//            list.add(i+0.5);
//            System.out.println(i+" "+stosy[g].get(i).getKolor()+" "+stosy[g].get(i).getRanga());
//        }
//        double jd = list.get(0);
//        System.out.println(jd);
//        for(int i = 0; i<8; i++) {
//            gamer.getKarty().get(i).getObrazek();
//            ImageView k = gamer.getKarty().get(i).getObrazek();
//            k.setFitHeight(90);
//            k.setFitWidth(90);
//            String polecenie = "btnKartaGracz"+(i+1);
//
//            btnKartaGracz1.setPrefSize(90, 90);
//            btnKartaGracz1.setGraphic(k);
//        }

        gamer.getKarty().get(0).getObrazek();
        ImageView k = gamer.getKarty().get(0).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz1.setPrefSize(90, 90);
        btnKartaGracz1.setGraphic(k);


        gamer.getKarty().get(1).getObrazek();
        k = gamer.getKarty().get(1).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz2.setPrefSize(90, 90);
        btnKartaGracz2.setGraphic(k);

        gamer.getKarty().get(2).getObrazek();
        k = gamer.getKarty().get(2).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz3.setPrefSize(90, 90);
        btnKartaGracz3.setGraphic(k);

        gamer.getKarty().get(3).getObrazek();
        k = gamer.getKarty().get(3).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz4.setPrefSize(90, 90);
        btnKartaGracz4.setGraphic(k);

        gamer.getKarty().get(4).getObrazek();
        k = gamer.getKarty().get(4).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz5.setPrefSize(90, 90);
        btnKartaGracz5.setGraphic(k);




        //--------------karta5

        gamer.getKarty().get(5).getObrazek();
        k = gamer.getKarty().get(5).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz6.setPrefSize(90, 90);
        btnKartaGracz6.setGraphic(k);

        //--------------karta6

        gamer.getKarty().get(6).getObrazek();
        k = gamer.getKarty().get(6).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz7.setPrefSize(90, 90);
        btnKartaGracz7.setGraphic(k);

        //--------------karta7

        gamer.getKarty().get(7).getObrazek();
        k = gamer.getKarty().get(7).getObrazek();
        k.setFitHeight(90);
        k.setFitWidth(90);
        btnKartaGracz8.setPrefSize(90, 90);
        btnKartaGracz8.setGraphic(k);





    }


}
