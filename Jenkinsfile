pipeline {
	agent any
    stages {
        stage('first-step') {
			    steps {
    			    echo 'Hello Jenkins!'
    			}       
        }
        stage('printVersion') {
           steps {
               pwsh "mvn -v"
           }
        }
    }
}