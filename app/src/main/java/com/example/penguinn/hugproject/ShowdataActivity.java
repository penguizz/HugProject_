package com.example.penguinn.hugproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ShowdataActivity extends AppCompatActivity {
//    TextView profile,stu_name,stu_lastname,stu_phone,parent_name,parent_lastname,parent_phone,parent_email;
    EditText edit_stu_name,edit_stu_lastname,edit_stu_phone,edit_parent_name,
            edit_parent_lastname,edit_parent_phone,edit_parent_email;
    Button btn_edit,btn_save;
    String sFirstName,sLestName,sPhone,pFirstName,pLastName,pPhone,pEmail;
    RegisterActivity registerActivity;
    ListView listView;
    List userList;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);


        edit_stu_name = (EditText)findViewById(R.id.edit_stu_name);
        edit_stu_lastname = (EditText)findViewById(R.id.edit_stu_lastname);
        edit_stu_phone = (EditText)findViewById(R.id.edit_stu_phone);
        edit_parent_name = (EditText)findViewById(R.id.edit_parent_name);
        edit_parent_lastname = (EditText)findViewById(R.id.edit_parent_lastname);
        edit_parent_phone = (EditText)findViewById(R.id.edit_parent_phone);
        edit_parent_email = (EditText)findViewById(R.id.edit_parent_email);


        btn_edit = (Button) findViewById(R.id.btn_edit);
        btn_save = (Button) findViewById(R.id.btn_save);

    }


}
