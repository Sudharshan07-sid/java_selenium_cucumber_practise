pipeline {
    agent any

    triggers {
        pollSCM('H/2 * * * *')
    }
    stages {

        stage('Build') {
            steps {
                bat "mvn clean compile"
            }
        }

        stage('Test') {
            steps {
                bat "mvn test"
            }
        }

        stage('Publish Cucumber JSON Report') {
            steps {
                cucumber fileIncludePattern: 'target/cucumber.json'
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    reportDir: 'test-output',
                    reportFiles: 'cucumber-report.html',
                    reportName: 'Cucumber HTML Report'
                ])
            }
        }
    }

    post {
        success {
            emailext(
                to: 'tripaonee@gmail.com',
                subject: "Jenkins Build SUCCESS: ${currentBuild.fullDisplayName}",
                body: """Hello trip,

Great news! The Jenkins build completed successfully.

Build Status: SUCCESS
Build URL: ${env.BUILD_URL}

Regards,
Jenkins"""
            )
        }

        failure {
            emailext(
                to: 'tripaonee@gmail.com',
                subject: "Jenkins Build FAILURE: ${currentBuild.fullDisplayName}",
                body: """Hello trip,

The Jenkins build has FAILED. Please check and fix the issues.

Build Status: FAILURE
Build URL: ${env.BUILD_URL}

Regards,
Jenkins"""
            )
        }

        unstable {
            emailext(
                to: 'tripaonee@gmail.com',
                subject: "Jenkins Build UNSTABLE: ${currentBuild.fullDisplayName}",
                body: """Hello trip,

The Jenkins build is UNSTABLE. Please review the test results.

Build Status: UNSTABLE
Build URL: ${env.BUILD_URL}

Regards,
Jenkins"""
            )
        }
    }
}
