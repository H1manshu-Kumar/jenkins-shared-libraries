// Define a function named 'call' that takes three parameters: projectName, imageTag, and dockerHubUser
def call(String projectName, String imageTag, String dockerHubUser) {
    // Use Jenkins credentials to securely retrieve Docker Hub username and password
    withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
        // Execute shell command to log in to Docker Hub using the retrieved credentials
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }
    // Execute shell command to push the Docker image to Docker Hub
    sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
}
