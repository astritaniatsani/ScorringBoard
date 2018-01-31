package camp.bso.inf.scorringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PersijaActivity extends AppCompatActivity {
    ImageView Sumberpersib,Sumberpersija;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persija);

        Sumberpersija = (ImageView) findViewById(R.id.sumberpersija);
        Sumberpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://id.wikipedia.org/wiki/Persija_Jakarta";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }
}
