package builderMetodu2;

public class test {
    public static void main(String[] args) {

       Ev ev1= EvBuilder.startBuild()
                .setIl("istanbul")
                .setIlçe("ümraniye")
                .setMahalle("tatlısu")
                .setBinaYılı(2022)
                .setOdaSayısı(5)
                .setHasCocukPark(true)
                .setHasOtopark(true)
                .build();

       printEv(ev1);


    }
    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi===>"+ev);
        System.out.println();
    }
}
