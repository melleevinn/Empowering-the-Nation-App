
Empowering The Nation Kotlin App 

1. GitHub Website Link   melleevinn/EmpoweringTheNationWebsite 
2. GitHub Android Link  melleevinn/Empowering-the-Nation-App 

## Project Description
A platform designed to empower individuals by offering a range of online courses through a responsive website and an intuitive Android app.

## Features
- Course summaries and details
- Fee calculator with discounts
- Contact form integration
- SEO best practices for the website
- Mobile app with course details navigation

## Setup Instructions
### Android App
1. Clone this repository.
2. Open the `AndroidApp` folder in Android Studio.
3. Sync the Gradle files and run the app on an emulator or a connected device.

## Code Log

1. Courses Page

Designed the main courses page with navigation to details.

Code Added (XML):
<Button
    android:id="@+id/firstAidButton"
    android:text="First Aid"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
    
Code Added (Kotlin):
firstAidButton.setOnClickListener {
    navigateToCourseDetails(
        "First Aid",
        "Learn life-saving techniques...",
        arrayOf("CPR", "Emergency Response")
    )
}


2. Course Details Page

Implemented a detailed course page that dynamically displays data passed from the previous page.

Code Added (Kotlin):
val courseName = intent.getStringExtra("courseName")
val courseDetails = intent.getStringExtra("courseDetails")
val features = intent.getStringArrayExtra("courseFeatures")
courseNameTextView.text = courseName
courseDetailsTextView.text = courseDetails


## Video Presentation
Watch the demo video on [YouTube](INSERT_VIDEO_LINK_HERE).

## Acknowledgements
- Used libraries: RecyclerView, Retrofit, etc.
- Inspiration from Coursera, Udemy.

