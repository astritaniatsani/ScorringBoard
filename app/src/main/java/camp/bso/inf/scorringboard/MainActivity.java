package camp.bso.inf.scorringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button minpersib,pluspersib;
    Button minpersija,pluspersija;
    Button reset,berita,map;
    TextView skorpersibb,skorpersijaa;
    int skorValPersib,skorValPersija;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPersib;
        Button btnPersija;


        btnPersib = (Button) findViewById(R.id.btnpersib);
        btnPersija = (Button) findViewById(R.id.btnpersija);
        minpersib = (Button) findViewById(R.id.btnminpersib);
        pluspersib = (Button) findViewById(R.id.btnpluspersib);
        minpersija = (Button) findViewById(R.id.btnminpersija);
        pluspersija = (Button) findViewById(R.id.btnpluspersija);
        skorpersibb = (TextView) findViewById(R.id.skorpersib);
        skorpersijaa = (TextView) findViewById(R.id.skorpersija);
        reset = (Button) findViewById(R.id.btnreset);
        map = (Button) findViewById(R.id.btnmap);
        berita = (Button) findViewById(R.id.btnberita);
        skorValPersija = 0;
        skorValPersib = 0;

        btnPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),PersibActivity.class);
                startActivity(i);
            }
        });

        btnPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),PersijaActivity.class);
                startActivity(i);
            }
        });


        minpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(skorValPersib>0) {
                    skorValPersib = skorValPersib-1;
                    skorpersibb.setText(String.valueOf(skorValPersib));
                }


            }
        });
       pluspersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersib = skorValPersib+1;
                skorpersibb.setText(String.valueOf(skorValPersib));
            }
        });
        minpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(skorValPersija>0) {
                    skorValPersija = skorValPersija-1;
                    skorpersijaa.setText(String.valueOf(skorValPersija));
                }
            }
        });
        pluspersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersija = skorValPersija+1;
                skorpersijaa.setText(String.valueOf(skorValPersija));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersija = 0;
                skorValPersib = 0;
                skorpersijaa.setText(String.valueOf(skorValPersija));
                skorpersibb.setText(String.valueOf(skorValPersib));
            }
        });

        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "http://www.goal.com/id/berita/persib-bandung-gagal-di-piala-presiden-2018-umuh-muchtar-ini/1g39r3bxwrhmh1ls1fsg85igv4";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:=-6.957496,107.711438");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });





    }
}

