def call(String projectName, String imageTag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
