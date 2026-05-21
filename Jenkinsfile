pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/<username>/maven-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
