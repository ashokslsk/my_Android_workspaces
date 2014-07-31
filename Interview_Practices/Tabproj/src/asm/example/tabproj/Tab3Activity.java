package asm.example.tabproj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class Tab3Activity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		TextView tv2 = new TextView(this);
		tv2.setTextSize(25);
		tv2.setGravity(Gravity.CENTER_VERTICAL);
		tv2.setText("bramha is creator");
		
		
		setContentView(tv2);
	}

}
