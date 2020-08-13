#!groovy

pipeline {
      environment {
        JAVA_TOOL_OPTIONS = "-tapdk.home=/var/maven"
    }
    agent {
        docker {
            image "maven:3.6.0-jdk-11"
            label "docker"
            args "-v /tmp/maven:/var/maven/.m2 -e MAVEN_CONFIG=/var/maven/.m2"
        }
    }
    tools {
        maven "3.6.0" // You need to add a maven with name "3.6.0" in the Global Tools Configuration page
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
