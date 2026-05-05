public abstract class Menu {
    private String namaMenu;
    private String nomorMenu;
    private double harga;

    public Menu (String namaMenu, String nomorMenu, double harga){
        this.namaMenu = namaMenu;
        this.nomorMenu = nomorMenu;
        this.harga = harga;
    }
    public String getNamamenu(){
        return namaMenu;

    }
    public String getNomormenu(){
        return nomorMenu;

    }
    public double getHarga(){
        return harga;

    }
    public abstract void displayInfo();
}
