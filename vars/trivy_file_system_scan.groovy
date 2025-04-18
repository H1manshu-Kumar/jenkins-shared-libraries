// This is a Groovy function defined in a Jenkins shared library.
// It performs a file system vulnerability scan using Trivy and outputs the results to a JSON file.
// 'trivy fs .' scans the current directory, and '-o' specifies the output file.

def call() {
  sh "trivy fs . -o file_system_scan_results.json"
}
