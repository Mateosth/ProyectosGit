package lhst.lenguajeavan2.com.taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button button;
    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button=(Button) findViewById(R.id.button2);
        button=(Button) findViewById(R.id.button3);

        textView=(TextView) findViewById(R.id.textView);
        editText=(EditText) findViewById(R.id.editText);
    }

    public void clickboton(View V) {
        textView.setText(editText.getText());
        Toast.makeText(this,"Usted oprimió el botón 1",Toast.LENGTH_SHORT).show();
    }

    public void clickboton2(View V) {
        textView.setText(editText.getText());
        Toast.makeText(this,"Usted oprimió el botón 2",Toast.LENGTH_SHORT).show();
    }
    public void clickboton3(View V) {
        textView.setText(editText.getText());
        Toast.makeText(this,"Usted oprimió el botón 3",Toast.LENGTH_SHORT).show();
    }

}
