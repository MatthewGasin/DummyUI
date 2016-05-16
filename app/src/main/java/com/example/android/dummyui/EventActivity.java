package com.example.android.dummyui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {
    ArrayList<String> choices;
    ArrayList<String> characters;
    ArrayList<ImageView> characterSlots;
    ArrayList<Button> choiceSlots;
    int background;
    String choiceText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Intent intent = getIntent();
        choices = intent.getStringArrayListExtra("choices");
        characters = intent.getStringArrayListExtra("characters");
        background = intent.getIntExtra("background", R.drawable.fjord);
        choiceText = intent.getStringExtra("choiceText");
        characterSlots = new ArrayList<ImageView>();
        choiceSlots = new ArrayList<Button>();

        characterSlots.add((ImageView) findViewById(R.id.Echar1));
        characterSlots.add((ImageView) findViewById(R.id.Echar2));
        characterSlots.add((ImageView) findViewById(R.id.Echar3));
        characterSlots.add((ImageView) findViewById(R.id.Echar4));

        choiceSlots.add((Button) findViewById(R.id.choice1));
        choiceSlots.add((Button) findViewById(R.id.choice2));
        choiceSlots.add((Button) findViewById(R.id.choice3));

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.eventLayout);

        TextView choiceBox = (TextView) findViewById(R.id.choiceBox);


        relativeLayout.setBackgroundResource(background);

        choiceBox.setText("     " + choiceText);

        int[] charPos = new int[characters.size()];
        for(int i = 0; i < characters.size(); i++){
            if (characters.get(i).equals("Holden")){
                charPos[i] = R.drawable.holden;
            }else if(characters.get(i).equals("Avatar")){
                charPos[i] = R.drawable.avatar;
            }else if(characters.get(i).equals("Icon")){
                charPos[i] = R.drawable.icon;
            }else{
                charPos[i] = -1;
            }
        }

        for(int i = 0; i < characterSlots.size()-1; i++){
            characterSlots.get(i).setImageResource(charPos[i]);
        }

        for(int i = 0; i < choiceSlots.size(); i++){
            choiceSlots.get(i).setText(choices.get(i));
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dialogue, menu);
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

    public void onNext(View view) {
        Intent intent = new Intent(this, DialogueActivity.class);


        ArrayList<String> dialogue = new ArrayList<String>();
        ArrayList<String> characters = new ArrayList<String>();
        int background = R.drawable.fjord;

        if(view.getId()==R.id.choice1){
            characters.add("holden");
            characters.add("avatar");
            dialogue.add("You can burn my clothes up when I'm gone");
            dialogue.add("You can tell your friends just what a fool I've been");
            dialogue.add("And laugh and joke about me on the phone");
            dialogue.add("You can tell my arms go back to the farm");
            dialogue.add("You can tell my feet to hit the floor");
            dialogue.add("Or you can tell my lips to tell my fingertips");
            dialogue.add("They won't be reaching out for you no more");
            dialogue.add("But don't tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("I just don't think he'd understand");
            dialogue.add("And if you tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("He might blow up and kill this man");
            dialogue.add("You can tell your mom I moved to Arkansas");
            dialogue.add("You can tell your dog to bite my leg");
            dialogue.add("Or tell your brother Cliff whose fist can tell my lip");
            dialogue.add("He never really liked me anyway");
            dialogue.add("Or tell your Aunt Louise, tell anything you please");
            dialogue.add("Myself already knows I'm not OK.");
            dialogue.add("Or you can tell my eyes to watch out for my mind");
            dialogue.add("It might be walking out on me today");
            dialogue.add("But don't tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("I just don't think he'd understand");
            dialogue.add("And if you tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("He might blow up and kill this man");
            dialogue.add("But don't tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("I just don't think he'd understand");
            dialogue.add("And if you tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("He might blow up and kill this man");
            dialogue.add("But don't tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("I just don't think he'd understand");
            dialogue.add("And if you tell my heart");
            dialogue.add("My achy breaky heart");
            dialogue.add("He might blow up and kill this man");
            dialogue.add("end");

        }else if(view.getId()==R.id.choice2){
            characters.add("holden");
            characters.add("icon");
            dialogue.add("is this the real life?");
            dialogue.add("Or is it just fantasy?");
            dialogue.add("caught in a landslide");
            dialogue.add("no escape from reality");
            dialogue.add("open your eyes");
            dialogue.add("look up to skies and see");
            dialogue.add("I'm just a poor boy, I need no sympathy");
            dialogue.add("because I'm easy come, easy go");
            dialogue.add("a little high, little low");
            dialogue.add("Anyway the wind blows, doesn't really matter to me, to me");
            dialogue.add("*interlude*");
            dialogue.add("Mama, just killed a man");
            dialogue.add("put a gun against his head");
            dialogue.add("pulled my trigger, now he's dead");
            dialogue.add("Mama, life had just begun");
            dialogue.add("but now I've gone and thrown it all away");
            dialogue.add("maamaaaaaa oooooo");
            dialogue.add("didn't mean to make you cry");
            dialogue.add("if I'm not back again this time tomorrow");
            dialogue.add("carry on, carry on, as if nothing really matters");
            dialogue.add("*interlude*");
            dialogue.add("too late, my time has come");
            dialogue.add("sends shivers down my spine");
            dialogue.add("dody's aching all the time");
            dialogue.add("goodbye everybody I've got to go");
            dialogue.add("gotta leave you all behind and face the truth");
            dialogue.add("maamaaaaaa oooooo (anyway the wind blows)");
            dialogue.add("I don't want to die");
            dialogue.add("I sometimes wish I'd never been born at all");
            dialogue.add("*interlude*");
            dialogue.add("I see a little silhouetto of a man");
            dialogue.add("scaramouch, scaramouch will you do the fandango");
            dialogue.add("thunderbolt and lightning very very frightening me");
            dialogue.add("Gallileo, Gallileo, Gallileo, Gallileo, Gallileo, Figaro- Magnifico!");
            dialogue.add("but I'm just a poor boy and nobody loves me");
            dialogue.add("he's just a poor boy from a poor family");
            dialogue.add("spare him his life from this monstrosity");
            dialogue.add("bismillah! No we will not let you go - let him go!");
            dialogue.add("bismillah! We will not let you go - let him go!");
            dialogue.add("bismillah! We will not let you go let me go!");
            dialogue.add("will not let you go let me go");
            dialogue.add("never let you go let me go");
            dialogue.add("never let me go ooo");
            dialogue.add("No, no, no, no, no, no, no");
            dialogue.add("Oh mama mia, mama mia, mama mia let me go");
            dialogue.add("Beelzebub has a devil put aside for me, for mee, for meeeee!");
            dialogue.add("*rocky interlude*");
            dialogue.add("so you think you can stop me and spit in my eye?");
            dialogue.add("so you think you can love me and leave me to die!");
            dialogue.add("oh baby can't do this to me baby");
            dialogue.add("Just gotta get out just gotta get right outta here!");
            dialogue.add("*interlude*");
            dialogue.add("oooh yeah, ooh yeah");
            dialogue.add("nothing really matters");
            dialogue.add("anyone can see");
            dialogue.add("nothing really matters nothing really matters to me");
            dialogue.add("...anyway the wind blows...");


        }else{
            characters.add("icon");
            characters.add("avatar");
            dialogue.add("ah!");


        }

        intent.putExtra("dialogue", dialogue);
        intent.putExtra("characters", characters);
        intent.putExtra("background", background);
        startActivity(intent);
    }
}
