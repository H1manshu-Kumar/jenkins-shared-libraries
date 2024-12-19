def call(String projectName, String imageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerHubUser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
}
