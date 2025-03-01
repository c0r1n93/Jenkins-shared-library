def call (String localhostUrl, String httpMod, String validResponseCode){

    httpRequest(
    url: 'http://172.17.0.2:80',
    httpMode: 'GET',
    validResponseCodes: '200'
    )
}
