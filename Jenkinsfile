#!groovy

pipeline {

    agent {
        docker {
            image "maven:3.6.0-jdk-11"
            args '--name docker-node'

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
