libraries{
    merge = true
    sonarqube
    junit
    jinja2
}
stages{
    continuous_integration{
        build
        static_code_analysis
        junit
        jinja
    }
}
pipeline {
  agent any
  stages {
    stage('Dev Deployment') {
      steps {
        retry(x) { // It Retries x number of times mentioned until its successful
          sh './dev-deploy.sh'
        }
      }
    }
  }
}
