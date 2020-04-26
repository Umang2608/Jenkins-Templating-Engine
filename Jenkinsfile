pipeline {
    agent any
    stages {
        stage ('Checkout') {
            steps {
                git credentialsId: 'sitaram', url: 'https://github.com/Sitaramreddyk2020/JenkinsTemplate.git'
                }
        }
 
        stage ('Maven Build') {
            steps {
            sh 'mvn clean package'
            }
           
        }
         stage('deploy_to dev'){
         steps {
         sh 'sshpass -p root scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/pipleline-job/webapp/target/*.war root@104.154.16.83:/usr/local/tomcat/webapps/'
                               
      }
   }
         stage('deploy_to qa'){
         steps {
         sh 'sshpass -p root scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/pipleline-job/webapp/target/*.war root@34.71.72.18:/usr/local/tomcat/webapps/'
                               
      }
   }
        }
  
}

