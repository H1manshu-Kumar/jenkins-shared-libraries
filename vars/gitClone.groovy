// This is a Groovy function defined in a Jenkins shared library. It performs a Git checkout from a specified URL and branch.

def call(String gitUrl, String gitBranch) {      
    // 'gitUrl' is the URL of the Git repository
    // 'gitBranch' is the specific branch to checkout
    git url: "${gitUrl}", branch: "${gitBranch}"
}
