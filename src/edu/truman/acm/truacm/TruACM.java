package edu.truman.acm.truacm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TruACM extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tru_acm);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tru_acm, menu);
		return true;
	}

}
