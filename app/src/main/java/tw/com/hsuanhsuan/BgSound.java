package tw.com.hsuanhsuan;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

import java.util.HashMap;
import java.util.Map;

public class BgSound {

    MediaPlayer music;
    SoundPool soundPool;
    Context context;
    int[] sourceid = {R.raw.mpbg};
    Map<Integer,Integer> soundMap;

    public BgSound(Context context){
        this.context = context;
        initMusic();
        initSound();
    }

    public  void initSound(){
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,5);
        soundMap = new HashMap<Integer,Integer>();
        soundMap.put(sourceid[0],soundPool.load(context,sourceid[0],1));
        soundMap.put(sourceid[0],soundPool.load(context,sourceid[0],1));

    }
    public  void initMusic(){
        music = MediaPlayer.create(context,sourceid[0]);
        music.setLooping(true);
    }
    //播放音效
    public void playSound(int resId){
        Integer sId = soundMap.get(resId);
        if (sId != null)
            soundPool.play(sId,1,1,1,0,1);
    }
    public void setMusicStatus(int status){
        if (status==1)
            music.start();
        else if (status==2) {
            music.pause();
    }
        else{
            music.stop();
        }
    //不播了，要釋放資源
    }
    public void release(){
        music.release();
        soundPool.release();
        soundMap.clear();
    }
}
