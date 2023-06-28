import java.util.*; 
import java.io.*; 

public class BridgesToEmployment {
	
	public static void main(String[] args) {
		
		// Get a list of all available cities 
		ArrayList<String> cities = getCities(); 
		
		// Iterate through list and print out the cities 
		System.out.println("All Available Cities: ");
		for (String city : cities) {
			System.out.println(city);
		}
		
		// Ask user to enter city 
		Scanner sc = new Scanner(System.in); 
		System.out.println("\nPlease enter the city you wish to explore: ");
		String inputCity = sc.nextLine(); 
		
		// Check if the entered city is valid 
		while (!cities.contains(inputCity)) {
			System.out.println("The city you entered is not valid. Please enter a different city:");
			inputCity = sc.nextLine();
		}
		
		// Get the list of job postings for that city 
		ArrayList<String> jobListings = getJobListings(inputCity); 
		
		// Iterate through the list of job postings and print them out 
		System.out.println("\n" + inputCity + " Job Postings:");
		for (String job : jobListings) {
			System.out.println(job);
		}
		
		// Ask user to enter a job they are interested in 
		System.out.println("\nPlease enter the job you are interested in exploring further: ");
		String inputJob = sc.nextLine(); 
		
		// Check if the entered job is valid 
		while (!jobListings.contains(inputJob)) {
			System.out.println("The job you entered is not valid. Please enter a different job:");
			inputJob = sc.nextLine();
		}
		
		// Get the job description for the entered job 
		String jobDescription = getJobDescription(inputCity, inputJob); 
		
		// Print out the job description 
		System.out.println("\nJob Description for " + inputJob + ":");
		System.out.println(jobDescription);
		
		// Get the salary information for the entered job 
		String salaryInfo = getSalaryInfo(inputCity, inputJob); 
		
		// Print out the salary information 
		System.out.println("\nSalary Information for " + inputJob + ":");
		System.out.println(salaryInfo);
		
		// Ask user if they would like to apply 
		System.out.println("\nWould you like to apply for this job? (y/n)");
		String inputAnswer = sc.nextLine(); 
		
		// Check if user entered valid answer 
		while (!inputAnswer.equalsIgnoreCase("y") && !inputAnswer.equalsIgnoreCase("n")) {
			System.out.println("Please enter 'y' or 'n': ");
			inputAnswer = sc.nextLine();
		}
		
		// If user entered 'y', get the application form 
		if (inputAnswer.equalsIgnoreCase("y")) {
			String applicationForm = getApplicationForm(inputCity, inputJob); 
			
			// Print out the application form 
			System.out.println("\nApplication Form for " + inputJob + ":");
			System.out.println(applicationForm);
		} else {
			System.out.println("\nThank you for exploring Bridges to Employment!");
		}
		
		sc.close();
	}
	
	// Get a list of all available cities 
	public static ArrayList<String> getCities() {
		ArrayList<String> cities = new ArrayList<>(); 
		
		cities.add("New York"); 
		cities.add("Paris");
		cities.add("London");
		cities.add("Berlin");
		
		return cities; 
	}
	
	// Get the list of job postings for the city 
	public static ArrayList<String> getJobListings(String city) {
		ArrayList<String> jobListings = new ArrayList<>(); 
		
		if (city.equals("New York")) {
			jobListings.add("Software Engineer"); 
			jobListings.add("Data Scientist");
			jobListings.add("Lawyer");
		}
		
		if (city.equals("Paris")) {
			jobListings.add("Chef"); 
			jobListings.add("Waiter");
			jobListings.add("Architect");
		}
		
		if (city.equals("London")) {
			jobListings.add("Accountant");
			jobListings.add("Graphic Designer");
			jobListings.add("Teacher");
		}
		
		if (city.equals("Berlin")) {
			jobListings.add("Marketer");
			jobListings.add("Developer");
			jobListings.add("Writer");
		}
		
		return jobListings; 
	}
	
	// Get the job description for the city and job 
	public static String getJobDescription(String city, String job) {
		String jobDescription = ""; 
		
		if (city.equals("New York") && job.equals("Software Engineer")) {
			jobDescription = "Software Engineer is responsible for designing, developing, and testing software applications.";
		}
		
		if (city.equals("New York") && job.equals("Data Scientist")) {
			jobDescription = "Data Scientist is responsible for cleaning, transforming, and analyzing data to generate insights and solutions.";
		}
		
		if (city.equals("New York") && job.equals("Lawyer")) {
			jobDescription = "Lawyer is responsible for providing legal advice and representing clients in court.";
		}
		
		if (city.equals("Paris") && job.equals("Chef")) {
			jobDescription = "Chef is responsible for creating unique dishes and managing the kitchen staff.";
		}
		
		if (city.equals("Paris") && job.equals("Waiter")) {
			jobDescription = "Waiter is responsible for taking orders, serving food and drinks, and handling customer complaints.";
		}
		
		if (city.equals("Paris") && job.equals("Architect")) {
			jobDescription = "Architect is responsible for designing structures, such as buildings and bridges, and ensuring safety regulations are met.";
		}
		
		if (city.equals("London") && job.equals("Accountant")) {
			jobDescription = "Accountant is responsible for analyzing financial data, preparing reports, and advising clients on tax and legal matters.";
		}
		
		if (city.equals("London") && job.equals("Graphic Designer")) {
			jobDescription = "Graphic Designer is responsible for creating visual concepts, using a variety of design elements, to communicate ideas that inspire, inform, or captivate consumers.";
		}
		
		if (city.equals("London") && job.equals("Teacher")) {
			jobDescription = "Teacher is responsible for preparing lesson plans, teaching students in the classroom, and assessing student performance.";
		}
		
		if (city.equals("Berlin") && job.equals("Marketer")) {
			jobDescription = "Marketer is responsible for developing marketing plans, researching market trends, and creating digital content.";
		}
		
		if (city.equals("Berlin") && job.equals("Developer")) {
			jobDescription = "Developer is responsible for developing software applications, writing code, and fixing software bugs.";
		}
		
		if (city.equals("Berlin") && job.equals("Writer")) {
			jobDescription = "Writer is responsible for researching topics, constructing narratives, and crafting blog posts.";
		}
		
		return jobDescription; 
	}
	
	// Get the salary information for the city and job 
	public static String getSalaryInfo(String city, String job) {
		String salaryInfo = ""; 
		
		if (city.equals("New York") && job.equals("Software Engineer")) {
			salaryInfo = "Software Engineer salaries in New York range from $60,000 to $120,000 per year.";
		}
		
		if (city.equals("New York") && job.equals("Data Scientist")) {
			salaryInfo = "Data Scientist salaries in New York range from $90,000 to $150,000 per year.";
		}
		
		if (city.equals("New York") && job.equals("Lawyer")) {
			salaryInfo = "Lawyer salaries in New York range from $100,000 to $250,000 per year.";
		}
		
		if (city.equals("Paris") && job.equals("Chef")) {
			salaryInfo = "Chef salaries in Paris range from €35,000 to €45,000 per year.";
		}
		
		if (city.equals("Paris") && job.equals("Waiter")) {
			salaryInfo = "Waiter salaries in Paris range from €12,000 to €22,000 per year.";
		}
		
		if (city.equals("Paris") && job.equals("Architect")) {
			salaryInfo = "Architect salaries in Paris range from €40,000 to €70,000 per year.";
		}
		
		if (city.equals("London") && job.equals("Accountant")) {
			salaryInfo = "Accountant salaries in London range from £25,000 to £50,000 per year.";
		}
		
		if (city.equals("London") && job.equals("Graphic Designer")) {
			salaryInfo = "Graphic Designer salaries in London range from £30,000 to £45,000 per year.";
		}
		
		if (city.equals("London") && job.equals("Teacher")) {
			salaryInfo = "Teacher salaries in London range from £25,000 to £35,000 per year.";
		}
		
		if (city.equals("Berlin") && job.equals("Marketer")) {
			salaryInfo = "Marketer salaries in Berlin range from €35,000 to €50,000 per year.";
		}
		
		if (city.equals("Berlin") && job.equals("Developer")) {
			salaryInfo = "Developer salaries in Berlin range from €40,000 to €70,000 per year.";
		}
		
		if (city.equals("Berlin") && job.equals("Writer")) {
			salaryInfo = "Writer salaries in Berlin range from €25,000 to €35,000 per year.";
		}
		
		return salaryInfo;
	}
	
	// Get the application form for the city and job 
	public static String getApplicationForm(String city, String job) {
		String applicationForm = ""; 
		
		if (city.equals("New York") && job.equals("Software Engineer")) {
			applicationForm = "Application Form for Software Engineer in New York:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("New York") && job.equals("Data Scientist")) {
			applicationForm = "Application Form for Data Scientist in New York:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("New York") && job.equals("Lawyer")) {
			applicationForm = "Application Form for Lawyer in New York:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("Paris") && job.equals("Chef")) {
			applicationForm = "Application Form for Chef in Paris:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("Paris") && job.equals("Waiter")) {
			applicationForm = "Application Form for Waiter in Paris:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("Paris") && job.equals("Architect")) {
			applicationForm = "Application Form for Architect in Paris:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("London") && job.equals("Accountant")) {
			applicationForm = "Application Form for Accountant in London:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("London") && job.equals("Graphic Designer")) {
			applicationForm = "Application Form for Graphic Designer in London:\nName: _____\nAge: _____\nExperience: _____\nEducation: _____\n";
		}
		
		if (city.equals("London") && job.equals("Teacher")) {
			applicationForm = "