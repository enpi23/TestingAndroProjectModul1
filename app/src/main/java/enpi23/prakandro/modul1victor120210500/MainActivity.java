package enpi23.prakandro.modul1victor120210500;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "enpi23.prakandro.modul1victor12012150100.extra.MESSAGE";
    private TextView txtmenu;
    private TextView txtporsi;
    private  Button eatbus;
    private Button abnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmenu = (TextView) findViewById(R.id.txtmenu);
        txtporsi = (TextView) findViewById(R.id.txtporsi);
        eatbus = (Button) findViewById(R.id.eatbus);
        abnormal = (Button) findViewById(R.id.abnormal);
    }

    public void launchEatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String restaurant = eatbus.getText().toString();
        String menurest = txtmenu.getText().toString();
        String porsirest = txtporsi.getText().toString();

        intent.putExtra("menurest", menurest);
        intent.putExtra("porsirest", porsirest);
        intent.putExtra("restaurant", restaurant);
        startActivity(intent);

    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String restautant = abnormal.getText().toString();
        String menurest = txtmenu.getText().toString();
        String porsirest = txtporsi.getText().toString();

        intent.putExtra("menurest", menurest);
        intent.putExtra("porsirest", porsirest);
        intent.putExtra("restaurant", restautant);
        startActivity(intent);
    }
}
