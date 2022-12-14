package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BIOdata2 extends AppCompatActivity {

    String Name, Surname, Birthdate, Birthplace, Age, Gender, Hight, Weight, Father, Mother, Brother, Sister, Mobile, Email,
            Address, Qualification, Occupation, Skill, Hobby;
    TextView txtname, txtsurname, txtgender, txtbirth, txtplace, txtage, txthight, txtwaight, txtfather, txtmother,
            txtbrother, txtsister, txtmobile, txtemail, txtaddress, txtqualification, txtoccupation, txtskill, txthobby;

    ImageView imgcall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata2);
        initBinding();
        initintentdata();
        initSetdata();
        initOnClick();


    }

    void initBinding() {

        txtname = findViewById(R.id.txtname);
        txtsurname = findViewById(R.id.txtsurname);
        txtgender = findViewById(R.id.txtgender);
        txtbirth = findViewById(R.id.txtbirth);
        txtplace = findViewById(R.id.txtplace);
        txtage = findViewById(R.id.txtage);
        txthight = findViewById(R.id.txthight);
        txtwaight = findViewById(R.id.txtwaight);
        txtfather = findViewById(R.id.txtfather);
        txtmother = findViewById(R.id.txtmother);
        txtbrother = findViewById(R.id.txtbrother);
        txtsister = findViewById(R.id.txtsister);
        txtmobile = findViewById(R.id.txtmobile);
        txtemail = findViewById(R.id.txtemail);
        txtaddress = findViewById(R.id.txtaddress);
        txtqualification = findViewById(R.id.txtqualification);
        txtoccupation = findViewById(R.id.txtoccupation);
        txtskill = findViewById(R.id.txtskill);
        txthobby = findViewById(R.id.txthobby);
        imgcall=findViewById(R.id.imgcall);
    }

    void initSetdata() {
        txtname.setText(Name);
        txtsurname.setText(Surname);
        txtgender.setText(Gender);
        txtbirth.setText(Birthdate);
        txtplace.setText(Birthplace);
        txtage.setText(Age);
        txthight.setText(Hight);
        txtwaight.setText(Weight);
        txtfather.setText(Father);
        txtmother.setText(Mother);
        txtbrother.setText(Brother);
        txtsister.setText(Sister);
        txtmobile.setText(Mobile);
        txtemail.setText(Email);
        txtaddress.setText(Address);
        txtqualification.setText(Qualification);
        txtoccupation.setText(Occupation);
        txtskill.setText(Skill);
        txthobby.setText(Hobby);


    }

    void initintentdata() {
        Name = getIntent().getStringExtra("Name");
        Surname = getIntent().getStringExtra("Surname");
        Birthdate = getIntent().getStringExtra("Birthdate");
        Birthplace = getIntent().getStringExtra("Birthplace");
        Gender = getIntent().getStringExtra("Gender");
        Age = getIntent().getStringExtra("Age");
        Hight = getIntent().getStringExtra("Hight");
        Weight = getIntent().getStringExtra("Weight");
        Father = getIntent().getStringExtra("Father");
        Mother = getIntent().getStringExtra("Mother");
        Brother = getIntent().getStringExtra("Brother");
        Sister = getIntent().getStringExtra("Sister");
        Mobile = getIntent().getStringExtra("Mobile");
        Email = getIntent().getStringExtra("Email");
        Address = getIntent().getStringExtra("Address");
        Qualification = getIntent().getStringExtra("Qualification");
        Occupation = getIntent().getStringExtra("Occupation");
        Skill = getIntent().getStringExtra("Skill");
        Hobby = getIntent().getStringExtra("Hobby");


    }
     void initOnClick()
     {
         imgcall.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String Number=txtmobile.getText().toString();
                 Uri uri=Uri.parse("tell:+91"+Number);
                 Log.e("TAG","onClick:========"+uri);
                 Intent intent=new Intent(Intent.ACTION_DIAL);
                 intent.setData(uri);
                 startActivity(intent);
             }
         });

     }
}