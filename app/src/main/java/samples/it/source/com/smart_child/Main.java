package samples.it.source.com.smart_child;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity implements View.OnClickListener {


    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mCatSound, mChickenSound, mCowSound, mDogSound, mDuckSound, mSheepSound, mNamePic, btn_next;
    private int mCountLoadedSound;
    private Context mContext;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Найди картинку");

        // получим идентификатор
        Button button = (Button) findViewById(R.id.bt);
        button.setOnClickListener(this);


    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.bt:
                intent = new Intent(this, Fruct1.class);
                startActivity(intent);
                break;

        }
    }
}




