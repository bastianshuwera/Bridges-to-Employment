#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Struct for Job Openings
struct JobOpening {
	string employerName;
	string jobDescription;
	float salary;
}; 

// Struct for Program Members
struct ProgramMember {
	string name;
	int age;
	vector<JobOpening> jobApplications;
};

// Function to View All Openings 
void viewAllOpenings() {
	// List of Available Job Openings
	vector<JobOpening> openings = {
		{"Acme Corporation", "Software Developer", 75000.00},
		{"Techtrons", "Computer Engineer", 78000.00},
		{"DataGrove", "Web Designer", 68000.00},
		{"OmniTech", "Database Analyst", 72000.00},
		{"MD Networks", "Network Architect", 85000.00}
	};

	// Printing all Job Openings
	cout << "List of Available Job Openings: \n" << endl;
	for (int i = 0; i < openings.size(); i++) {
		JobOpening opening = openings.at(i);
		cout << opening.employerName << " - " << opening.jobDescription << " - $" << opening.salary << endl;
	}

	// End of Function
	cout << "\n" << endl;
}

// Function for Applying for a Job
void applyForJob(string name, JobOpening opening) {
	// Adding Job Opening to Program Member
	ProgramMember member;
	member.name = name;
	member.jobApplications.push_back(opening);
	cout << name << " has applied for a job at " << opening.employerName << endl;
}

// Function to Print All Program Members
void printProgramMembers() {
	// List of Program Members
	vector<ProgramMember> members = {
		{"John Smith", 25}, 
		{"Jane Doe", 32},
		{"Dan Hamilton", 28},
		{"Jessica Lee", 22},
		{"Julie Moore", 35}
	};

	// Printing All Program Members
	cout << "List of Program Members: \n" << endl;
	for (int i = 0; i < members.size(); i++) {
		ProgramMember member = members.at(i);
		cout << member.name << " - " << member.age << endl;
		for (int j = 0; j < member.jobApplications.size(); j++) {
			JobOpening opening = member.jobApplications.at(j);
			cout << "    Applied to: " << opening.employerName << " - " << opening.jobDescription << " - $" << opening.salary << endl;
		}
	}

	// End of Function
	cout << "\n" << endl;
}

// Main Function 
int main() {
	// View All Openings
	viewAllOpenings();

	// Apply for a Job
	applyForJob("John Smith", {"MD Networks", "Network Architect", 85000.00});

	// Print All Program Members
	printProgramMembers();

	return 0;
}