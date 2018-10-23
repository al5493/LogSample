package com.videxedge.logsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tV;
    EditText eT;
    String str;
    Double num;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = (EditText) findViewById(R.id.eT);
        tV = (TextView) findViewById(R.id.tV);

        count = 0;
    }

    public void btn(View view) {
        count++;
        Log.d("MainActivity-btn",""+count);
        try {
            str = eT.getText().toString();
            Log.w("MainActivity-btn","Input string is: "+str);
            num = Double.parseDouble(str);
            Log.i("MainActivity-btn","Good data");
        }
        catch (Exception ex) {
            Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show();
            Log.e("MainActivity-btn","Error in input & parse");
        }

        Toast.makeText(this, ""+num, Toast.LENGTH_LONG).show();

        Log.v("MainActivity-btn","End of btn function");

    }
}
