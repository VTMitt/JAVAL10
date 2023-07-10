package com.example.registerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {
    private EditText firstNameET;
    private EditText lastNameET;
    private EditText emailET;

    private ImageView photo1;
    private ImageView photo2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstNameET = findViewById(R.id.userFirstNameField);
        lastNameET = findViewById(R.id.userSecondNameField);
        emailET = findViewById(R.id.userEmailField);

        photo1 = findViewById(R.id.ivPictureMan);
        photo2 = findViewById(R.id.ivWomanC);

        photo1.setImageResource(R.drawable.man_new);
        photo2.setImageResource(R.drawable.woman_new);
    }


    public void addUser(View view){

        RadioGroup rgDegree = findViewById(R.id.rgDegree);
        CheckBox checkBoxMan = findViewById(R.id.cbMan);
        CheckBox checkBoxWoman = findViewById(R.id.cbWoman);

        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();
        String email = emailET.getText().toString();
        String degreeProgram = "degree";
        int image;

        if(rgDegree.getCheckedRadioButtonId() == R.id.rbTietotekniikka){
            degreeProgram = "Tietotekniikka";
        } else if(rgDegree.getCheckedRadioButtonId() == R.id.rbTuotantotalous){
            degreeProgram = "Tuotantotalous";
        } else if(rgDegree.getCheckedRadioButtonId() == R.id.rbLaskennallinenTekniikka){
            degreeProgram = "Laskennallinen tekniikka";
        } else if(rgDegree.getCheckedRadioButtonId() == R.id.rbSahkoTekniikka){
            degreeProgram = "Sähkötekniikka";
        }
        User user = new User(firstName,lastName,email,degreeProgram);
        if(checkBoxMan.isChecked()){
            image = R.drawable.man_new;
            user.addImage(image);

        } else if(checkBoxWoman.isChecked()){
            image = R.drawable.woman_new;
            user.addImage(image);
        }
        UserStorage.getInstance().addUser(user);
    }
}