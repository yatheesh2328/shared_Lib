def call(String name = 'value'){
    echo "Running Sonar Analysis & ${name}"
    sh '''
      withSonarQubeEnv('sonar') {
      mvn clean package sonar:sonar
    '''
}
}
