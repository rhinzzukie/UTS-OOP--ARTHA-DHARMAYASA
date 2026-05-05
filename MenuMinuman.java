public class MenuMinuman extends Menu {
    private String jenisMinuman;

    public MenuMinuman(String nama, String nomor, double harga, String jenisMinuman){
        super(nama, nomor, harga);
        this.jenisMinuman = jenisMinuman;
    }

    public String getJenisMinuman() {
        return jenisMinuman;
    }

    
    public void displayInfo(){
        System.out.println("[MAKANAN] " + getNomormenu() + " - " + getNamamenu() + " | Kategori " + jenisMinuman + " | RP " + getHarga());
    }
}
