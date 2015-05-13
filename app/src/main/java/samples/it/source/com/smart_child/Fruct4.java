package samples.it.source.com.smart_child;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Fruct4 extends Activity implements View.OnClickListener {

    Button b, b2, b3, b4, b5, b6, btnTry;
    int[] arrLeft = {20, 210, 400};
    int[] arrTop = {10, 160};
    int count = 6;

//    private SoundPool mSoundPool;
//    private AssetManager mAssetManager;
//    private int mCatSound, mChickenSound, mCowSound, mDogSound, mDuckSound, mSheepSound, mNamePic, btn_next;
//    private int mCountLoadedSound;
//    private Context mContext;
//    private ProgressDialog mProgressDialog;
//    ImageButton cowImageButton, chickenImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruct4);
        b = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        btnTry = (Button) findViewById(R.id.button_try);
        b6.setOnClickListener(this);
        btnTry.setOnClickListener(this);
        generateNewPosition();
//        h = new Handler(){
    }



    void generateNewPosition() {
        int i = (int) (Math.random() * 4);
        RelativeLayout.LayoutParams paramContactImage = new RelativeLayout.LayoutParams(dpToPx(140), dpToPx(140));
        RelativeLayout.LayoutParams paramContactImage2 = new RelativeLayout.LayoutParams(dpToPx(140), dpToPx(140));
        RelativeLayout.LayoutParams paramContactImage3 = new RelativeLayout.LayoutParams(dpToPx(140), dpToPx(140));
        RelativeLayout.LayoutParams paramContactImage4 = new RelativeLayout.LayoutParams(dpToPx(140), dpToPx(140));
        RelativeLayout.LayoutParams paramContactImage5 = new RelativeLayout.LayoutParams(dpToPx(140), dpToPx(140));
        RelativeLayout.LayoutParams paramContactImage6 = new RelativeLayout.LayoutParams(dpToPx(140), dpToPx(140));
        switch (i) {
            case (0):
                paramContactImage.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage.topMargin = dpToPx(arrTop[0]);
                b.setLayoutParams(paramContactImage);
                paramContactImage2.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage2.topMargin = dpToPx(arrTop[0]);
                b2.setLayoutParams(paramContactImage2);
                paramContactImage3.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage3.topMargin = dpToPx(arrTop[0]);
                b3.setLayoutParams(paramContactImage3);
                paramContactImage4.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage4.topMargin = dpToPx(arrTop[1]);
                b4.setLayoutParams(paramContactImage4);
                paramContactImage5.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage5.topMargin = dpToPx(arrTop[1]);
                b5.setLayoutParams(paramContactImage5);
                paramContactImage6.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage6.topMargin = dpToPx(arrTop[1]);
                b6.setLayoutParams(paramContactImage6);
                break;
            case (1):
                paramContactImage.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage.topMargin = dpToPx(arrTop[0]);
                b.setLayoutParams(paramContactImage);
                paramContactImage2.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage2.topMargin = dpToPx(arrTop[0]);
                b2.setLayoutParams(paramContactImage2);
                paramContactImage3.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage3.topMargin = dpToPx(arrTop[0]);
                b3.setLayoutParams(paramContactImage3);
                paramContactImage4.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage4.topMargin = dpToPx(arrTop[1]);
                b4.setLayoutParams(paramContactImage4);
                paramContactImage5.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage5.topMargin = dpToPx(arrTop[1]);
                b5.setLayoutParams(paramContactImage5);
                paramContactImage6.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage6.topMargin = dpToPx(arrTop[1]);
                b6.setLayoutParams(paramContactImage6);
                break;
            case (2):
                paramContactImage.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage.topMargin = dpToPx(arrTop[1]);
                b.setLayoutParams(paramContactImage);
                paramContactImage2.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage2.topMargin = dpToPx(arrTop[1]);
                b2.setLayoutParams(paramContactImage2);
                paramContactImage3.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage3.topMargin = dpToPx(arrTop[0]);
                b3.setLayoutParams(paramContactImage3);
                paramContactImage4.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage4.topMargin = dpToPx(arrTop[0]);
                b4.setLayoutParams(paramContactImage4);
                paramContactImage5.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage5.topMargin = dpToPx(arrTop[0]);
                b5.setLayoutParams(paramContactImage5);
                paramContactImage6.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage6.topMargin = dpToPx(arrTop[1]);
                b6.setLayoutParams(paramContactImage6);
                break;

            case (3):
                paramContactImage.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage.topMargin = dpToPx(arrTop[0]);
                b.setLayoutParams(paramContactImage);
                paramContactImage2.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage2.topMargin = dpToPx(arrTop[0]);
                b2.setLayoutParams(paramContactImage2);
                paramContactImage3.leftMargin = dpToPx(arrLeft[1]);
                paramContactImage3.topMargin = dpToPx(arrTop[1]);
                b3.setLayoutParams(paramContactImage3);
                paramContactImage4.leftMargin = dpToPx(arrLeft[0]);
                paramContactImage4.topMargin = dpToPx(arrTop[1]);
                b4.setLayoutParams(paramContactImage4);
                paramContactImage5.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage5.topMargin = dpToPx(arrTop[1]);
                b5.setLayoutParams(paramContactImage5);
                paramContactImage6.leftMargin = dpToPx(arrLeft[2]);
                paramContactImage6.topMargin = dpToPx(arrTop[0]);
                b6.setLayoutParams(paramContactImage6);
                break;
        }
    }

    private void findItem1() {

//            playSound(mCowSound);
    }
    private void findItem2() {
        //            playSound(mCowSound);

    }
    private void findItem3() {

//            playSound(mCowSound);

    }
    private void findItem4() {

//            playSound(mCowSound);

    }
    private void findItem5() {
//            playSound(mCowSound);
    }



    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button:
//                playSound(mCowSound);
              if(count == 6) {
                  v.setVisibility(View.INVISIBLE);
                  --count;
                  findItem5();
              } else {
//                    playSound(mChickenSound);
        }
                break;
            case R.id.button2:
                if(count == 5) {
//                playSound(mChickenSound);
                    v.setVisibility(View.INVISIBLE);
                    findItem4();
                    --count;
                }else {
//                    playSound(mChickenSound);
                }
                break;
            case R.id.button3:
              if(count == 4) {
//                playSound(mChickenSound);
                v.setVisibility(View.INVISIBLE);
                  findItem3();
                  --count;
        }else {
//                    playSound(mChickenSound);
              }
                break;
            case R.id.button4:
             if(count == 3) {
//                playSound(mChickenSound);
                v.setVisibility(View.INVISIBLE);
                findItem2();
                 --count;

        }else {
//                    playSound(mChickenSound);
             }
                break;
            case R.id.button5:
               if(count == 2) {
//                playSound(mChickenSound);
                v.setVisibility(View.INVISIBLE);
                findItem1();
                   -- count;
        }else {
//                    playSound(mChickenSound);
               }
                break;
            case R.id.button6:
                v.setVisibility(View.INVISIBLE);
                if(count == 1) {
//                playSound(mChickenSound);
                    v.setVisibility(View.INVISIBLE);
                    findItem1();
                    -- count;
                    intent = new Intent(this, Fruct5.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.button_try:
                intent = new Intent(this, Fruct5.class);
                startActivity(intent);
//                playSound(mDogSound);
                break;
        }
    }

    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}