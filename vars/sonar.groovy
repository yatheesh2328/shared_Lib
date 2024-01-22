def call(String name = 'value'){
    echo "Running Sonar Analysis & ${name}"
   withSonarQubeEnv('sonar') {
    sh '''
    mvn clean package sonar:sonar
    '''
}
}
