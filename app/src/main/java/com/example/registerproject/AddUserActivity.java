package com.example.registerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
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
    private Context context;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstNameET = findViewById(R.id.userFirstNameField);
        lastNameET = findViewById(R.id.userSecondNameField);
        emailET = findViewById(R.id.userEmailField);

        context = AddUserActivity.this;
    }


    public void addUser(View view){

        RadioGroup rgDegree = findViewById(R.id.rgDegree);
        CheckBox checkBoxBachelor = findViewById(R.id.cbBachelor);
        CheckBox checkBoxEngineer = findViewById(R.id.cbEngineer);
        CheckBox checkBoxDoctor = findViewById(R.id.cbDoctor);
        CheckBox checkBoxSwimming = findViewById(R.id.cbSwimming);

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
        if(checkBoxBachelor.isChecked()){
            user.addBachelors();

        }
        if(checkBoxEngineer.isChecked()){
            user.addEngineer();

        }
        if(checkBoxDoctor.isChecked()){
            user.addDoctor();

        }
        if(checkBoxSwimming.isChecked()){
            user.addSwimming();
        }

        UserStorage.getInstance().addUser(user);
        UserStorage.getInstance().sortByAlphabet();
        UserStorage.getInstance().saveUsers(context);
    }
}