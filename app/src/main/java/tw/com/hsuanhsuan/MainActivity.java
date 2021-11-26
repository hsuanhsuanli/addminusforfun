package tw.com.hsuanhsuan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MainActivity context = this;
    ClickSound clickSound;
    int soundtype;
    SharedPreferences sp;
    DisplayMetrics dm = new DisplayMetrics();
    int vWidth=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actBar = getSupportActionBar();
        actBar.hide();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        vWidth = dm.widthPixels;
        ImageView addgame = (ImageView) findViewById(R.id.addgame);
        ImageView minusgame = (ImageView) findViewById(R.id.minusgame);
        ImageView playsetting = (ImageView) findViewById(R.id.playsetting);
        LinearLayout titlebg = (LinearLayout) findViewById(R.id.maintitlebg);
        addgame.setOnClickListener(addgameOnClick);
        minusgame.setOnClickListener(minusgameOnClick);
        playsetting.setOnClickListener(playsettingOnClick);
        titlebg.getLayoutParams().width = (int)(vWidth);
    }

    private View.OnClickListener addgameOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sp=getSharedPreferences("sound_status",MODE_PRIVATE);
            soundtype = sp.getInt("Click_Status",0);
            clickSound = new ClickSound(context);
            clickSound.playSound(R.raw.mpsound);
            if(soundtype==0){
                clickSound.setMusicStatus(true);
            }else{
                clickSound.setMusicStatus(false);
            }
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Addgame.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener minusgameOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sp=getSharedPreferences("sound_status",MODE_PRIVATE);
            soundtype = sp.getInt("Click_Status",0);
            clickSound = new ClickSound(context);
            clickSound.playSound(R.raw.mpsound);
            if(soundtype==0){
                clickSound.setMusicStatus(true);
            }else{
                clickSound.setMusicStatus(false);
            }
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Minusgame.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener playsettingOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sp=getSharedPreferences("sound_status",MODE_PRIVATE);
            soundtype = sp.getInt("Click_Status",0);
            clickSound = new ClickSound(context);
            clickSound.playSound(R.raw.mpsound);
            if(soundtype==0){
                clickSound.setMusicStatus(true);
            }else{
                clickSound.setMusicStatus(false);
            }
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, playsetting.class);
            startActivity(intent);
        }
    };

}