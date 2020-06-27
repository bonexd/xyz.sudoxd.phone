pipeline {
    agent any
    tools {
        gradle "GRADLE_LATEST"
    }
    stages {
        stage('Build with Gradle') {
            steps {
                sh 'gradlew clean build --no-daemon'
            }
        }
    }
}
