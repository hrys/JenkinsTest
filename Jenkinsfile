pipeline {
    agent any

    parameters {
        booleanParam defaultValue: true, name: 'Example01'
        booleanParam defaultValue: true, name: 'Example02'
    }
    
    stages {
        stage('Example01') {
            when {
                environment name: 'Example01', value: 'true'
            }
            steps {
                echo 'Example01'
            }
        }
        
        stage('Example02') {
            when {
                environment name: 'Example02', value: 'true'
            }
            steps {
                echo 'Example02'
            }
        }
    }
}