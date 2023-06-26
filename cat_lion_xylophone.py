# Bridges to Employment
#
# This program helps individuals gain employment through a variety of resources.

# Imports
import os
import sys
import re
import webbrowser
import requests
import bs4

# Functions

def job_search(keyword, location):
    '''This function uses the Indeed job search engine to find jobs
    based on a certain keyword and location.'''
    query_string = 'jobs?q=' + keyword + '&l=' + location
    base_url = 'https://www.indeed.com/'
    url = base_url + query_string
    page = requests.get(url)
    soup = bs4.BeautifulSoup(page.content, 'lxml')
    job_list = soup.find_all('div', class_='jobsearch-SerpJobCard')
    for job in job_list:
        job_title = job.find('div', class_='title').find('a').attrs['title']
        job_company = job.find('div', class_='sjcl').find('div', class_='company').get_text().strip()
        job_location = job.find('div', class_='sjcl').find('div', class_='location').get_text().strip()
        print(job_title + ' by ' + job_company + ' at ' + job_location)

def job_board():
    '''This function displays a list of job boards.'''
    boards = ['Authentic Jobs', 'Career Builder', 'Career Jet', 'Simply Hired',
    'Glassdoor', 'LinkUp', 'Monster', 'Job Rapido', 'The Muse', 'GitHub Jobs']
    print('Below are some popular job boards:')
    for i, board in enumerate(boards):
        print(str(i+1) + '. ' + board)

def learn_skills():
    '''This function displays a list of resources where users can learn skills
    to aid in the job search.'''
    print('Below are some resources to learn skills:')
    resources = ['Codecademy', 'Code School', 'Khan Academy', 'Coursera', 'Udemy',
    'EdX', 'Udacity', 'MIT Open Courseware', 'Lynda', 'Skillshare']
    for i, resource in enumerate(resources):
        print(str(i+1) + '. ' + resource)

def resume_writing():
    '''This function displays a list of resources to help
    with resume writing.'''
    print('Below are some resume writing resources:')
    resume_resources = ['Resume Genius', 'Resume Builder', 'Resume Companion', 
    'Career Perfect', 'LiveCareer', 'Resume-Now', 'My Perfect Resume']
    for i, resource in enumerate(resume_resources):
        print(str(i+1) + '. ' + resource)

def interview_preparation():
    '''This function displays a list of resources to help
    prepare for a job interview.'''
    print('Below are some job interview preparation resources:')
    interview_resources = ['The Interview Guys', 'Vault', 'Big Interview',
    'Glassdoor', 'YouTube', 'Job Interview Questions']
    for i, resource in enumerate(interview_resources):
        print(str(i+1) + '. ' + resource)

def job_application_form():
    '''This function allows for the user to enter information to
    print out a job application form.'''

    # Get user's information
    name = input('Name: ')
    address = input('Address: ')
    phone = input('Phone number: ')
    email = input('Email address: ')
    job_title = input('Job title you are applying for: ')

    # Print out the application form
    print('\n')
    print('Job application for ' + job_title)
    print('Name: ' + name)
    print('Address: ' + address)
    print('Phone number: ' + phone)
    print('Email address: ' + email)
    print('\n')
    print('Education:')
    print('\tSchool name: ')
    print('\tDates attended: ')
    print('\tDegree/certificate earned: ')
    print('\n')
    print('Employment history:')
    print('\tCompany name: ')
    print('\tPosition title: ')
    print('\tDates of employment: ')
    print('\tDescription of duties: ')
    print('\n')
    print('References:')
    print('\tName: ')
    print('\tRelationship: ')
    print('\tPhone number: ')
    print('\tEmail address: ')

# Main Program
def main():
    '''This is the main function of the program. It allows
    the user to access all of the functions.'''
    print('Welcome to Bridges to Employment!')
    print('Choose one of the following options:')
    print('1. Job search')
    print('2. Job boards')
    print('3. Learn skills')
    print('4. Resume writing')
    print('5. Interview preparation')
    print('6. Job application form')
    while True:
        choice = input('Enter your choice: ')
        if choice == '1':
            keyword = input('Enter the job title you would like to search for: ')
            location = input('Enter the location of where you would like to search: ')
            job_search(keyword, location)
        elif choice == '2':
            job_board()
        elif choice == '3':
            learn_skills()
        elif choice == '4':
            resume_writing()
        elif choice == '5':
            interview_preparation()
        elif choice == '6':
            job_application_form()
        elif choice == 'quit':
            print('Thank you for using Bridges to Employment!')
            break
        else:
            print('Invalid choice. Please try again.')

if __name__ == '__main__':
    main()