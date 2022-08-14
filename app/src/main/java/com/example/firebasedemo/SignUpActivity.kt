package com.example.firebasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebasedemo.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import splitties.activities.start

class SignUpActivity : AppCompatActivity() {
    private  lateinit var binding: ActivitySignUpBinding
    //creating lateinit var for firebase authentication
    private lateinit var firebaseAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.alreadyRegisteredSignInTextView.setOnClickListener {
            start<SignInActivity>()
        }

        binding.signUpBtn.setOnClickListener {
            val email = binding.signUpEmail.text.toString()
            val pass = binding.signUpPassword.text.toString()
            val confirmPass = binding.confirmSignUpPassword.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()){
                if(email.endsWith("gmail.com") || email.endsWith("ac.in")){
                    if(pass == confirmPass){
                         firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                             if (it.isSuccessful){
                                 start<SignInActivity>()
                             }else{
                                 Toast.makeText(this,"Password Entered Is Incorrect !", Toast.LENGTH_SHORT).show()
                             }
                         }
                    }else{
                        Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(this, "Only gmail.com & ac.in extension is valid !", Toast.LENGTH_SHORT).show()                }
            }else{
                Toast.makeText(this, "Empty Field not allowed !", Toast.LENGTH_SHORT).show()
            }
        }
    }
}