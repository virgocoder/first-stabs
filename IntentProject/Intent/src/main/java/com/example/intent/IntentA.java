package com.example.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by sjoshi3 on 10/16/13.
 */
public class IntentA extends Activity implements OnClickListener {

    @Override
    public void onClick(View src){
        Intent i = new Intent(this, Main.class);
        startActivity(i);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intenta);

        Button button = (Button) findViewById(R.id.intentA);
        button.setOnClickListener(this);
    }

}
