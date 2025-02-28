def call (String containerName, String port, String hostPort, String containerPort, String imageName, String imageTag){

    sh "docker run -d --name ${containerName} -e PORT=${port} -p ${hostPort}:${containerPort} ${imageName}:${imageTag}"
    sh 'sleep 5'
}
