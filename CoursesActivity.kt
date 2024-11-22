package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        // Assign buttons to each course
        val firstAidButton: Button = findViewById(R.id.firstAidButton)
        val sewingButton: Button = findViewById(R.id.sewingButton)
        val landscapingButton: Button = findViewById(R.id.landscapingButton)
        val lifeSkillsButton: Button = findViewById(R.id.lifeSkillsButton)
        val housekeepingButton: Button = findViewById(R.id.housekeepingButton)
        val eventPlanningButton: Button = findViewById(R.id.eventPlanningButton)
        val cookingButton: Button = findViewById(R.id.cookingButton)
        val gardenMaintenanceButton: Button = findViewById(R.id.gardenMaintenanceButton)
        val computerSkillsButton: Button = findViewById(R.id.computerSkillsButton)

        // Attach click listeners for each course
        firstAidButton.setOnClickListener {
            navigateToCourseDetails(
                "First Aid",
                "Learn life-saving techniques such as CPR, wound management, and emergency response.",
                arrayOf("Hands-on Training", "Certification", "Expert Guidance")
            )
        }

        sewingButton.setOnClickListener {
            navigateToCourseDetails(
                "Sewing",
                "Master the art of sewing and garment creation.",
                arrayOf("Tailoring Basics", "Machine Techniques", "Creative Design")
            )
        }

        landscapingButton.setOnClickListener {
            navigateToCourseDetails(
                "Landscaping",
                "Design and maintain beautiful outdoor spaces.",
                arrayOf("Sustainable Design", "Plant Identification", "Landscape Aesthetics")
            )
        }

        lifeSkillsButton.setOnClickListener {
            navigateToCourseDetails(
                "Life Skills",
                "Develop essential personal and professional skills.",
                arrayOf("Communication", "Time Management", "Problem Solving")
            )
        }

        housekeepingButton.setOnClickListener {
            navigateToCourseDetails(
                "Housekeeping",
                "Learn professional cleaning and organization.",
                arrayOf("Efficiency Techniques", "Safety Measures", "Hospitality Etiquette")
            )
        }

        eventPlanningButton.setOnClickListener {
            navigateToCourseDetails(
                "Event Planning",
                "Plan and execute memorable events.",
                arrayOf("Budget Management", "Vendor Coordination", "Creative Themes")
            )
        }

        cookingButton.setOnClickListener {
            navigateToCourseDetails(
                "Cooking",
                "Master culinary skills for home or professional kitchens.",
                arrayOf("Recipe Mastery", "Healthy Meals", "Plating Techniques")
            )
        }

        gardenMaintenanceButton.setOnClickListener {
            navigateToCourseDetails(
                "Garden Maintenance",
                "Learn the skills needed to care for and enhance gardens, from pruning to plant health.",
                arrayOf("Seasonal Planting", "Soil Management", "Tool Safety")
            )
        }

        computerSkillsButton.setOnClickListener {
            navigateToCourseDetails(
                "Basic Computer Skills",
                "Build essential computer literacy skills, from using productivity tools to navigating the web safely.",
                arrayOf("Software Basics", "Internet Safety", "File Management")
            )
        }
    }

    // Function to navigate to the course details activity
    private fun navigateToCourseDetails(courseName: String, courseDetails: String, courseFeatures: Array<String>) {
        val intent = Intent(this, CourseDetailsActivity::class.java)
        intent.putExtra("courseName", courseName)
        intent.putExtra("courseDetails", courseDetails)
        intent.putExtra("courseFeatures", courseFeatures)
        startActivity(intent)
    }
}
