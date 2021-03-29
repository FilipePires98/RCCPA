package com.example.joaop.carcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class SideMenu extends AppCompatActivity implements View.OnClickListener{

    private Button sidestate, sidecontrols, sideac, sideloc, sidealertas, sidesett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_menu);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.6), (int)(height));
        getWindow().setGravity(Gravity.LEFT);

        sidestate=(Button)findViewById(R.id.sidestate);
        sidecontrols=(Button)findViewById(R.id.sidecontrols);
        sideac=(Button)findViewById(R.id.sideac);
        sideloc=(Button)findViewById(R.id.sideloc);
        sidealertas=(Button)findViewById(R.id.sidealertas);
        sidesett=(Button)findViewById(R.id.sidesett);

        sidestate.setOnClickListener(this);
        sidecontrols.setOnClickListener(this);
        sideac.setOnClickListener(this);
        sideloc.setOnClickListener(this);
        sidealertas.setOnClickListener(this);
        sidesett.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sidestate:
                startActivity(new Intent(this, Status.class));
                break;
            case R.id.sideac:
                startActivity(new Intent(this, AirConditioner.class));
                break;
            case R.id.sidecontrols:
                startActivity(new Intent(this, Controls.class));
                break;
            case R.id.sideloc:
                startActivity(new Intent(this, Localize.class));
                break;
            case R.id.sidealertas:
                finish();
                startActivity(new Intent(this, Alertas.class));
                break;
            case R.id.sidesett:
                startActivity(new Intent(this, Settings.class));
                break;
        }
    }

    public void onStop() {
        this.finish();
        super.onStop();
    }
}
