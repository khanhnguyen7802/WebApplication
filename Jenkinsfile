pipeline {
    agent any 
    tools {
        maven 'apache-maven'  // Use the name in the "Manage Jenkins/Tools"
    }
    
    stages {
        // stage("Git Checkout") {
        //     steps {
        //         git branch: 'main', url: 'https://github.com/khanhnguyen7802/WebApplication'
        //     }
        // }

        stage("Build") {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }

        stage("Archive") {
            steps {
                archiveArtifacts artifacts: 'target\\*.jar', allowEmptyArchive: false, onlyIfSuccessful: true
            }
        }
    }

    post {
        success {
            echo 'Build and archive completed successfully.'
        }
        failure {
            echo 'Build or archive failed.'
        }
    }
}
