package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llMaiin = (LinearLayout) findViewById(R.id.linearLayoutMain);

        final EditText etNama = new EditText(this);
        llMaiin.addView(etNama);
        etNama.setHint("Isikan Nama Anak");

        final EditText etUmur = new EditText(this);
        llMaiin.addView(etUmur);
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);
        etUmur.setHint("Isikan Umur Anak");

        Button bProses = new Button(this);
        bProses.setText("Proses");
        llMaiin.addView(bProses);
        final TextView tvHasil = new TextView(this);
        llMaiin.addView(tvHasil);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                tvHasil.setText(nama + " umur " + umur + " tahun ");
            }
        });
    }
}
