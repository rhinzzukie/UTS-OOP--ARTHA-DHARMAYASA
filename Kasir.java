import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Kasir {
    private ArrayList<Menu>  daftarMenu;
    private ArrayList<String>  namaItem;
    private ArrayList<Integer> jumlahItem;
    private ArrayList<Double>  subtotalItem;

    public Kasir() {
        daftarMenu  = new ArrayList<>();
        namaItem      = new ArrayList<>();
        jumlahItem    = new ArrayList<>();
        subtotalItem  = new ArrayList<>();

        
        daftarMenu.add(new MenuMakanan("mie Goreng", "A1", 25000, "Makanankering"));
        daftarMenu.add(new MenuMakanan("mie kuah", "A1", 25000, "Makananbasah"));
        
        daftarMenu.add(new MenuMinuman("sprite", "B2", 15000, "SODA"));
        daftarMenu.add(new MenuMinuman("esteh", "B2", 13000, "DINGIN"));

    }

