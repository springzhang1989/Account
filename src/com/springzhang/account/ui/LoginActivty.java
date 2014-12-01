package com.springzhang.account.ui;

import com.springzhang.account.R;
import com.springzhang.account.R.id;
import com.springzhang.account.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivty extends Activity {

	private EditText passwordEt;

	private Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		passwordEt = (EditText) findViewById(R.id.et_password);
	}

	public void doBtnAction(View v) {
		if (passwordEt.getText().toString().equals("woshidaniu" + getDayOfWeek())) {
			Intent intent = new Intent(this, MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
			startActivity(intent);
			finish();
		} else {
			showToast("√‹¬Î≤ª∂‘");
		}
	}

	private int getDayOfWeek() {
		Time time = new Time();
		time.setToNow();
		return time.weekDay;
	}

	private void showToast(String msg) {
		if (toast == null) {
			toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
		} else {
			toast.setText(msg);
		}
		toast.show();
	}

}
