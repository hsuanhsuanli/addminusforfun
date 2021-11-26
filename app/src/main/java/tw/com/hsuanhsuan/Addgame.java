package tw.com.hsuanhsuan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
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

public class Addgame extends AppCompatActivity {
    private Dialog AddEasyDialog;
    private Dialog AddMediumDialog;
    private Dialog AddHardDialog;
    Addgame context = this;
    ClickSound clickSound;
    int soundtype;
    SharedPreferences sp;
    DisplayMetrics dm = new DisplayMetrics();
    int vWidth=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgame);
        ActionBar actBar = getSupportActionBar();
        actBar.hide();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        vWidth = dm.widthPixels;
        ImageView addeasy = findViewById(R.id.addeasygame);
        ImageView addmedium = findViewById(R.id.addmediumgame);
        ImageView addhard = findViewById(R.id.addhardgame);
        ImageView backtohome = findViewById(R.id.addbacktohome);
        ImageView addeasyquestion = findViewById(R.id.addeasyquestion);
        ImageView addmediumquestion = findViewById(R.id.addmediumquestion);
        ImageView addhardquestion = findViewById(R.id.addhardquestion);
        ImageView addsetting = findViewById(R.id.addsetting);
        FrameLayout addgametitlebg = findViewById(R.id.addgametitlebg);
        addeasy.setOnClickListener(addeasyOnClick);
        addmedium.setOnClickListener(addmediumOnClick);
        addhard.setOnClickListener(addhardOnClick);
        backtohome.setOnClickListener(backtohomeOnClick);
        addeasyquestion.setOnClickListener(addeasyquestionOnClick);
        addmediumquestion.setOnClickListener(addmediumquestionOnClick);
        addhardquestion.setOnClickListener(addhardquestionOnClick);
        addsetting.setOnClickListener(addsettingOnClick);
        addgametitlebg.getLayoutParams().width = (int)(vWidth);
    }
    private View.OnClickListener addsettingOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(Addgame.this,AddSet.class);
            startActivity(it);
        }
    };
    private View.OnClickListener addeasyOnClick = new View.OnClickListener() {
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
            it.setClass(Addgame.this,AddEasy.class);
            startActivity(it);
        }
    };

    private View.OnClickListener addeasyquestionOnClick = new View.OnClickListener() {
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
            AddEasyDialog = new Dialog(Addgame.this);
            AddEasyDialog.setCancelable(false);
            AddEasyDialog.setContentView(R.layout.add_easy_dialog);
            ImageView addeasyno = AddEasyDialog.findViewById(R.id.addeasyno);
            addeasyno.setOnClickListener(addeasynoOnClick);
            AddEasyDialog.show();
        }
    };
    private View.OnClickListener addeasynoOnClick = new View.OnClickListener() {
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
            AddEasyDialog.dismiss();
        }
    };
    private View.OnClickListener addmediumOnClick = new View.OnClickListener() {
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
            it.setClass(Addgame.this,AddMedium.class);
            startActivity(it);
        }
    };

    private View.OnClickListener addmediumquestionOnClick = new View.OnClickListener() {
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
            AddMediumDialog = new Dialog(Addgame.this);
            AddMediumDialog.setCancelable(false);
            AddMediumDialog.setContentView(R.layout.add_medium_dialog);
            ImageView addmediumno = AddMediumDialog.findViewById(R.id.addmediumno);
            addmediumno.setOnClickListener(addmediumnoOnClick);
            AddMediumDialog.show();
        }
    };
    private View.OnClickListener addmediumnoOnClick = new View.OnClickListener() {
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
            AddMediumDialog.dismiss();
        }
    };
    private View.OnClickListener addhardOnClick = new View.OnClickListener() {
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
            it.setClass(Addgame.this,AddHard.class);
            startActivity(it);
        }
    };
    private View.OnClickListener addhardquestionOnClick = new View.OnClickListener() {
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
            AddHardDialog = new Dialog(Addgame.this);
            AddHardDialog.setCancelable(false);
            AddHardDialog.setContentView(R.layout.add_hard_dialog);
            ImageView addhardno = AddHardDialog.findViewById(R.id.addhardno);
            addhardno.setOnClickListener(addhardnoOnClick);
            AddHardDialog.show();
        }
    };
    private View.OnClickListener addhardnoOnClick = new View.OnClickListener() {
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
            AddHardDialog.dismiss();
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
            intent.setClass(Addgame.this, MainActivity.class);
            startActivity(intent);
        }
    };


}