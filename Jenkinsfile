pipeline {
  agent any
  stages {
    stage('step1') {
      steps {
        sh 'echo "HOla"'
      }
    }
    stage('step2') {
      parallel {
        stage('step2') {
          steps {
            sh 'ls -l'
          }
        }
        stage('who2') {
          steps {
            sh 'whoami'
          }
        }
      }
    }
    stage('step3') {
      steps {
        sh 'exit 565'
      }
    }
    stage('who') {
      steps {
        sh 'who I am'
      }
    }
  }
}