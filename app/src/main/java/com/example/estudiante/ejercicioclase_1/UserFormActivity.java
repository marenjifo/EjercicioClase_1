package com.example.estudiante.ejercicioclase_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {

    private EditText edtUserFormName;
    private EditText edtUserFormEmail;
    private EditText edtUserFormUsername;
    private Button btnUserFormFinish;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

       // Intent solicitud = getIntent();

        edtUserFormName=findViewById(R.id.edt_userform_name);
        edtUserFormEmail=findViewById(R.id.edt_userform_email);
        edtUserFormUsername=findViewById(R.id.edt_userform_username);
        btnUserFormFinish=findViewById(R.id.btn_userform_finish);

        btnUserFormFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent respuesta = new Intent();
               String name= edtUserFormName.getText().toString();
               String email= edtUserFormEmail.getText().toString();
               String username= edtUserFormUsername.getText().toString();

                respuesta.putExtra("name", name);
                respuesta.putExtra("email",email);
                respuesta.putExtra("username",username);

                setResult(Constants.RESP_NEW_USER,respuesta);
                finish();
            }
        });
    }
}
