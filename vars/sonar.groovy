def runSonarQubeAnalysis() {
    // Configure SonarQube properties
    def sonarQubeScannerHome = tool 'SonarQubeScanner'
    def projectKey = '24a4b741c1e41323d590cf08bad6bc3c0361da73'
    def projectName = 'bus-booking'
    def sonarQubeServerUrl = 'http://13.40.155.22:9000'

        -Dsonar.projectKey=${24a4b741c1e41323d590cf08bad6bc3c0361da73} \
        -Dsonar.projectName=${bus-bookin} \
        -Dsonar.host.url=${http://13.40.155.22:9000}", 
        returnStatus: true
                          }  
