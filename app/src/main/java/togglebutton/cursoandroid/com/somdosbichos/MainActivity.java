package togglebutton.cursoandroid.com.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cao;
    private ImageView gato;
    private ImageView vaca;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView) findViewById(R.id.imgCaId);

        gato = (ImageView) findViewById(R.id.imgGatId);

        leao = (ImageView) findViewById(R.id.imgLeId);

        vaca = (ImageView) findViewById(R.id.imgVacId);

        ovelha = (ImageView) findViewById(R.id.imgOvId);

        macaco = (ImageView) findViewById(R.id.imgMacId);


        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }

    public void onClick(View v){

        switch (v.getId()){

            case R.id.imgCaId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocar();
                break;

            case R.id.imgGatId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocar();
                break;
            case R.id.imgLeId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocar();
                break;
            case R.id.imgMacId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocar();
                break;
            case R.id.imgOvId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                break;
            case R.id.imgVacId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocar();
                break;

        }





    }
    public void tocar(){

        if(mediaPlayer != null){
            mediaPlayer.start();
        }

    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }


        super.onDestroy();
    }
}
