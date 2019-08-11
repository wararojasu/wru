pipeline {
stages {
  stage("Build") {
    steps {
      echo "Executing Build"
    }
  }
  stage ("Parallel Builds") {
    parallel {
      stage("stream1") {
        stages {
          stage("JUnit") {
            steps {
              echo "Executing JUnit"
            }
          }
          stage("Firefox") {
            steps {
              echo "Executing Firefox"
            }
          }
        }
      }
      stage("stream2") {
        stages {
          stage("DBUnit") {
            steps {
              echo "Executing DBUnit"
            }
          }
          stage("Edge") {
            steps {
              echo "Executing Edge"
            }
          }
        }
      }
      stage("stream3") {
        stages {
          stage("Jasmine") {
            steps {
              echo "Executing Jasmine"
            }
          }
          stage("Safari") {
            steps {
              echo "Executing Safari"
            }
          }
        }
      }
    }
  }
  stage("Dev") {
    steps {
      echo "Executing Dev"
    }
  }
}
}
