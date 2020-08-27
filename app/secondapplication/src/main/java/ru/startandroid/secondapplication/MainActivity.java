package ru.startandroid.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


public class MainActivity extends Activity {

    //Fragment1 frag1;
    Fragment2 frag2;
    Fragment3 frag3;
    Fragment4 frag4;
    Fragment5 frag5;
    FragmentTransaction fTrans;
    CheckBox chbStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new Fragment1();
        frag2 = new Fragment2();
        frag3 = new Fragment3();
        frag4 = new Fragment4();
        frag5 = new Fragment5();

        chbStack = (CheckBox)findViewById(R.id.chbStack);

    }
    public void onClick(View v) {

        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.gofrag1:
                fTrans.add(R.id.frgmCont, frag1);
               /* fTrans.show(frag1);
                fTrans.remove(frag2);
                fTrans.remove(frag3);
                fTrans.remove(frag4);*/
                break;
            case R.id.gofrag2:
                fTrans.add(R.id.frgmCont, frag2);
                /*fTrans.show(frag2);
                fTrans.remove(frag1);
                fTrans.remove(frag3);
                fTrans.remove(frag4);*/
                break;
            case R.id.gofrag3:
                fTrans.add(R.id.frgmCont, frag3);
                /*fTrans.show(frag3);
                fTrans.remove(frag1);
                fTrans.remove(frag2);
                fTrans.remove(frag4);
                break;*/
                break;
            case R.id.gofrag4:
                fTrans.add(R.id.frgmCont, frag4);
                /*fTrans.show(frag4);
                fTrans.remove(frag1);
                fTrans.remove(frag2);
                fTrans.remove(frag3);*/
                break;
            case R.id.gofrag5:
                fTrans.add(R.id.frgmCont, frag5);
                /*fTrans.show(frag4);
                fTrans.remove(frag1);
                fTrans.remove(frag2);
                fTrans.remove(frag3);*/
                break;
            //case R.id.btnRemove:
                /*if ()
                switch (getFragmentManager())
                {
                    case (R.layout.fragment_1):
                        fTrans.remove(frag1);
                        break;
                    case (R.layout.fragment_2):
                        fTrans.remove(frag2);
                }*/
                //fTrans.remove(frag1);

                //fTrans.hide(frag2);


               /* break;
            case R.id.btnReplace:
                //fTrans.show(frag2);
                fTrans.replace(R.id.frgmCont, frag2);

            default:
                break;*/
        }
        if (chbStack.isChecked()) fTrans.addToBackStack(null);
        fTrans.commit();
    }
}
