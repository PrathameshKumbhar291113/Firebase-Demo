package com.example.firebasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebasedemo.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth
import splitties.activities.start

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.notRegisteredSignUpTextView.setOnClickListener {
            start<SignUpActivity>()
        }

        binding.signInBtn.setOnClickListener {
            val email = binding.signInEmail.text.toString()
            val pass = binding.signInPassword.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty()){
                if(email.endsWith("gmail.com") || email.endsWith("ac.in")){
                        firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                            if (it.isSuccessful){
                                start<HomeActivity>()
                            }else{
                                Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                            }
                        }
                }else{
                    Toast.makeText(this, "Only gmail.com & ac.in extension is valid !", Toast.LENGTH_SHORT).show()                }
            }else{
                Toast.makeText(this, "Empty Field not allowed !", Toast.LENGTH_SHORT).show()
            }
        }
    }
}