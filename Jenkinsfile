pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Clone') {
            steps {
                git(
                    branch: 'main',
                    url: 'https://github.com/SGPRINCE46/jenkins.git'
                )
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
