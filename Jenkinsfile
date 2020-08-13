#!groovy

pipeline {
        stage('Push image') {
        withDockerRegistry([ credentialsId: "docker-hub-credentials", url: "" ]) {
        bat "docker push devopsglobalmedia/teamcitydocker:build"
        }

    agent {
        docker {
            image "maven:3.6.0-jdk-11"
            label "docker"

        }
    }

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
        
    }

    post {
        always {
            cleanWs()
        }
    }
}
