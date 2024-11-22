package com.example.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CourseDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_details)

        // Retrieve data passed from CoursesActivity
        val courseName = intent.getStringExtra("courseName") ?: "No Course Name"
        val courseDetails = intent.getStringExtra("courseDetails") ?: "No Details Available"
        val courseFeatures = intent.getStringArrayExtra("courseFeatures") ?: arrayOf("No Features Available")

        // Reference UI elements
        val courseNameTextView: TextView = findViewById(R.id.courseNameTextView)
        val courseDetailsTextView: TextView = findViewById(R.id.courseDetailsTextView)
        val courseFeaturesTextView: TextView = findViewById(R.id.courseFeaturesTextView)
        val enrollButton: Button = findViewById(R.id.enrollButton)

        // Set data to UI elements
        courseNameTextView.text = courseName
        courseDetailsTextView.text = courseDetails

        // Format and display features
        val formattedFeatures = courseFeatures.joinToString(separator = "\n") { "- $it" }
        courseFeaturesTextView.text = formattedFeatures

        // Enroll button action
        enrollButton.setOnClickListener {
            Toast.makeText(this, "Enrolled in $courseName successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}


