package com.example.android.dummyui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DialogueActivity extends AppCompatActivity {

    ArrayList<String> dialogue;
    ArrayList<String> characters;
    int background;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        Intent intent = getIntent();
        dialogue = intent.getStringArrayListExtra("dialogue");
        characters = intent.getStringArrayListExtra("characters");

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.dialogueLayout);
        TextView dialogueBox = (TextView) findViewById(R.id.dialogueBox);


        relativeLayout.setBackgroundResource(background);
        dialogueBox.setText(dialogue.get(0));
        c = 0;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {

    }
}
