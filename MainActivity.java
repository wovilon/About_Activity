package wovilon.about_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
static boolean datamode=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtClick(View view) {
        Intent intent= new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onBtThirdClick(View view) {
        Intent intent= new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);

    }

    public void onTransmitClick(View view) {
        MainActivity.datamode=true;

        EditText userEditText=(EditText)findViewById(R.id.UsetEdit);
        EditText giftEditText=(EditText)findViewById(R.id.GiftEdit);
        EditText fromEditText=(EditText)findViewById(R.id.FromEdit);

        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);

        intent.putExtra("username",userEditText.getText().toString());
        intent.putExtra("gift",giftEditText.getText().toString());
        intent.putExtra("from", fromEditText.getText().toString());
        startActivity(intent);
    }
}
