def call() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://54.79.181.244 -Dsonar.java.binaries=target/classes'
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://http://13.232.78.101:9000 -Dsonar=sonar.exclusions*/**.java'
   }
return this
