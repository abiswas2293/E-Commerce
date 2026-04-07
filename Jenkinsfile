pipeline {
    agent any

    tools {
        maven 'Maven 3.9'        // Name should match the Maven installation in Jenkins
    }



    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/abiswas2293/E-Commerce'  // Change to your repo
            }
        }

        stage('Start Selenium Grid') {
            steps {
                echo 'Starting Selenium Grid in background...'
                // Option A: If Grid is on same machine
                bat 'start /B java -jar selenium-server-4.41.0.jar standalone'   // For Windows
                // For Linux/Mac: sh 'nohup java -jar selenium-server-4.41.0.jar standalone > grid.log 2>&1 &'
                sleep time: 15, unit: 'SECONDS'   // Wait for Grid to start
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat "mvn clean test -Dbrowser=Firefox"   // For Windows
                // For Linux: sh "mvn clean test -Dbrowser=${params.BROWSER}"
            }
        }
    }

    post {
        always {
            // Publish reports
            testNG reportFiles: '**/testng-results.xml'
            publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/surefire-reports',
                reportFiles: 'emailable-report.html',
                reportName: 'Selenium Test Report'
            ])

            // Optional: Stop Grid (not always reliable in pipeline)
            // bat 'taskkill /F /IM java.exe'   // Dangerous - kills all java processes
        }
        success {
            echo '✅ Tests passed successfully!'
        }
        failure {
            echo '❌ Tests failed!'
        }
    }
}