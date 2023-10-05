pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                checkout([
                    $class: 'GitSCM', 
                    branches: [[name: '*/main']], 
                    userRemoteConfigs: [[url: 'https://github.com/traansboy/retoDevCo.git']]
                ])
            }
        }
        stage('Test') {
            steps {
                bat 'gradle test'
            }
        }
        stage('Deploy') {
            steps {
                
            }
        }
    }
}
