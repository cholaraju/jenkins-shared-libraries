def call(String:url,String:branch) {
  
   echo "This is cloning the code"
   git branch: "${branch}" url: "${url}"
   echo "Code Cloning Successful"
  
}
