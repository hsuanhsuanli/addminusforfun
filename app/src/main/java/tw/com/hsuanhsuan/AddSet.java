package tw.com.hsuanhsuan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class AddSet extends AppCompatActivity {
    ClickSound clickSound;
    AddSet context = this;
    int soundtype;
    SharedPreferences sp;
    DisplayMetrics dm = new DisplayMetrics();
    int vWidth=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playsetting);
        ActionBar actBar = getSupportActionBar();
        actBar.hide();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        vWidth = dm.widthPixels;
        sp=getSharedPreferences("sound_status",MODE_PRIVATE);
        ImageView soundopen = findViewById(R.id.soundopen);
        ImageView soundclose = findViewById(R.id.soundclose);
        ImageView backtohome = findViewById(R.id.backtohome);
        ImageView volumeon = findViewById(R.id.volumeon);
        ImageView volumeoff = findViewById(R.id.volumeoff);
        FrameLayout playsettingtitlebg = findViewById(R.id.playsettingtitlebg);
        soundopen.setOnClickListener(soundopenOnClick);
        soundclose.setOnClickListener(soundcloseOnClick);
        backtohome.setOnClickListener(backtohomeOnClick);
        playsettingtitlebg.getLayoutParams().width = (int)(vWidth);
        soundtype = sp.getInt("Click_Status",0);
        if(soundtype==2){
            soundopen.setVisibility(View.VISIBLE);
            soundclose.setVisibility(View.INVISIBLE);
            volumeon.setVisibility(View.INVISIBLE);
            volumeoff.setVisibility(View.VISIBLE);
        }else{
            soundopen.setVisibility(View.INVISIBLE);
            soundclose.setVisibility(View.VISIBLE);
            volumeon.setVisibility(View.VISIBLE);
            volumeoff.setVisibility(View.INVISIBLE);
        }
    }
    private View.OnClickListener soundopenOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            soundtype = sp.getInt("Click_Status",0);
            clickSound = new ClickSound(context);
            clickSound.playSound(R.raw.mpsound);
            if(soundtype==0){
                clickSound.setMusicStatus(true);
            }else{
                clickSound.setMusicStatus(false);
            }
            soundtype = 0;
            sp.edit().putInt("Click_Status",soundtype).commit();
            ImageView soundopen = findViewById(R.id.soundopen);
            ImageView soundclose = findViewById(R.id.soundclose);
            ImageView volumeon = findViewById(R.id.volumeon);
            ImageView volumeoff = findViewById(R.id.volumeoff);
            soundopen.setVisibility(View.INVISIBLE);
            soundclose.setVisibility(View.VISIBLE);
            volumeon.setVisibility(View.VISIBLE);
            volumeoff.setVisibility(View.INVISIBLE);
        }
    };
    private View.OnClickListener soundcloseOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            soundtype = sp.getInt("Click_Status",0);
            clickSound = new ClickSound(context);
            clickSound.playSound(R.raw.mpsound);
            if(soundtype==0){
                clickSound.setMusicStatus(true);
            }else{
                clickSound.setMusicStatus(false);
            }
            soundtype = 2;
            sp.edit().putInt("Click_Status",soundtype).commit();
            ImageView soundopen = findViewById(R.id.soundopen);
            ImageView soundclose = findViewById(R.id.soundclose);
            ImageView volumeon = findViewById(R.id.volumeon);
            ImageView volumeoff = findViewById(R.id.volumeoff);
            soundopen.setVisibility(View.VISIBLE);
            soundclose.setVisibility(View.INVISIBLE);
            volumeon.setVisibility(View.INVISIBLE);
            volumeoff.setVisibility(View.VISIBLE);
        }
    };
    private View.OnClickListener backtohomeOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            soundtype = sp.getInt("Click_Status",0);
            clickSound = new ClickSound(context);
            clickSound.playSound(R.raw.mpsound);
            if(soundtype==0){
                clickSound.setMusicStatus(true);
            }else{
                clickSound.setMusicStatus(false);
            }
            Intent intent = new Intent();
            intent.setClass(AddSet.this, Addgame.class);
            startActivity(intent);
        }
    };
}
