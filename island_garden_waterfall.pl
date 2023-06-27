#!/usr/bin/perl

use strict;
use warnings;

#
# Read in environmental parameters
#
my $cwd = `pwd`;
my $path_to_config = "$cwd/resources/config.txt";
my %config_params = ();
open (my $config_file, '<', $path_to_config) or die "Could not open config file: $!";
while (my $line = <$config_file>) {
	chomp($line);
	my ($name,$value) = split( '=' , $line);
	$config_params{$name} = $value;
}
close $config_file;

#
# Establish database connection
#
use DBI;
my $database_name = $config_params{"db_name"};
my $database_user = $config_params{"db_user"};
my $database_password = $config_params{"db_pwd"};
my $dbh = DBI->connect("dbi:Pg:dbname=$database_name",$database_user,$database_password) or die "Couldn't connect to database: $!";

#
# Get list of Applicants from database
#
my $sql_statement = "SELECT * FROM applicant";
my $sth = $dbh->prepare($sql_statement);
$sth->execute or die "SQL Error: $DBI::errstr\n";

#
# Setup variables for looping through applicants
#
my $applicantId;
my $applicantName;
my $applicantAddress;
my $applicantPhoneNumber;
my $applicantEmail;
my @applicantSkills;
my @applicantWorkHistory;

#
# Loop through applicants
#
while (my @row = $sth->fetchrow_array) {
	$applicantId = $row[0];
	$applicantName = $row[1];
	$applicantAddress = $row[2];
	$applicantPhoneNumber = $row[3];
	$applicantEmail = $row[4];
	
	#
	# Get list of Applicant's Skills
	#
	my $skills_sql_statement = "SELECT * FROM skill WHERE applicant_id = ?";
	my $skills_sth = $dbh->prepare($skills_sql_statement);
	$skills_sth->execute($applicantId) or die "SQL Error: $DBI::errstr\n";
	while (my @skills_row = $skills_sth->fetchrow_array) {
		push(@applicantSkills, $skills_row[2]);
	}
	
	#
	# Get list of Applicant's Work History
	#
	my $work_sql_statement = "SELECT * FROM work WHERE applicant_id = ?";
	my $work_sth = $dbh->prepare($work_sql_statement);
	$work_sth->execute($applicantId) or die "SQL Error: $DBI::errstr\n";
	my $work_history_string = "";
	while (my @work_row = $work_sth->fetchrow_array) {
		$work_history_string = $work_history_string . " Employer Name: " . $work_row[3] . "; Job Title: " . $work_row[4] . "; Start Date: " . $work_row[5] . "; End Date: " . $work_row[6] . "; Description: " .  $work_row[7];
		push(@applicantWorkHistory, $work_history_string);
	}
	
	#
	# Print out the applicant's information
	#
	print "Applicant Information\n\n";
	print "Name: " . $applicantName . "\n";
	print "Address: " . $applicantAddress . "\n";
	print "Phone Number: " . $applicantPhoneNumber . "\n";
	print "Email: " . $applicantEmail . "\n\n";
	
	#
	# Print out the applicant's skills
	#
	print "Skills\n\n";
	foreach my $skill (@applicantSkills) {
		print $skill . "\n";
	}
	print "\n";
	
	#
	# Print out the applicant's work history
	#
	print "Work History\n\n";
	foreach my $work (@applicantWorkHistory) {
		print $work . "\n";
	}
	print "\n";
	
	#
	# Reset Variables
	#
	$applicantId;
	$applicantName;
	$applicantAddress;
	$applicantPhoneNumber;
	$applicantEmail;
	@applicantSkills = ();
	@applicantWorkHistory = ();

}

$sth->finish;
$dbh->disconnect;