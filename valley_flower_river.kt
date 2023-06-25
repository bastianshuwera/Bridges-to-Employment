//Bridges to Employment Program

//Package declaration
package com.bridgestoemployment

//Imports
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//Main Activity subclass
class MainActivity : AppCompatActivity() {

    //Global Variables
    lateinit var nameText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize variables
        nameText = findViewById(R.id.name_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val name = nameText.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Welcome to the BridgestoEmployment program " + name, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Second Activity subclass
class SecondActivity : AppCompatActivity() {

    //Global Variables
    lateinit var goalText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        //Initialize variables
        goalText = findViewById(R.id.goal_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val goal = goalText.text.toString().trim()
            if (goal.isEmpty()) {
                Toast.makeText(this, "Please enter your goal", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your goal is " + goal, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Third Activity subclass
class ThirdActivity : AppCompatActivity() {

    //Global Variables
    lateinit var jobText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        //Initialize variables
        jobText = findViewById(R.id.job_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val job = jobText.text.toString().trim()
            if (job.isEmpty()) {
                Toast.makeText(this, "Please enter your desired job", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your desired job is " + job, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Fourth Activity subclass
class FourthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var planText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fourth_activity)

        //Initialize variables
        planText = findViewById(R.id.plan_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val plan = planText.text.toString().trim()
            if (plan.isEmpty()) {
                Toast.makeText(this, "Please enter your action plan", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your action plan is " + plan, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Fifth Activity subclass
class FifthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var skillsText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fifth_activity)

        //Initialize variables
        skillsText = findViewById(R.id.skills_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val skills = skillsText.text.toString().trim()
            if (skills.isEmpty()) {
                Toast.makeText(this, "Please enter your skills", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your skills are " + skills, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Sixth Activity subclass
class SixthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var resourcesText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sixth_activity)

        //Initialize variables
        resourcesText = findViewById(R.id.resources_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val resources = resourcesText.text.toString().trim()
            if (resources.isEmpty()) {
                Toast.makeText(this, "Please enter your resources", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your resources are " + resources, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Seventh Activity subclass
class SeventhActivity : AppCompatActivity() {

    //Global Variables
    lateinit var networkText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seventh_activity)

        //Initialize variables
        networkText = findViewById(R.id.network_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val network = networkText.text.toString().trim()
            if (network.isEmpty()) {
                Toast.makeText(this, "Please enter your professional network", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your professional network is " + network, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Eighth Activity subclass
class EighthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var resumeText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eighth_activity)

        //Initialize variables
        resumeText = findViewById(R.id.resume_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val resume = resumeText.text.toString().trim()
            if (resume.isEmpty()) {
                Toast.makeText(this, "Please enter your resume information", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your resume information is " + resume, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Ninth Activity subclass
class NinthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var jobSearchText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ninth_activity)

        //Initialize variables
        jobSearchText = findViewById(R.id.job_search_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val jobSearch = jobSearchText.text.toString().trim()
            if (jobSearch.isEmpty()) {
                Toast.makeText(this, "Please enter your job search methods", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your job search methods are " + jobSearch, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Tenth Activity subclass
class TenthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var interviewText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tenth_activity)

        //Initialize variables
        interviewText = findViewById(R.id.interview_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val interview = interviewText.text.toString().trim()
            if (interview.isEmpty()) {
                Toast.makeText(this, "Please enter your interview preparation strategies", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your interview preparation strategies are " + interview, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Eleventh Activity subclass
class EleventhActivity : AppCompatActivity() {

    //Global Variables
    lateinit var feedbackText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eleventh_activity)

        //Initialize variables
        feedbackText = findViewById(R.id.feedback_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val feedback = feedbackText.text.toString().trim()
            if (feedback.isEmpty()) {
                Toast.makeText(this, "Please enter your feedback from job interviews", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your feedback from job interviews is " + feedback, Toast.LENGTH_SHORT).show()
            }
        })
    }
}

//Twelfth Activity subclass
class TwelfthActivity : AppCompatActivity() {

    //Global Variables
    lateinit var offerText: EditText
    lateinit var submitButton: Button

    //OnCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.twelfth_activity)

        //Initialize variables
        offerText = findViewById(R.id.offer_input)
        submitButton = findViewById(R.id.submit_button)

        //Set click listener
        submitButton.setOnClickListener(View.OnClickListener {
            val offer = offerText.text.toString().trim()
            if (offer.isEmpty()) {
                Toast.makeText(this, "Please enter your job offer considerations", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your job offer considerations are " + offer, Toast.LENGTH_SHORT).show()
            }
        })
    }
}