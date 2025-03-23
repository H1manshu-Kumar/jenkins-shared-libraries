/**
 * Stops and restarts Docker containers using Docker Compose.
 *
 * This function performs the following steps:
 * 1. Runs 'docker-compose down' to stop and remove running containers, networks, and volumes defined in the docker-compose.yml.
 * 2. Runs 'docker-compose up -d' to start the containers again in detached mode.
 *
 * Useful for redeploying services or applying configuration changes.
 */
def call() {
    sh "docker-compose down"
    sh "docker-compose up -d"
}
