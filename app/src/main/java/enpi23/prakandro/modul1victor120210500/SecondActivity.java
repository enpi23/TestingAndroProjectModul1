package enpi23.prakandro.modul1victor120210500;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Enpi23 on 02/02/2018.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();

        int mymoney = 65500;
        String menurest = intent.getStringExtra("menurest");
        String menuporsi = intent.getStringExtra("porsirest");
        String restaurant = intent.getStringExtra("restaurant");

        int hargaporsi = Integer.parseInt(menuporsi);


        if (restaurant.equalsIgnoreCase("Eatbus")){
            int nasiudukEatbus = 50000;
            int total = hargaporsi*nasiudukEatbus;
            String totalharga = String.valueOf(total);
            if (total>mymoney){

                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Jangan makan malam disini uang kamu tidak cukup";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }else{
                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Makan malamnya disini saja";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }

        }else {
            int nasiudukAbnormal = 30000;
            int total = hargaporsi*nasiudukAbnormal;
            String totalharga = String.valueOf(total);
            if (total>mymoney){

                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Jangan makan malam disini uang kamu tidak cukup";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }else{
                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Makan malamnya disini saja";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }
        }
    }
}
