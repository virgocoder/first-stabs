package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button)findViewById(R.id.intentButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View src){
        Intent i = new Intent(this, IntentA.class);
        startActivity(i);
    }
    
}
