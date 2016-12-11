package wovilon.about_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView infoTextView=(TextView)findViewById(R.id.textViewInfo);
        infoTextView.setText("Сюда можно передать привет\n из главного окна.");
        boolean d= new MainActivity().datamode;

        if (d==true) {

            String user="Жывотное";String gift="дырку от бублика";String from="Другое жывотное";

            if (getIntent().getExtras().getString("username").length() > 0) {
                user = getIntent().getExtras().getString("username");
            }
            if (getIntent().getExtras().getString("gift").length() > 0) {
                gift = getIntent().getExtras().getString("gift");
            }
            if (getIntent().getExtras().getString("from").length() > 0) {
                from = getIntent().getExtras().getString("from");
            }
            infoTextView.setText(user+", вам передали "+gift+"."+" С уважением, "+from+".");
        }
    }
}
