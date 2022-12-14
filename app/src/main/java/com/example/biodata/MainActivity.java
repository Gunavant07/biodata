package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    TextView txtitlet;
    EditText edtname, edtsurname, edtgender, edtbirth, edtplace, edtage, edthight, edtweight, edtfather, edtmother, editbrother, editsister,
            edtmobile, edtemail, edtaddress, edtqualification, edtoccupation, edtSkill,edtHobby;
    Button btnsubmit;
    String Name, Surname, Birthdate, Birthplace, Age, Hight, Weight, Father, Mother, Brother,
            Sister, Qualification, Mobile, Email, Address, Occupation, Skill, Gender, Hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initClick();
    }

    void initBinding() {

        edtname = findViewById(R.id.edtname);
        edtsurname = findViewById(R.id.edtsurname);
        edtgender = findViewById(R.id.edtgender);
        edtbirth = findViewById(R.id.edtbirth);
        edtplace = findViewById(R.id.edtplace);
        edtage = findViewById(R.id.edtage);
        edthight = findViewById(R.id.edthight);
        edtweight = findViewById(R.id.edtweight);
        edtfather = findViewById(R.id.edtfather);
        edtmother = findViewById(R.id.edtmother);
        editbrother = findViewById(R.id.edtbrother);
        editsister = findViewById(R.id.edtsister);
        edtmobile = findViewById(R.id.edtmobile);
        edtemail = findViewById(R.id.edtemail);
        edtaddress = findViewById(R.id.edtaddress);
        edtqualification = findViewById(R.id.edtqualification);
        edtoccupation = findViewById(R.id.edtoccupation);
        edtSkill = findViewById(R.id.edtSkill);
        edtHobby=findViewById(R.id.edtHobby);
        btnsubmit = findViewById(R.id.btnsubmit);

    }

    void initClick() {

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = edtname.getText().toString();
                Surname = edtsurname.getText().toString();
                Gender = edtgender.getText().toString();
                Birthdate = edtbirth.getText().toString();
                Birthplace = edtplace.getText().toString();
                Age = edtage.getText().toString();
                Hight = edthight.getText().toString();
                Weight = edtweight.getText().toString();
                Father = edtfather.getText().toString();
                Mother = edtmother.getText().toString();
                Brother = editbrother.getText().toString();
                Sister = editsister.getText().toString();
                Qualification = edtqualification.getText().toString();
                Mobile = edtmobile.getText().toString();
                Email = edtemail.getText().toString();
                Address = edtaddress.getText().toString();
                Qualification = edtqualification.getText().toString();
                Occupation = edtoccupation.getText().toString();
                Skill = edtSkill.getText().toString();
                Hobby = edtHobby.getText().toString();


                Intent intent = new Intent(MainActivity.this, BIOdata2.class);
                intent.putExtra("Name", Name);
                intent.putExtra("Surname", Surname);
                intent.putExtra("Birthdate", Birthdate);
                intent.putExtra("Birthplace", Birthplace);
                intent.putExtra("Gender", Gender);
                intent.putExtra("Age", Age);
                intent.putExtra("Hight", Hight);
                intent.putExtra("Weight", Weight);
                intent.putExtra("Father", Father);
                intent.putExtra("Mother", Mother);
                intent.putExtra("Brother", Brother);
                intent.putExtra("Sister", Sister);
                intent.putExtra("Mobile", Mobile);
                intent.putExtra("Email", Email);
                intent.putExtra("Address", Address);
                intent.putExtra("Qualification", Qualification);
                intent.putExtra("Occupation", Occupation);
                intent.putExtra("Skill", Skill);
                intent.putExtra("Hobby", Hobby);

                startActivity(intent);

            }
        });
    }
}