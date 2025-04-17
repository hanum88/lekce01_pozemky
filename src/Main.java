public class Main {
    public static void main(String[] args) {

        Pozemek sadPalava = new Pozemek (250, "sad pálava", 1000);
        Pozemek dumBrno = new Pozemek(100, "dům Brno", 555);

        int cenaCelkemPalava = sadPalava.getCenaZaMetr() * sadPalava.getVymera();
        System.out.println("cena za pozemek " + sadPalava.getPopis() + " je: " + cenaCelkemPalava + " Kč");
        System.out.println("došlo ke zvýšení ceny pozemku");
        sadPalava.setCenaZaMetr(2000);
        System.out.println("nová cena pozemku je");
        cenaCelkemPalava = sadPalava.getCenaZaMetr() * sadPalava.getVymera();
        System.out.println("cena za pozemek " + sadPalava.getPopis() + " je: " + cenaCelkemPalava + " Kč");
    }
}