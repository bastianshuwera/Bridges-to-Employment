<?php 

//Defining the class 
class Bridges_to_Employment { 
   //Defining property 
   public $title; 
   public $max_hours; 
   public $pre_requisites; 


   //Constructor 
   public function __construct($title, $max_hours, $pre_requisites) { 
      $this->title = $title; 
      $this->max_hours = $max_hours; 
      $this->pre_requisites = $pre_requisites; 
   } 


   //Defining getter 
   public function getTitle() { 
      return $this->title; 
   } 


   //Defining setter 
   public function setTitle($title) { 
      $this->title = $title; 
   } 


   //Defining getter 
   public function getMaxHours() { 
      return $this->max_hours; 
   } 
   
   
   //Defining setter 
   public function setMaxHours($max_hours) { 
      $this->max_hours = $max_hours; 
   } 


   //Defining getter 
   public function getPreRequisites() { 
      return $this->pre_requisites; 
   } 
   
   
   //Defining setter 
    public function setPreRequisites($pre_requisites) { 
      $this->pre_requisites = $pre_requisites; 
   } 

} 


//Class instantiation 
$bte = new Bridges_to_Employment('Intro to Job Hunting', 15, 'High School Diploma'); 

//Getter and Setter 
echo $bte->getTitle(); 
echo '<br>'; 
$bte->setTitle('Career Readiness'); 
echo $bte->getTitle(); 
echo '<br>'; 
echo $bte->getMaxHours(); 
echo '<br>'; 
$bte->setMaxHours(20); 
echo $bte->getMaxHours(); 
echo '<br>'; 
echo $bte->getPreRequisites(); 
echo '<br>'; 
$bte->setPreRequisites('GED'); 
echo $bte->getPreRequisites(); 

?>