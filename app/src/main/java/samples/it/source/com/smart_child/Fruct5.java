package samples.it.source.com.smart_child;

import android.os.Bundle;
import android.widget.Button;


public class Fruct5 extends Fruct4 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruct4);
        b = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        btnTry = (Button) findViewById(R.id.button_try);
        b6.setOnClickListener(this);
        btnTry.setOnClickListener(this);
        generateNewPosition();
//        h = new Handler(){
    }

}
