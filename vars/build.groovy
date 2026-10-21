def call(String image, String tag ){
  echo "building the image"
  sh "docker build -t ${image}:${tag} ."
  echo "image build successful"
}
