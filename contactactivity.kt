package com.example.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        // UI Elements
        val nameInput: EditText = findViewById(R.id.nameInput)
        val emailInput: EditText = findViewById(R.id.emailInput)
        val messageInput: EditText = findViewById(R.id.messageInput)
        val submitButton: Button = findViewById(R.id.submitButton)
        val confirmationText: TextView = findViewById(R.id.confirmationText)

        // Submit Button Click Listener
        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val message = messageInput.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && message.isNotEmpty()) {
                confirmationText.text = "Thank you, $name! Your message has been received."
                confirmationText.setTextColor(resources.getColor(android.R.color.holo_green_light))
                Toast.makeText(this, "Message Sent Successfully!", Toast.LENGTH_SHORT).show()

                // Optionally clear the fields
                nameInput.text.clear()
                emailInput.text.clear()
                messageInput.text.clear()
            } else {
                confirmationText.text = "Please fill in all fields."
                confirmationText.setTextColor(resources.getColor(android.R.color.holo_red_light))
                Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
