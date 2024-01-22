def call(String name = 'value'){
    echo "Running Sonar Analysis & ${name}"
   sh '''
    mvn clean package sonar:sonar
    '''
}
