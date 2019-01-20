package xyz.sfc.parentalcontrol;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class signup extends AppCompatActivity {
    EditText name, email, password, confpass, mailid, address,number;
AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        confpass = (EditText) findViewById(R.id.cpass);
        mailid = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        number = (EditText) findViewById(R.id.phn);
        alertDialog=new AlertDialog.Builder(this);
    }

    public void onsignup(View view) {
        if (name.getText().toString().matches("")) {
        name.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if (email.getText().toString().matches("")) {
            email.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if (password.getText().toString().matches("")) {
            password.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if (confpass.getText().toString().matches("")) {
            confpass.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if (mailid.getText().toString().matches("")) {
            mailid.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if (address.getText().toString().matches("")) {
            address.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if (number.getText().toString().matches("")) {
            number.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.DARKEN);
        }
        if(password.getText().toString().matches(confpass.getText().toString()))
        {

        }
        else
        {
            alertDialog.setMessage("Password not Matching");
            alertDialog.show();
            alertDialog.setCancelable(true);
        }
       String bname=name.getText().toString();
        String bmail=mailid.getText().toString();
        String bpass=password.getText().toString();
        String bconfpass=confpass.getText().toString();
        String baddrs=address.getText().toString();
        String bphn=number.getText().toString();
        signupback signupback=new signupback(this);
        signupback.execute(bname,bmail,bphn,baddrs,bpass,bconfpass);
    }
}