pipeline {
    agent any
    stages {
        stage ('Checkout') {
            steps {
                git credentialsId: 'sitaram', url: 'https://github.com/Sitaramreddyk2020/Jenkins-Templating-Engine.git'
                }
        }
 
        stage ('Maven Build') {
            steps {
            sh 'mvn clean package'
            }
           
        }
         stage('deploy_to dev'){
         steps {
         sh 'scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/template.txt root@35.225.78.93:/tmp'
                               
      }
   }
         stage('deploy_to qa'){
         steps {
         sh 'scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/template.txt root@34.69.151.189:/tmp'
                               
      }
   }
        }
  
}
