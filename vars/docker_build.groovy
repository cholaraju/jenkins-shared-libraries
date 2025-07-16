def call(String ProjectName, String ImageTag, String DocerHubUser) {
 sh "docker build -t  ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
