@Library('TestLib') _

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
                // @Library('TestLib') import lib.bar
                // def util = new Util(this)
                // util.Example01()
                foo.Example01_vars()
            }
        }
        
        stage('Example02') {
            when {
                environment name: 'Example02', value: 'true'
            }
            steps {
                // @Library('TestLib') import lib.bar
                // def util = new Util(this);
                // util.Example02()
                foo.Example02_vars()
            }
        }
    }
}