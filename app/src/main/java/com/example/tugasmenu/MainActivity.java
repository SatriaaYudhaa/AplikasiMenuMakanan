package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private final ArrayList<String> fotoMakanan = new ArrayList<>();
    private final ArrayList<String> namaMakanan = new ArrayList<>();
    private final ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        com.example.aplikasimenumakanan.RecyclerViewAdapter adapter = new com.example.aplikasimenumakanan.RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Mie Kocok Bandung");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-kocok-bandung.jpg");
        infoMakanan.add("Mie kocok merupakan makanan khas dari kota bandung yang memiliki rasa segar, gurih, dan juga nikmat.               " +
                "Harga : Rp.24.000");

        namaMakanan.add("Ayam Betutu Bali");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/ayam-betutu-bali.jpg");
        infoMakanan.add("Rasa ayam yang lembut dan juga kaya akan rempah akan membuat pengalaman anda selama di bali semakin terasa lengkap dan tak terlupakan.                 Harga : Rp.21.000");

        namaMakanan.add("Papeda Irian Jaya");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Papeda-irian-jaya.jpg");
        infoMakanan.add("Makanan ini begitu unik karena memiliki tekstur seperti lem yang lengket.                                                                                      Harga : Rp.26.000");

        namaMakanan.add("Rendang Padang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Rendang-padang.jpg");
        infoMakanan.add("Makanan ini begitu unik karena memiliki tekstur seperti lem yang lengket.                                                                                      Harga : Rp.27.000");

        namaMakanan.add("Tinutuan Manado");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Tinutuan-Manado.jpg");
        infoMakanan.add(" Makanan ini ini memiliki rasa yang sangat nikmat bahkan bisa dikatakan sebagai bubur yang paling nikmat yang pernah ada di Indonesia.                                     Harga : Rp.28.000");

        namaMakanan.add("Gudeg Jogja");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Gudeg-jogja-enak.jpg");
        infoMakanan.add("nangka muda yang dimasak dengan rempah yang lengkap dan juga diberi gula merah sehingga rasanya manis.                                                                                     Harga : Rp.29.000");

        namaMakanan.add("Pempek Palembang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Pempek-palembang.jpg");
        infoMakanan.add("Pempek terbuat dari ikan dan tepung kemudian dinikmati dengan kuah cuka yang dicampur gula dan garam sedikit.                                                                              Harga : Rp.22.000");

        prosesRecyclerViewAdapter();
    }

}