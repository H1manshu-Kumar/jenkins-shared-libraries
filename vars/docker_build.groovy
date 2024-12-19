def call(String dockerHubUser, String projectName, String imageTag){
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
