package dwiyanhartono.com.latihan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText ET1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.button_Main_Submit);
        ET1 = findViewById(R.id.ET1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ET1.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Silahkan isi Text Box di atas", Toast.LENGTH_SHORT).show();
                } else {
                    String Text = ET1.getText().toString();
                    Toast.makeText(MainActivity.this, Text, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}