package capstone.weeplay;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button register, log_in;
    EditText First_Name, UserName, Email, Password, ConfPassword;
    String F_Name_Holder, U_Name_Holder, EmailHolder, PasswordHolder, ConfPasswordHolder;
    String finalResult ;
    String HttpURL = "http://cgi.soic.indiana.edu/~shiqshen/UserRegistration.php";
    Boolean CheckEditText ;
    ProgressDialog progressDialog;
    HashMap<String,String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();
    public static final String Name = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Id'S
        First_Name = (EditText)findViewById(R.id.editTextF_Name);
        UserName = (EditText)findViewById(R.id.editTextU_Name);
        Email = (EditText)findViewById(R.id.editTextEmail);
        Password = (EditText)findViewById(R.id.editTextPassword);
        ConfPassword = (EditText)findViewById(R.id.editTextConfPassword);

        register = (Button)findViewById(R.id.Submit);
        log_in = (Button)findViewById(R.id.Login);


        //Adding Click Listener on button.
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Checking the format of email
                String email = Email.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z0-9]+\\.+[a-z]+";

                //Checking the confirmation password
                String pass = Password.getText().toString().trim();
                String repass = ConfPassword.getText().toString().trim();


                // Checking whether EditText is Empty or Not
                CheckEditTextIsEmptyOrNot();

                // If EditText is not empty and CheckEditText = True then this block will execute.
                if (CheckEditText) {
                    //If email format is correct or not
                    if (email.matches(emailPattern)) {
                        //If the password typing confirmation
                        if (pass.matches(repass)) {
                            UserRegisterFunction(F_Name_Holder, U_Name_Holder, EmailHolder, PasswordHolder, ConfPasswordHolder);
                        } else {
                            Toast.makeText(MainActivity.this, "Password Does Not Matches", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid email address", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }


                // If EditText is empty then this block will execute .
            }





        });

        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,UserLoginActivity.class);
                startActivity(intent);

            }
        });

    }



    public void CheckEditTextIsEmptyOrNot(){

        F_Name_Holder = First_Name.getText().toString();
        U_Name_Holder = UserName.getText().toString();
        EmailHolder = Email.getText().toString();
        PasswordHolder = Password.getText().toString();
        ConfPasswordHolder = ConfPassword.getText().toString();


        if(TextUtils.isEmpty(F_Name_Holder) || TextUtils.isEmpty(U_Name_Holder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(PasswordHolder) || TextUtils.isEmpty(ConfPasswordHolder))
        {

            CheckEditText = false;

        }

        else {

            CheckEditText = true ;
        }

    }

    public void UserRegisterFunction(final String F_Name, final String U_Name, final String email, final String password, final String confpassword){

        class UserRegisterFunctionClass extends AsyncTask<String,Void,String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                progressDialog = ProgressDialog.show(MainActivity.this,"Loading Data",null,true,true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                progressDialog.dismiss();
                if(httpResponseMsg.equals("Registration Successfully")){

                    finish();

                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);

                    intent.putExtra(Name, F_Name);

                    startActivity(intent);

                }
                else {
                    Toast.makeText(MainActivity.this, httpResponseMsg.toString(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("f_name",params[0]);

                hashMap.put("U_name",params[1]);

                hashMap.put("email",params[2]);

                hashMap.put("password",params[3]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }
        }

        UserRegisterFunctionClass userRegisterFunctionClass = new UserRegisterFunctionClass();

        userRegisterFunctionClass.execute(F_Name,U_Name,email,password, confpassword);
    }

}