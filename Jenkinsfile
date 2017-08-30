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
sh " cp '/${WORKSPACE}/INPUT_FOLDER/storage-capabilities-api/nexb-output/storage-capabilities-api.html'  '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
//sh "yes | cp '/${WORKSPACE}/INPUT_FOLDER/virtualization-capabilities-api/nexb-output/virtualization-capabilities-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh "cp '/${WORKSPACE}/INPUT_FOLDER/compute-capabilities-api/nexb-output/compute-capabilities-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "              
sh " cp '/${WORKSPACE}/INPUT_FOLDER/dne-paqx-parent/nexb-output/dne-paqx-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh " cp '/${WORKSPACE}/INPUT_FOLDER/fru-paqx-parent/nexb-output/fru-paqx-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh "cp '/${WORKSPACE}/INPUT_FOLDER/ticketing-service-paqx-parent-sample/nexb-output/ticketing-service-paqx-parent-sample.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh " cp '/${WORKSPACE}/INPUT_FOLDER/infrastructure-scaling-module/nexb-output/scaling-module-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
//sh "cp '/${WORKSPACE}/INPUT_FOLDER/application-performance-monitoring/nexb-output/apm-nagios-parent.html ' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/root-parent/nexb-output/root-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/prepositioning-downloader-api/nexb-output/prepositioning-downloader-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/system-integration-sdk/nexb-output/system-integration-sdk.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-compliance-data-service-api/nexb-output/rcm-compliance-data-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-definition-service-api/nexb-output/rcm-definition-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-evaluation-service-api/nexb-output/rcm-evaluation-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/node-discovery-paqx-parent/nexb-output/node-discovery-paqx-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/prepositioning-content-share-api/nexb-output/prepositioning-content-share-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/coprhd-adapter-parent/nexb-output/coprhd-adapter-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/common-dependencies/nexb-output/common-dependencies.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/common-messaging-parent/nexb-output/common-messaging-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/component-common-validators/nexb-output/component-common-validators.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/component-common-core/nexb-output/component-common-core.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/node-expansion-ui/nexb-output/node-expansion-ui.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/engineering-standards-service-api/nexb-output/engineering-standards-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/engineering-standards-service-parent/nexb-output/engineering-standards-service-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/identity-service-api/nexb-output/identity-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/common-keystore/nexb-output/common-keystore.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/common-client-parent/nexb-output/common-client-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
// Newest additions added on the 8th August 2017 ###
sh"cp '/${WORKSPACE}/INPUT_FOLDER/endpoint-registration-api/nexb-output/endpoint-registration-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/hal-data-provider-api/nexb-output/hal-data-provider-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/hal-orchestrator-service-api/nexb-output/hal-orchestrator-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
// Newest additions added on the 15th August 2017 ###
sh"cp '/${WORKSPACE}/INPUT_FOLDER/credential-service-api/nexb-output/credential-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/component-rackhd/nexb-output/component-rackhd.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
// Newest additions added on the 21st August 2017 ###
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-fitness-ui/nexb-output/rcm-fitness-ui.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-fitness-client-parent/nexb-output/rcm-fitness-client-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/prepositioning-downloader-parent/nexb-output/prepositioning-downloader-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-capabilities-api/nexb-output/rcm-capabilities-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-compliance-data-service-parent/nexb-output/rcm-compliance-data-service-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-definition-service-parent/nexb-output/rcm-definition-service-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/rcm-evaluation-service-parent/nexb-output/rcm-evaluation-service-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/esrs-service-api/nexb-output/esrs-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/esrs-service-parent/nexb-output/esrs-service-parent.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
sh"cp '/${WORKSPACE}/INPUT_FOLDER/hdp-capability-registry-api/nexb-output/hdp-capability-registry-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
// Newest additions added on the 24th August 2017 ###
sh"cp '/${WORKSPACE}/INPUT_FOLDER/sample-service-api/nexb-output/sample-service-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "
// Newest additions added on the 28th August 2017 ###
sh"cp '/${WORKSPACE}/INPUT_FOLDER/network-capabilities-api/nexb-output/network-capabilities-api.html' '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/' "

            }
       
      }
    
     stage('Archive Artifacts') {
            steps {
               archive '**/INPUT_FOLDER/**'
            }
       publishHTML (target: [
       allowMissing: false,
       alwaysLinkToLastBuild: false,
       keepAll: true,
       reportDir: '/${WORKSPACE}/INPUT_FOLDER/zFinal_Report/',
       reportFiles: 'component-common-core.html,storage-capabilities-api.html,component-common-validators.html,common-messaging-parent.html,common-dependencies,virtualization-capabilities-api.html,compute-capabilities-api.html,dne-paqx-parent.html,fru-paqx-parent.html,ticketing-service-paqx-parent-sample.html,scaling-module-parent.html,apm-nagios-parent.html,root-parent.html,prepositioning-downloader-api.html,system-integration-sdk.html,workflow-cli.html,rcm-compliance-data-service-api.html,rcm-definition-service-api.html,rcm-evaluation-service-api.html,node-discovery-paqx-parent.html,prepositioning-content-share-api.html,coprhd-adapter-parent.html,monitoring-scaling-ticketing-sample.html,rcm-fitness-common-keystore.html,common-client-parent.html,hal-orchestration-service-api.html,hal-data-provider-api.html,endpoint-registration-api.html,credential-service-api.html,component-rackhd.html,rcm-fitness-ui.html,rcm-fitness-client-parent.html,prepositioning-downloader-parent.html,rcm-capabilities-api.html,rcm-compliance-data-service-parent.html,rcm-definition-service-parent.html,rcm-evaluation-service-parent.html,esrs-service-api.html,esrs-service-parent.html,hdp-capability-registry-api.html,sample-service-api,network-capabilities-api.html',
       reportName: "NexB Scans Report (Master)"
     ])
            } 
    
  post {
      success {
            cleanWorkspace() 
        }          
}
      }

    }
}
