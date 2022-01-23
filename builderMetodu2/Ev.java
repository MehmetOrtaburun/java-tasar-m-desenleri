package builderMetodu2;

public class Ev {
    // Aynı tipte fazla sayıda değişken olsun

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

    public Ev() {
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getBinaYılı() {
        return binaYılı;
    }

    public void setBinaYılı(int binaYılı) {
        this.binaYılı = binaYılı;
    }

    public int getOdaSayısı() {
        return odaSayısı;
    }

    public void setOdaSayısı(int odaSayısı) {
        this.odaSayısı = odaSayısı;
    }

    public int getBanyoSayısı() {
        return banyoSayısı;
    }

    public void setBanyoSayısı(int banyoSayısı) {
        this.banyoSayısı = banyoSayısı;
    }

    public int getTuvaletSayısı() {
        return tuvaletSayısı;
    }

    public void setTuvaletSayısı(int tuvaletSayısı) {
        this.tuvaletSayısı = tuvaletSayısı;
    }

    public int getBalkonSayısı() {
        return balkonSayısı;
    }

    public void setBalkonSayısı(int balkonSayısı) {
        this.balkonSayısı = balkonSayısı;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isEsyalı() {
        return isEsyalı;
    }

    public void setEsyalı(boolean esyalı) {
        isEsyalı = esyalı;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public boolean isHasCocukPark() {
        return hasCocukPark;
    }

    public void setHasCocukPark(boolean hasCocukPark) {
        this.hasCocukPark = hasCocukPark;
    }

    public boolean isHasKlima() {
        return hasKlima;
    }

    public void setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
    }

    public boolean isHasHavuz() {
        return hasHavuz;
    }

    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }

    @Override
    public String  toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilçe='" + ilçe + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYılı=" + binaYılı +'\''+
                ", odaSayısı=" + odaSayısı +'\''+
                ", banyoSayısı=" + banyoSayısı +'\''+
                ", tuvaletSayısı=" + tuvaletSayısı +'\''+
                ", balkonSayısı=" + balkonSayısı +'\''+
                ", isDublex=" + isDublex +'\''+
                ", isEsyalı=" + isEsyalı +'\''+
                ", hasOtopark=" + hasOtopark +'\''+
                ", hasCocukPark=" + hasCocukPark +'\''+
                ", hasKlima=" + hasKlima +'\''+
                ", hasHavuz=" + hasHavuz +'\''+
                '}';
    }
}
