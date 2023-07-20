#imports 
import pandas as pd 
import numpy as np 
import matplotlib.pyplot as plt 

#create a class of 'Bridges to Employment' 
class BridgesToEmployment: 
    #initialize the class
    def __init__(self, start_date, end_date, job_title):
        self.start_date = start_date
        self.end_date = end_date
        self.job_title = job_title
        
    #create a method to retrieve data
    def getData(self):
        #read the file
        df = pd.read_csv('joblist.csv')
        #filter the data by start and end dates, and job title
        jobs_df = df[(df["Start Date"] >= self.start_date) & (df["End Date"] <= self.end_date) & (df["Job Title"] == self.job_title)]
        return jobs_df 
    
    #create a method to visualize data
    def visualizeData(self, jobs_df):
        #set the x and y axis labels 
        plt.xlabel('Job Title') 
        plt.ylabel('Number of Positions')
        #create a bar chart using the job title and number of positions 
        plt.bar(jobs_df["Job Title"], jobs_df["Number of Positions"], color='blue')
        #show the bar chart 
        plt.show() 
        
    #create a method to analyze data
    def analyzeData(self, jobs_df):
        #calculate the average number of positions 
        avg_positions = jobs_df["Number of Positions"].mean()
        #calculate the min and max number of positions 
        min_positions = jobs_df["Number of Positions"].min()
        max_positions = jobs_df["Number of Positions"].max()
        #return the values 
        return (avg_positions, min_positions, max_positions)
    
#create an instance of the 'Bridges to Employment' class 
bridge = BridgesToEmployment('01/01/2019', '12/31/2019','Web Developer')
#use the getData method to retrieve the data 
jobs_df = bridge.getData()
#use the visualizeData method to visualize the data 
bridge.visualizeData(jobs_df)
#use the analyzeData method to analyze the data 
avg_positions, min_positions, max_positions = bridge.analyzeData(jobs_df)
#print the results 
print('Average Positions:', avg_positions) 
print('Minimum Positions:', min_positions) 
print('Maximum Positions:', max_positions)