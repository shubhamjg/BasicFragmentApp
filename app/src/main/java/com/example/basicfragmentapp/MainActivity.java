package com.example.basicfragmentapp;

import android.app.FragmentTransaction;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view){
        Fragment fr;
        if (view == findViewById(R.id.button)){
            fr=new fragmentone();
            Snackbar sb1=Snackbar.make(view,"This Fragment 1",Snackbar.LENGTH_LONG);
            sb1.show();
        }else if (view==findViewById(R.id.button2)){
            fr=new fragmenttwo();
            Snackbar sb1=Snackbar.make(view,"This Fragment 2",Snackbar.LENGTH_LONG);
            sb1.show();
        }
        else if (view==findViewById(R.id.button3)){

            fr= new Fragmentthree();
            Snackbar sb1=Snackbar.make(view,"This Fragment 3",Snackbar.LENGTH_LONG);
            sb1.show();
        }else if (view==findViewById(R.id.button4)){
            fr=new fragmentfour();
            Snackbar sb1=Snackbar.make(view,"This Fragment 4",Snackbar.LENGTH_LONG);
            sb1.show();
        }else{
            fr= new Fragmentadd();
            Snackbar sb1=Snackbar.make(view,"Final Exam: K00442066",Snackbar.LENGTH_LONG);
            sb1.show();
        }

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_place,fr).commit();



    }
}
