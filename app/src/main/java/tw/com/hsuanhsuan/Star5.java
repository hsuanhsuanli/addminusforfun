package tw.com.hsuanhsuan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Star5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star5);
        ActionBar actBar = getSupportActionBar();
        actBar.hide();
        ImageView again = findViewById(R.id.again05);
        ImageView home = findViewById(R.id.home05);
        again.setOnClickListener(againOnClick);
        home.setOnClickListener(homeOnClick);
    }
    private View.OnClickListener againOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(Star5.this,AddEasy.class);
            startActivity(it);
        }
    };
    private View.OnClickListener homeOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(Star5.this,MainActivity.class);
            startActivity(it);
        }
    };
}