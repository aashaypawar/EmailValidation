package org.geeksforgeeks.emailvalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mEditText = findViewById<EditText>(R.id.edit_text)
        val mButton = findViewById<Button>(R.id.button)

        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

        mButton.setOnClickListener {
            if(mEditText.text.toString().trim{it <= ' '}.matches(emailPattern.toRegex())){
                Toast.makeText(applicationContext, "Valid Email!", Toast.LENGTH_SHORT).show()
            }
            else if(mEditText.text.toString().isNotEmpty()){
                Toast.makeText(applicationContext, "Invalid Email!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Please provide some input!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}