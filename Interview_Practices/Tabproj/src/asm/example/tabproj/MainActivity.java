package asm.example.tabproj;

import android.support.v7.app.ActionBarActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabSpec shiva = tabHost.newTabSpec("Shiva");
        TabSpec vishnu= tabHost.newTabSpec("Vishnu");
        TabSpec bramha = tabHost.newTabSpec("bramha");
        
        
        shiva.setIndicator("Destroyer");
        shiva.setContent(new Intent(this,Tab1Activity.class));
        
        vishnu.setIndicator("operator");
        vishnu.setContent(new Intent(this,Tab2Activity.class));
        
        bramha.setIndicator("Creator");
        bramha.setContent(new Intent(this,Tab3Activity.class));
        
        
        tabHost.addTab(shiva);
        tabHost.addTab(vishnu);
        tabHost.addTab(bramha);
        
    
    
    }


    
}
