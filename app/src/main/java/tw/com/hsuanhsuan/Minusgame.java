package tw.com.hsuanhsuan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Minusgame extends AppCompatActivity {
    private Dialog MinusEasyDialog;
    private Dialog MinusMediumDialog;
    private Dialog MinusHardDialog;
    Minusgame context = this;
    ClickSound clickSound;
    int soundtype;
    SharedPreferences sp;
    DisplayMetrics dm = new DisplayMetrics();
    int vWidth=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minusgame);
        ActionBar actBar = getSupportActionBar();
        actBar.hide();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        vWidth = dm.widthPixels;
        ImageView minuseasy = findViewById(R.id.minuseasygame);
        ImageView minusmedium = findViewById(R.id.minusmediumgame);
        ImageView minushard = findViewById(R.id.minushardgame);
        ImageView backtohome = findViewById(R.id.minusbacktohome);
        ImageView minuseasyquestion = findViewById(R.id.minuseasyquestion);
        ImageView minusmediumquestion = findViewById(R.id.minusmediumquestion);
        ImageView minushardquestion = findViewById(R.id.minushardquestion);
        ImageView minussetting = findViewById(R.id.minussetting);
        FrameLayout minusgametitlebg = findViewById(R.id.minusgametitlebg);
        minuseasy.setOnClickListener(minuseasyOnClick);
        minusmedium.setOnClickListener(minusmediumOnClick);
        minushard.setOnClickListener(minushardOnClick);
        backtohome.setOnClickListener(backtohomeOnClick);
        minuseasyquestion.setOnClickListener(minuseasyquestionOnClick);
        minusmediumquestion.setOnClickListener(minusmediumquestionOnClick);
        minushardquestion.setOnClickListener(minushardquestionOnClick);
        minussetting.setOnClickListener(minussettingOnClick);
        minusgametitlebg.getLayoutParams().width = (int)(vWidth);
    }
    private View.OnClickListener minussettingOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(Minusgame.this,MinusSet.class);
            startActivity(it);
        }
    };
    private View.OnClickListener minuseasyOnClick = new View.OnClickListener() {
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
            Intent it = new Intent();
            it.setClass(Minusgame.this,MinusEasy.class);
            startActivity(it);
        }
    };

    private View.OnClickListener minuseasyquestionOnClick = new View.OnClickListener() {
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
            MinusEasyDialog = new Dialog(Minusgame.this);
            MinusEasyDialog.setCancelable(false);
            MinusEasyDialog.setContentView(R.layout.minus_easy_dialog);
            ImageView minuseasyno = MinusEasyDialog.findViewById(R.id.minuseasyno);
            minuseasyno.setOnClickListener(minuseasynoOnClick);
            MinusEasyDialog.show();
        }
    };
    private View.OnClickListener minuseasynoOnClick = new View.OnClickListener() {
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
            MinusEasyDialog.dismiss();
        }
    };
    private View.OnClickListener minusmediumOnClick = new View.OnClickListener() {
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
            Intent it = new Intent();
            it.setClass(Minusgame.this,MinusMedium.class);
            startActivity(it);
        }
    };

    private View.OnClickListener minusmediumquestionOnClick = new View.OnClickListener() {
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
            MinusMediumDialog = new Dialog(Minusgame.this);
            MinusMediumDialog.setCancelable(false);
            MinusMediumDialog.setContentView(R.layout.minus_medium_dialog);
            ImageView minusmediumno = MinusMediumDialog.findViewById(R.id.minusmediumno);
            minusmediumno.setOnClickListener(minusmediumnoOnClick);
            MinusMediumDialog.show();
        }
    };
    private View.OnClickListener minusmediumnoOnClick = new View.OnClickListener() {
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
            MinusMediumDialog.dismiss();
        }
    };
    private View.OnClickListener minushardOnClick = new View.OnClickListener() {
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
            Intent it = new Intent();
            it.setClass(Minusgame.this,MinusHard.class);
            startActivity(it);
        }
    };
    private View.OnClickListener minushardquestionOnClick = new View.OnClickListener() {
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
            MinusHardDialog = new Dialog(Minusgame.this);
            MinusHardDialog.setCancelable(false);
            MinusHardDialog.setContentView(R.layout.minus_hard_dialog);
            ImageView minushardno = MinusHardDialog.findViewById(R.id.minushardno);
            minushardno.setOnClickListener(minushardnoOnClick);
            MinusHardDialog.show();
        }
    };
    private View.OnClickListener minushardnoOnClick = new View.OnClickListener() {
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
            MinusHardDialog.dismiss();
        }
    };
    private View.OnClickListener backtohomeOnClick =new View.OnClickListener() {
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
            intent.setClass(Minusgame.this, MainActivity.class);
            startActivity(intent);
        }
    };
}