pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    sh "mvn -version"
	            sh "mvn clean install"
               	     }
          }
        }
     }
	post {
		always {
		cleanWs()
		}
	}
}
