def call(){
    echo "Running Sonar Analysis & ${name}"
   sh '''
    mvn clean package sonar:sonar
    '''
}
