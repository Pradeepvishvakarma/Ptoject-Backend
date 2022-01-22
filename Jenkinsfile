pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
              
               // bat 'mvn -Dmaven.test.failure.ignore=true clean' 
                bat 'mvn compile' 
                echo 'Compiling Project....'
                echo 'Compiled Successfully'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                echo 'Testing.....'
                echo 'Tested Successfully'
            }
        }
         stage('Packaging') {
             steps {
                 bat 'mvn package'
                 echo 'Packaging.....'
                 echo 'JAR file  Successfully created'
             }
         }
        
        stage('Run'){
            steps {
                 bat 'mvn spring-boot:run'
                 echo 'Spring Boot Project is Running....'
                
             }
        }
       
        
      
    }
}