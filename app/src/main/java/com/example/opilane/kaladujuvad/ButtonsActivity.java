package com.example.opilane.kaladujuvad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ButtonsActivity extends AppCompatActivity {

    TextView textView,textView2,textView3;
    Switch aSwitch;
    ImageButton imageButton;
    Button button, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        textView = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        aSwitch = findViewById(R.id.switchButton);
        imageButton = findViewById(R.id.image);
        next = findViewById(R.id.next);



        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textView2.setText("Switch on");
                    textView2.setVisibility(View.VISIBLE);
                } else {
                    textView2.setText("Switch off");
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setText("Vajutasid nuppu");
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                textView3.setText("Just vajutasid nuppu alla");
                return false;
            }
        });
    }
    public void changeState(View view) {
        boolean checked = ((ToggleButton)view).isChecked();
        if (checked){
            textView.setVisibility(View.VISIBLE);
        }else  {
            textView.setVisibility(View.INVISIBLE);

        }
    }
    public void changePicture (View view){
        imageButton.setImageResource(R.drawable.lammas);
    }
    public void nextPage (View view){
        Intent intent = new Intent(ButtonsActivity.this, RadioButtonActivity.class);

    }
}

