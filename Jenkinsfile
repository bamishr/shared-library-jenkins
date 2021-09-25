pipeline {
agent  any 
stages {

stage('PollSCM') {
    steps {

checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bamishr/shared-library-jenkins.git']]])
script {
        tags = sh(script: "git tag --sort=v:refname | tail -5 ", returnStdout: true).trim()
        echo $tags
}
}
}

stage('CHOICE TAG') {
    steps {
    script {
def tag_response = input message: 'blah blah tags',
parameters: [choice(choices: "${tags}",  description: 'blah', name: '')]
env.tag_response = tag_response
}

}
}

stage ('echo choose') {
    steps {
        echo "I choose: '${tag_response}'"
    }
}

}
}
