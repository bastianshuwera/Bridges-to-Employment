// Bridges to Employment main class 
public class BridgesToEmployment {

	public static void main(String[] args) {
		System.out.println("Welcome to Bridges to Employment!");

		// Creating a Scanner object to receive user input 
		Scanner sc = new Scanner(System.in);

		// Prompting user to enter their name 
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();

		// Welcome the user by name 
		System.out.println("Welcome, " + name + "!");

		// Ask the user what type of job they are looking for 
		System.out.println("What type of job are you looking for?");
		String jobType = sc.nextLine();

		// Create a list of potential matches 
		System.out.println("Based on your job search, here are some potential matches:");
		String[] matches = {"Software Engineer", "Web Developer", "Data Analyst", "Business Analyst"};
		for (String match : matches) {
			System.out.println(match);
		}

		// Ask the user which job match they are interested in 
		System.out.println("Which job match are you interested in?");
		String selectedJob = sc.nextLine();

		// Gather the user's contact details 
		System.out.println("Please enter your email address:");
		String email = sc.nextLine();
		System.out.println("Please enter your phone number:");
		String phone = sc.nextLine();

		// Deliver a final message to the user 
		System.out.println("Thank you! We will keep your information on file and contact you if a potential "
				+ selectedJob + "opening arises. Have a great day!");

		// Close the Scanner object 
		sc.close();
	}
}