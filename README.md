# Jenkins Shared Libraries

## Introduction

This repository provides a collection of Jenkins Shared Libraries, enabling users to define reusable Groovy scripts and functions that can be shared across multiple Jenkins pipelines.  
By centralizing common pipeline code, these shared libraries promote the DRY (Don't Repeat Yourself) principle, enhancing maintainability and reducing redundancy in CI/CD processes.

## Features

- **Reusable Pipeline Code**: Encapsulate common pipeline logic into functions accessible across various Jenkins jobs.
- **Version Control Integration**: Manage and version your shared libraries using Git, ensuring consistent and trackable changes.
- **Modular Design**: Organize code into distinct modules, promoting clarity and ease of maintenance.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/H1manshu-Kumar/jenkins-shared-libraries.git
   ```

2. **Configure Jenkins to Use the Shared Library**:
   - Navigate to **Manage Jenkins** > **Configure System**.
   - Scroll down to **Global Pipeline Libraries**.
   - Click **Add** and provide:
     - **Name**: `jenkins-shared-libraries`
     - **Default Version**: Specify the branch or tag (e.g., `main`).
     - **Retrieval Method**: Select **Modern SCM** and configure the Git repository URL.

3. **Define Library Usage in Pipelines**:
   In your `Jenkinsfile`, import the library:
   ```groovy
   @Library('jenkins-shared-libraries') _
   ```
   **Note:** Yes underscore _ is required, It's not typo :)

## Usage

After importing the library, you can utilize its functions in your pipeline scripts.  
For example:

```groovy
@Library('jenkins-shared-libraries') _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    // Call a function from the shared library
                    sharedLibraryFunction()
                }
            }
        }
    }
}
```

Replace `sharedLibraryFunction` with the actual function name defined in the library.

## Configuration

If the shared library requires configuration, such as setting environment variables or passing parameters, ensure these are defined in your pipeline or Jenkins environment.  
Refer to the library's documentation for specific configuration details.

## Contribution Guidelines

Contributions are welcome! To contribute:

1. **Fork the Repository**: Create a personal fork of the project.
2. **Create a Feature Branch**:  
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. **Commit Your Changes**:  
   ```bash
   git commit -m 'Add new feature'
   ```
4. **Push to Your Fork**:  
   ```bash
   git push origin feature/YourFeatureName
   ```
5. **Submit a Pull Request**: Describe your changes and submit a PR to the main repository.

## License

This project is licensed under the MIT License.  
See the [LICENSE](https://github.com/H1manshu-Kumar/jenkins-shared-libraries/blob/main/LICENSE) file for details.

## Contact Information

For questions or support, please open an issue in this repository.

---

By leveraging this Jenkins Shared Library, you can streamline your pipeline development, promote code reuse, and maintain cleaner Jenkins configurations.
