pipeline {
    agent any
    stages {
        stage ('SCM checkout') {
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
         steps(['tomcat-dev']) {
         sh 'sshpass -p Jenkins scp -o StrictHostKeyChecking=no webapp/target/*.war root@104.154.16.83:/usr/local/tomcat/webapps/'
                               
      }
   }
			  // stage('deploy_to qa'){
        // steps(['tomcat-dev']) {
        // sh 'sshpass -p Jenkins scp -o StrictHostKeyChecking=no webapp/target/*.war root@104.154.16.83:/usr/local/tomcat/webapps/
        }
  
    }

