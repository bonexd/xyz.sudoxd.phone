pipeline {
    agent any
    tools {
        gradle "gradle-3.5.1"
    }
    stages {
        stage('Accept Android SDK Licenses') {
            steps {
                sh 'echo y | $ANDROID_HOME/tools/bin/sdkmanager --licenses'
            }
        }
        stage('Build with Gradle') {
            steps {
                sh './gradlew clean build --no-daemon'
            }
        }
    }
}
