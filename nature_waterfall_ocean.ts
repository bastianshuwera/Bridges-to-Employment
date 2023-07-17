// Bridges to Employment //

// File: bridges.ts

// Imports:
import {BridgeToEmployment, Student, Job, Company} from './bridgesToEmployment';

// Class Definitions:
class BridgeToEmployment {
    // properties:
    private students: Student[];
    private employers: Job[];
    private companies: Company[];
    constructor() {
        this.students = [];
        this.employers = [];
        this.companies = [];
    }
    // methods:
    public registerStudent(student: Student): void {
        this.students.push(student);
    }
    public registerEmployer(job: Job): void {
        this.employers.push(job);
    }
    public registerCompany(company: Company): void {
        this.companies.push(company);
    }
    public connectStudentToJob(student: Student, job: Job): void {
        // code logic to connect a student to a job
    }
    public getMatchingJobsForStudent(student: Student): Job[] {
        // code logic to return a list of matching jobs for a student
        return [];
    }
    public hireStudent(student: Student, company: Company): void {
        // code logic to hire a student to a company
    }
    public getMatchingStudentsForCompany(company: Company): Student[] {
        // code logic to return a list of matching students for a company
        return [];
    }
}

class Student {
    // properties:
    private name: string;
    private skills: string[];
    constructor(name: string, skills: string[]) {
        this.name = name;
        this.skills = skills;
    }
    // methods:
    public getName(): string {
        return this.name;
    }
    public setName(name: string): void {
        this.name = name;
    }
    public getSkills(): string[] {
        return this.skills;
    }
    public setSkills(skills: string[]): void {
        this.skills = skills;
    }
}

class Job {
    // properties:
    private title: string;
    private skillsNeeded: string[];
    constructor(title: string, skillsNeeded: string[]) {
        this.title = title;
        this.skillsNeeded = skillsNeeded;
    }
    // methods:
    public getTitle(): string {
        return this.title;
    }
    public setTitle(title: string): void {
        this.title = title;
    }
    public getSkillsNeeded(): string[] {
        return this.skillsNeeded;
    }
    public setSkillsNeeded(skillsNeeded: string[]): void {
        this.skillsNeeded = skillsNeeded;
    }
}

class Company {
    // properties:
    private name: string;
    private hiringNeeds: Job[];
    constructor(name: string, hiringNeeds: Job[]) {
        this.name = name;
        this.hiringNeeds = hiringNeeds;
    }
    // methods:
    public getName(): string {
        return this.name;
    }
    public setName(name: string): void {
        this.name = name;
    }
    public getHiringNeeds(): Job[] {
        return this.hiringNeeds;
    }
    public setHiringNeeds(hiringNeeds: Job[]): void {
        this.hiringNeeds = hiringNeeds;
    }
}

// Main Program:
let bridge = new BridgeToEmployment();

let student1 = new Student('John Doe',['coding','networking','management']);
let student2 = new Student('Jane Doe',['coding','design','communication']);
let job1 = new Job('Software Developer',['coding','programming','networking']);
let job2 = new Job('Web Designer',['design','photoshop','communication']);
let company1 = new Company('Microsoft',[job1]);
let company2 = new Company('Google',[job2]);

bridge.registerStudent(student1);
bridge.registerStudent(student2);
bridge.registerEmployer(job1);
bridge.registerEmployer(job2);
bridge.registerCompany(company1);
bridge.registerCompany(company2);

bridge.connectStudentToJob(student1, job1);
bridge.connectStudentToJob(student2, job2);

let matchingJobsForJohn = bridge.getMatchingJobsForStudent(student1);
let matchingJobsForJane = bridge.getMatchingJobsForStudent(student2);

bridge.hireStudent(student1, company1);
bridge.hireStudent(student2, company2);

let matchingStudentsForMicrosoft = bridge.getMatchingStudentsForCompany(company1);
let matchingStudentsForGoogle = bridge.getMatchingStudentsForCompany(company2);