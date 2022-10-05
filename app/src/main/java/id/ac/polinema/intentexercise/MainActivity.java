package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	private Button button;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = findViewById(R.id.btn_register);


		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent pindah = new Intent(MainActivity.this, RegisterActivity.class);
				startActivity(pindah);
			}
		});
	}
}