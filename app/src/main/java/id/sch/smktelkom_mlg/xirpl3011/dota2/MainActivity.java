package id.sch.smktelkom_mlg.xirpl3011.dota2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spRegion;
    EditText etNama, etNomor, etAlamat, etJam;
    Button bOk;
    RadioButton rb1, rb2;
    CheckBox cbti7,cbmm;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spRegion = (Spinner) findViewById(R.id.spinner);
        etNama = (EditText) findViewById(R.id.editTextNama);
        rb2 = (RadioButton) findViewById(R.id.radioButton);
        rb1 = (RadioButton) findViewById(R.id.radioButton2);
        cbti7 = (CheckBox) findViewById(R.id.checkBoxti7);
        cbmm = (CheckBox) findViewById(R.id.checkBoxmm );
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }})
    ;}

    private void doClick() {
        String region = spRegion.getSelectedItem().toString();
        String nama = etNama.getText().toString();
        String jam = etJam.getText().toString();
        String hasil = null;
        String cek = null;
        tvHasil.setText(" DATA TEAM \n" +
                "\n Anda Berada di " + region + "\n Nama : " + nama + "Jenis Kelamin : " + hasil +
                "\n Pilihan Hari : " + cek + "\n Pilihan Jam Les : " + jam +
                "\n\n\n SELAMAT ! DATA ANDA SUDAH TERKIRIM !!");
    }
}