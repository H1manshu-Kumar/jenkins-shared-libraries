/**
 * Builds a Docker image and tags it with the specified image tag.
 *
 * @param projectName   The name of the project, used as the Docker image name.
 * @param imageTag      The tag to assign to the built Docker image (e.g., 'latest', 'v1.0').
 * @param dockerHubUser The Docker Hub username or organization under which the image will be tagged.
 *
 * Example:
 *   call('my-app', 'v1.0', 'mydockerhubuser')
 *   This will run:
 *   docker build -t mydockerhubuser/my-app:v1.0 .
 */
def call(String projectName, String imageTag, String dockerHubUser) {
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
