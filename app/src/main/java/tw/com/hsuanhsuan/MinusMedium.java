package tw.com.hsuanhsuan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MinusMedium extends AppCompatActivity {
    private static StringBuilder show_answer;
    private static StringBuilder QuizNo;
    private static StringBuilder Num1;
    private static StringBuilder Num2;
    private static StringBuilder title;
    private static StringBuilder Calculation;
    private int QNBoolean01=1;
    private int QNBoolean02=1;
    private int QNum=1;
    private int N1 = 0;
    private int N2 = 0;
    private int Total = 0;
    private int Score = 0;
    MinusMedium context = this;
    ClickSound clickSound;
    CorrectSound correctSound;
    WrongSound wrongSound;
    int soundtype;
    SharedPreferences sp;
    DisplayMetrics dm = new DisplayMetrics();
    int vWidth=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ActionBar actBar = getSupportActionBar();
        actBar.hide();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        vWidth = dm.widthPixels;
        show_answer = new StringBuilder();
        QuizNo = new StringBuilder();
        Num1 = new StringBuilder();
        Num2 = new StringBuilder();
        title = new StringBuilder();
        Calculation = new StringBuilder();
        ImageView btn1= findViewById(R.id.gamebtn1);
        ImageView btn2= findViewById(R.id.gamebtn2);
        ImageView btn3= findViewById(R.id.gamebtn3);
        ImageView btn4= findViewById(R.id.gamebtn4);
        ImageView btn5= findViewById(R.id.gamebtn5);
        ImageView btn6= findViewById(R.id.gamebtn6);
        ImageView btn7= findViewById(R.id.gamebtn7);
        ImageView btn8= findViewById(R.id.gamebtn8);
        ImageView btn9= findViewById(R.id.gamebtn9);
        ImageView btn0= findViewById(R.id.gamebtn0);
        ImageView backto= findViewById(R.id.addeasyback);
        ImageView again= findViewById(R.id.addeasyagain);
        FrameLayout gametitlebg = findViewById(R.id.gametitlebg);
        final ImageView equal = (ImageView)findViewById(R.id.gamebtnTrue);
        final ImageView backspace = (ImageView) findViewById(R.id.gamebtnFalse);
        final TextView gameAnswer = (TextView) findViewById(R.id.gameAnswer);
        final TextView gameQuizNo = (TextView) findViewById(R.id.gameQuizNo);
        final TextView gameNum01 = (TextView)findViewById(R.id.gameFirstNum);
        final TextView gameNum02 = (TextView)findViewById(R.id.gameSecondNum);
        final TextView gametitle = (TextView)findViewById(R.id.gametitle);
        final TextView addminus = (TextView)findViewById(R.id.addminus);
        gametitlebg.getLayoutParams().width = (int)(vWidth);
        title.append("減法-普通");
        Calculation.append("-");
        gametitle.setText(title);
        addminus.setText(Calculation);
        gameQuizNo.setText(QuizNo);
        gameQuizNo.setText(gameQuizNo.getText()+Integer.toString(QNum));
        while (QNBoolean01<2){
            N1 = (int) (Math.random() * 500 + 1);
            N2 = (int) (Math.random() * 500 + 1);
            Total = N1-N2;
            if(N1>N2&&N1>100&&N2>100){
                gameNum01.setText(gameNum01.getText()+Integer.toString(N1));
                gameNum02.setText(gameNum02.getText()+Integer.toString(N2));
                QNBoolean01=QNBoolean01+1;
            }
        }
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                sp=getSharedPreferences("sound_status",MODE_PRIVATE);
                soundtype = sp.getInt("Click_Status",0);
                clickSound = new ClickSound(context);
                clickSound.playSound(R.raw.mpsound);
                if(soundtype==0){
                    clickSound.setMusicStatus(true);
                }else{
                    clickSound.setMusicStatus(false);
                }
                if(show_answer.length()>0&&show_answer.length()<5){
                    show_answer.append("0");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("1");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("2");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("3");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("4");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("5");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("6");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("7");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("8");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()<5){
                    show_answer.append("9");
                    gameAnswer.setText(show_answer);
                }
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
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
                if(show_answer.length()!=0) {
                    show_answer.deleteCharAt(show_answer.length() - 1);
                    gameAnswer.setText(show_answer);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_answer.length()!=0){
                    String Answer=show_answer.toString();
                    String Sum=Integer.toString(Total);
                    if(Answer.equals(Sum)){
                        sp=getSharedPreferences("sound_status",MODE_PRIVATE);
                        soundtype = sp.getInt("Click_Status",0);
                        correctSound = new CorrectSound(context);
                        correctSound.playSound(R.raw.mpcorrect);
                        if(soundtype==0){
                            correctSound.setMusicStatus(true);
                        }else{
                            correctSound.setMusicStatus(false);
                        }
                        Score=Score+5;
                        if(QNum==40){
                            if(Score==200){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star5.class);
                                startActivity(it);
                            }else if(Score>150){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star4.class);
                                startActivity(it);
                            }else if(Score>100){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star3.class);
                                startActivity(it);
                            }else if(Score>50){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star2.class);
                                startActivity(it);
                            }else{
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star1.class);
                                startActivity(it);
                            }
                        }
                        QNum = QNum+1;
                        if(QNum<41){
                            gameQuizNo.setText(QuizNo);
                            gameQuizNo.setText(gameQuizNo.getText()+Integer.toString(QNum));
                        }
                        gameNum01.setText(Num1);
                        gameNum02.setText(Num2);
                        QNBoolean02=1;
                        while (QNBoolean02<2){
                            N1 = (int) (Math.random() * 500 + 1);
                            N2 = (int) (Math.random() * 500 + 1);
                            Total = N1-N2;
                            if(N1>N2&&N1>100&&N2>100){
                                gameNum01.setText(gameNum01.getText()+Integer.toString(N1));
                                gameNum02.setText(gameNum02.getText()+Integer.toString(N2));
                                show_answer.setLength(0);
                                gameAnswer.setText(show_answer);
                                QNBoolean02=QNBoolean02+1;
                            }
                        }
                    }else{
                        sp=getSharedPreferences("sound_status",MODE_PRIVATE);
                        soundtype = sp.getInt("Click_Status",0);
                        wrongSound = new WrongSound(context);
                        wrongSound.playSound(R.raw.mpwrong);
                        if(soundtype==0){
                            wrongSound.setMusicStatus(true);
                        }else{
                            wrongSound.setMusicStatus(false);
                        }
                        if(Score>3){
                            Score = Score-3;
                        }else{
                            Score = 0;
                        }
                        if(QNum==40){
                            if(Score==200){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star5.class);
                                startActivity(it);
                            }else if(Score>150){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star4.class);
                                startActivity(it);
                            }else if(Score>100){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star3.class);
                                startActivity(it);
                            }else if(Score>50){
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star2.class);
                                startActivity(it);
                            }else{
                                Intent it = new Intent();
                                it.setClass(MinusMedium.this,Star1.class);
                                startActivity(it);
                            }
                        }
                        QNum = QNum+1;
                        if(QNum<41){
                            gameQuizNo.setText(QuizNo);
                            gameQuizNo.setText(gameQuizNo.getText()+Integer.toString(QNum));
                        }
                        gameNum01.setText(Num1);
                        gameNum02.setText(Num2);
                        QNBoolean02=1;
                        while (QNBoolean02<2){
                            N1 = (int) (Math.random() * 500 + 1);
                            N2 = (int) (Math.random() * 500 + 1);
                            Total = N1-N2;
                            if(N1>N2&&N1>100&&N2>100){
                                gameNum01.setText(gameNum01.getText()+Integer.toString(N1));
                                gameNum02.setText(gameNum02.getText()+Integer.toString(N2));
                                show_answer.setLength(0);
                                gameAnswer.setText(show_answer);
                                QNBoolean02=QNBoolean02+1;
                            }
                        }
                    }
                }
            }
        });
        backto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
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
                intent.setClass(MinusMedium.this, Minusgame.class);
                startActivity(intent);
            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
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
                intent.setClass(MinusMedium.this, MinusMedium.class);
                startActivity(intent);
            }
        });
    }
}