package builderMetodu2;

public class EvBuilder {

    // ev içindeki tüm fieldlar bulunacak

    private String il;
    private String ilçe;
    private String mahalle;

    private int binaYılı;
    private int odaSayısı;
    private int banyoSayısı;
    private int tuvaletSayısı;
    private int balkonSayısı;

    private boolean isDublex;
    private boolean isEsyalı;
    private boolean hasOtopark;
    private boolean hasCocukPark;
    private boolean hasKlima;
    private boolean hasHavuz;

    // static olarak kendisinden bir nesne döencek
    public static EvBuilder startBuild(){
        return new EvBuilder();
    }

    public EvBuilder setIl(String il) {
        this.il = il;
        return this;
    }

    public EvBuilder setIlçe(String ilçe) {
        this.ilçe = ilçe;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setBinaYılı(int binaYılı) {
        this.binaYılı = binaYılı;
        return this;
    }

    public EvBuilder setOdaSayısı(int odaSayısı) {
        this.odaSayısı = odaSayısı;
        return this;
    }

    public EvBuilder setBanyoSayısı(int banyoSayısı) {
        this.banyoSayısı = banyoSayısı;
        return this;
    }

    public EvBuilder setTuvaletSayısı(int tuvaletSayısı) {
        this.tuvaletSayısı = tuvaletSayısı;
        return this;
    }

    public EvBuilder setBalkonSayısı(int balkonSayısı) {
        this.balkonSayısı = balkonSayısı;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setEsyalı(boolean esyalı) {
        isEsyalı = esyalı;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setHasCocukPark(boolean hasCocukPark) {
        this.hasCocukPark = hasCocukPark;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;

    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;

    }

    public Ev build(){
        Ev ev=new Ev();


        ev.setIl(il);
        ev.setIlçe(ilçe);
        ev.setMahalle(mahalle);
        ev.setBinaYılı(binaYılı);
        ev.setOdaSayısı(odaSayısı);
        ev.setBanyoSayısı(banyoSayısı);
        ev.setTuvaletSayısı(tuvaletSayısı);
        ev.setBalkonSayısı(balkonSayısı);
        ev.setDublex(isDublex);
        ev.setEsyalı(isEsyalı);
        ev.setHasOtopark(hasOtopark);
        ev.setHasCocukPark(hasCocukPark);
        ev.setHasKlima(hasKlima);
        ev.setHasHavuz(hasHavuz);

      return ev;


    }
}
