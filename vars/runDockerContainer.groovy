def call (){

    sh "docker run -d --name alpine -e PORT=80 -p 80:80 alpine_image:1.2"
    sh 'sleep 5'
}
