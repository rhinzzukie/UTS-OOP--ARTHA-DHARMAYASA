public class MenuMakanan extends Menu {
    private String kategoriMakanan;

    public MenuMakanan(String nama, String nomor, double harga, String kategoriMakanan){
        super(nama, nomor, harga);
        this.kategoriMakanan = kategoriMakanan;
    }

    public String getKategoriMakanan() {
        return kategoriMakanan;
    }

    
    public void displayInfo(){
        System.out.println("[MAKANAN] " + getNomormenu() + " - " + getNamamenu() + " | Kategori " + kategoriMakanan + " | RP " + getHarga());
    }
}
