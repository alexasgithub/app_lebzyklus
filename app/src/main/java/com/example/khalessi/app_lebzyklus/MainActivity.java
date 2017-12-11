package com.example.khalessi.app_lebzyklus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private final String TAG ="LifeCycle";
    private String meinText;
    private EditText nameText;

    private Spinner wochentagAuswahl;
    private String  [] wochentage;
    Button button;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("meinText", meinText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState !=null){
            meinText = savedInstanceState.getString("meinText");
        }

        wochentagAuswahl = (Spinner) findViewById(R.id.wochentage);
        wochentagAuswahl.setOnItemSelectedListener(this);
        //Zugriff auf das Array
        wochentage = getResources().getStringArray(R.array.wochentage);



 /*       button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameText = (EditText) findViewById(R.id.eingabe);
                //  nameText.setText(nameText);
                Log.d(TAG, "meinText=" + nameText.getText().toString()+" ");

            }
        });*/

    }

    public void onSpeichernClick(View v){
        nameText = (EditText) findViewById(R.id.eingabe);
        meinText = nameText.getText().toString()+" ";



    }




    @Override

    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() aufgerufen");
        Log.d(TAG, "meinText = "+meinText);

    }



    @Override
    protected void onStop() {
        Log.d(TAG,"onStop() aufgerufen");
        super.onStop();
        Log.d(TAG, "meinText = "+meinText);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy() aufgerufen");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause() aufgerufen");
        Log.d(TAG, "meinText = "+meinText);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume() aufgerufen");
        Log.d(TAG, "meinText = "+meinText);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart() aufgerufen");
        Log.d(TAG, "meinText = "+meinText);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //String tag = wochentagAuswahl.getSelectedItem().toString();

        String tag = wochentage[position];
        Log.d(TAG, "Tag = "+tag);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    /**
     *
     */


}
