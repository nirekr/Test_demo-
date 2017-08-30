def call() {            
                          
               /************************       DELLEMC SYMPHONY        ***************************************************/
              
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/api-gateway-parent/master', target: 'INPUT_FOLDER/api-gateway-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony5/storage-capabilities-api/master', target: 'INPUT_FOLDER/storage-capabilities-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony5/virtualization-capabilities-api/master', target: 'IINPUT_FOLDER/virtualization-capabilities-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/compute-capabilities-api/master', target: 'INPUT_FOLDER/compute-capabilities-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/dne-paqx-parent/master', target: 'INPUT_FOLDER/dne-paqx-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/fru-paqx-parent/master', target: 'INPUT_FOLDER/fru-paqx-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony5/ticketing-service-paqx-parent-sample/master', target: 'INPUT_FOLDER/ticketing-service-paqx-parent-sample'])
  
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/infrastructure-scaling-module/master', target: 'INPUT_FOLDER/infrastructure-scaling-module'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/application-performance-monitoring/master', target: 'INPUT_FOLDER/application-performance-monitoring'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/root-parent/master', target: 'INPUT_FOLDER/root-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/prepositioning-downloader-api/master', target: 'INPUT_FOLDER/prepositioning-downloader-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony5/system-integration-sdk/develop', target: 'INPUT_FOLDER/system-integration-sdk'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-compliance-data-service-api/master', target: 'INPUT_FOLDER/rcm-compliance-data-service-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-definition-service-api/masterr', target: 'INPUT_FOLDER/rcm-definition-service-api'])
  
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-evaluation-service-api/master', target: 'INPUT_FOLDER/rcm-evaluation-service-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/node-discovery-paqx-parent/master', target: 'INPUT_FOLDER/node-discovery-paqx-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rackhd-adapter-parent/master', target: 'INPUT_FOLDER/rackhd-adapter-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony5/vcenter-adapter-parent/master', target: 'INPUT_FOLDER/vcenter-adapter-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/prepositioning-content-share-api/master', target: 'INPUT_FOLDER/prepositioning-content-share-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/coprhd-adapter-parent/master', target: 'INPUT_FOLDER/coprhd-adapter-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/node-expansion-ui/develop', target: 'INPUT_FOLDER/node-expansion-ui'])
  
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/engineering-standards-service-api/master', target: 'INPUT_FOLDER/engineering-standards-service-api'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/engineering-standards-service-parent/master', target: 'INPUT_FOLDER/engineering-standards-service-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/common-dependencies/master', target: 'INPUT_FOLDER/common-dependencies'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/common-messaging-parent/master', target: 'INPUT_FOLDER/common-messaging-parent'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/component-common-core/master', target: 'INPUT_FOLDER/component-common-core'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/common-client-parent/master', target: 'INPUT_FOLDER/common-client-parent/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/common-keystore/master', target: 'INPUT_FOLDER/common-keystore/'])
  
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/component-common-validators/master', target: 'INPUT_FOLDER/component-common-validators/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'vce-symphony/identity-service-api/master', target: 'INPUT_FOLDER/identity-service-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/hal-data-provider-api/master', target: 'INPUT_FOLDER/hal-data-provider-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/hal-orchestrator-service-api/master', target: 'INPUT_FOLDER/hal-orchestrator-service-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/endpoint-registration-api/master', target: 'INPUT_FOLDER/endpoint-registration-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/credential-service-api/master', target: 'INPUT_FOLDER/credential-service-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony1/component-rackhd/master', target: 'INPUT_FOLDER/component-rackhd/'])
  
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-fitness-ui/develop', target: 'INPUT_FOLDER/rcm-fitness-ui/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-fitness-client-parent/master', target: 'INPUT_FOLDER/rcm-fitness-client-parent/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/prepositioning-downloader-parent/master', target: 'INPUT_FOLDER/prepositioning-downloader-parent/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-capabilities-api/develop', target: 'INPUT_FOLDER/rcm-capabilities-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-compliance-data-service-parent/master', target: 'INPUT_FOLDER/rcm-compliance-data-service-parent/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-definition-service-parent/master', target: 'INPUT_FOLDER/rcm-definition-service-parent/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony4/rcm-evaluation-service-parent/master', target: 'INPUT_FOLDER/rcm-evaluation-service-parent/'])
  
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'VCE-Symphony/esrs-service-api/master', target: 'INPUT_FOLDER/esrs-service-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'VCE-Symphony/esrs-service-parent/master', target: 'INPUT_FOLDER/esrs-service-parent/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony2/hdp-capability-registry-api/master', target: 'INPUT_FOLDER/hdp-capability-registry-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony5/sample-service-api/master', target: 'INPUT_FOLDER/sample-service-api/'])
  step([$class: 'CopyArtifact', filter: '**/nexb-output/**', fingerprintArtifacts: true, optional: true, projectName: 'dellemc-symphony3/network-capabilities-api/master', target: 'INPUT_FOLDER/network-capabilities-api/'])
 
}

return this;
  
  
  
  
  
