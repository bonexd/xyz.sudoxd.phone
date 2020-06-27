pipeline {
    agent any
    tools {
        gradle "gradle-3.5.1"
    }
    stages {
        stage('Build with Gradle') {
            steps {
                sh 'gradlew clean build --no-daemon'
            }
        }
    }
}
