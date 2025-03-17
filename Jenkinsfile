pipeline {
    agent any
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MavenTool"
    }

    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/m4ejs/Lab3DevOps']])

                bat 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                script{
                    bat 'docker build -t m4api/lab3devops-docker .'
                }
            }
        }

        stage('Push Docker Image to Docker Hub') {
            steps {
                script{
                    bat 'echo dckr_pat_n3vVL7t-Lgb_uQNawZL5uU6cWHw | docker login -u "m4api" --password-stdin'
                    bat 'docker push m4api/lab3devops-docker'
                }
            }
        }
    }
}
