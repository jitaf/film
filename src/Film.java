public class Film {
    String nazev;
    int delkaVMinutach;
    String zanr;

    int cena;

    public void nastavHodnoty(String nazev, int delkaVMinutach, String zanr, int cena){
        this.nazev = nazev;
        this.delkaVMinutach = delkaVMinutach;
        this.zanr = zanr;
        this.cena = cena;
    }

    public String delkaFilmu(){
        int hodiny = delkaVMinutach/60;
        int minuty = delkaVMinutach/60;

        String delkaFilmu = hodiny + ":" + minuty;

        return delkaFilmu;
    }

    public double vratCenaZaMinutu(){
        double cenaZaJednuMinutu = cena / (double) delkaVMinutach;
        return  cenaZaJednuMinutu;
    }

    public void vypisInformace(){
        System.out.println("Máme film "  + nazev + ", ktery ma delku " + delkaFilmu() + ".");
        System.out.println("Jedno prehrani filmu stoji " + cena + " cena za jednu minutu je " + vratCenaZaMinutu());
    }
}
