def call(Map config) {
    // Set default values if not provided
    def sonarHostUrl = config.sonarHostUrl ?: 'http://localhost:9000'
    def projectKey = config.projectKey ?: 'my-project'
    def sourcesPath = config.sourcesPath ?: 'src'
    def sonarPropertiesPath = "${JENKINS_HOME}/workspace/${JOB_NAME}/sonarqube.properties"
    sh "mvn sonar:sonar -Dsonar.config.file=${sonarPropertiesPath}"
}  
