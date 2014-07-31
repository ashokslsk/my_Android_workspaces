package asm.example.tabproj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class Tab2Activity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		TextView tv1 = new TextView(this);
		tv1.setTextSize(25);
		tv1.setGravity(Gravity.CENTER_VERTICAL);
		tv1.setText("Vishnu is operator");
		
		setContentView(tv1);
	}

}
