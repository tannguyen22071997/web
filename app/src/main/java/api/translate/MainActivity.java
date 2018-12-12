package api.translate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtnoidung;
    Button buttonClick;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quytrinh);
        buttonClick = findViewById(R.id.buttonClick);
        editText =findViewById(R.id.editTextnoidung);
        txtnoidung = (TextView) findViewById(R.id.noidung);
        final Random random=new Random();
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=random.nextInt(20-10+1)+10;
                txtnoidung.setText(a+"");
                String nd=editText.getText().toString();
                Toast.makeText(MainActivity.this,nd,Toast.LENGTH_LONG).show();
            }
        });
    }
}
