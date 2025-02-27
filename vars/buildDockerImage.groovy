def call (String CONTAINER_IMAGE, String IMAGE_TAG){


  sh "docker build -t ${CONTAINER_IMAGE}:${IMAGE_TAG} ."


}
