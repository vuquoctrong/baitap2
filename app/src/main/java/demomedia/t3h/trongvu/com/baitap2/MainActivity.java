package demomedia.t3h.trongvu.com.baitap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String mButtonMessage;
    private Button btn_hi;
    private Button btn_bye;
    private Button btn_yo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonMessage= getString(R.string.button_message_template);
        btn_hi = (Button) findViewById(R.id.btnHi);
        btn_bye = (Button) findViewById(R.id.btnBye);
        btn_yo = (Button) findViewById(R.id.btnYo);
        onClickButtonMessage();

    }
    private void onClickButtonMessage(){
        btn_hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) btn_hi.getText();
                CharSequence message = String.format(mButtonMessage,text);
                Toast.makeText(MainActivity.this
                        ,message,Toast.LENGTH_SHORT).show();
            }
        });
        btn_bye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) btn_bye.getText();
                CharSequence message = String.format(mButtonMessage,text);
                Toast.makeText(MainActivity.this
                        ,message,Toast.LENGTH_SHORT).show();
            }
        });
        btn_yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) btn_yo.getText();
                CharSequence message = String.format(mButtonMessage,text);
                Toast.makeText(MainActivity.this
                        ,message,Toast.LENGTH_SHORT).show();
            }
        });
    }



}
