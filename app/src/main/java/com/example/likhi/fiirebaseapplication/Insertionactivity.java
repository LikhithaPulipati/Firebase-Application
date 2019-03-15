package com.example.likhi.fiirebaseapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Insertionactivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button btn;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertionactivity);
        ed1=findViewById(R.id.rollname);
        ed2 =findViewById(R.id.name);
        btn=findViewById(R.id.submit);
        databaseReference =firebaseDatabase.getReference("stu data");

    }

    public void saverecord(View view){
        String iname=ed1.getText().toString();
        String iroll =ed2.getText().toString();
        Model modelclass = new Model(iname,iroll);
                String insert =databaseReference.push().getKey();
                databaseReference.child(insert).setValue(modelclass);
        Toast.makeText(this, "data inserted successfully", Toast.LENGTH_SHORT).show();

        finish();



    }
}
