pipeline {
    agent {
        node{
            label 'maven-builder'
            customWorkspace "workspace/${env.JOB_NAME}"
            }
    }
   environment {
    GITHUB_TOKEN = credentials('github-02')
   }
    options {
       buildDiscarder(logRotator(artifactDaysToKeepStr: '30', artifactNumToKeepStr: '5', daysToKeepStr: '30', numToKeepStr: '5'))
        timestamps()
        disableConcurrentBuilds()    
    }
    tools {
        maven 'linux-maven-3.3.9'
        jdk 'linux-jdk1.8.0_102'
    }
    stages {
        stage("CopyArtifacts") {
           steps {
             script {
                      def externalCopyArtifacts = load("copyArtifacts.groovy")    
                      externalCopyArtifacts()
                }
             }
       }
      stage("Build") {
            steps {
                 sh "mkdir -p '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
                sh "yes | cp '/${WORKSPACE}/INPUT_FOLDER/storage-capabilities-api/nexb-output/storage-capabilities-api.html'  '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
                sh"yes | cp '/${WORKSPACE}/INPUT_FOLDER/virtualization-capabilities-api/nexb-output/virtualization-capabilities-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "

       
       publishHTML (target: [
       allowMissing: false,
       alwaysLinkToLastBuild: true,
       keepAll: true,
       reportDir: 'INPUT_FOLDER',
       reportFiles: 'component-common-core.html,storage-capabilities-api.html,component-common-validators.html,common-messaging-parent.html,common-dependencies,virtualization-capabilities-api.html,compute-capabilities-api.html,dne-paqx-parent.html,fru-paqx-parent.html,ticketing-service-paqx-parent-sample.html,scaling-module-parent.html,apm-nagios-parent.html,root-parent.html,prepositioning-downloader-api.html,system-integration-sdk.html,workflow-cli.html,rcm-compliance-data-service-api.html,rcm-definition-service-api.html,rcm-evaluation-service-api.html,node-discovery-paqx-parent.html,prepositioning-content-share-api.html,coprhd-adapter-parent.html,monitoring-scaling-ticketing-sample.html,rcm-fitness-common-keystore.html,common-client-parent.html,hal-orchestration-service-api.html,hal-data-provider-api.html,endpoint-registration-api.html,credential-service-api.html,component-rackhd.html,rcm-fitness-ui.html,rcm-fitness-client-parent.html,prepositioning-downloader-parent.html,rcm-capabilities-api.html,rcm-compliance-data-service-parent.html,rcm-definition-service-parent.html,rcm-evaluation-service-parent.html,esrs-service-api.html,esrs-service-parent.html,hdp-capability-registry-api.html,sample-service-api,network-capabilities-api.html',
       reportName: "NexB Scans Report (Master)"
     ])
            }
      }
    
     stage('Archive Artifacts') {
            steps {
               archive '**/INPUT_FOLDER/**'
            }
        }  
    }
  post {
      success {
            cleanWorkspace() 
        }          
}


}
