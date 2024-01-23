def call() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://54.79.181.244 -Dsonar.java.binaries=target/classes'
   }
return this
