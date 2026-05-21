pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                git 'https://github.com/SGPRINCE46/jenkins.git'
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
