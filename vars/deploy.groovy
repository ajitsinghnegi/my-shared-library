def call(){
  echo "deploying the image"
  sh "docker compose down && docker compose up -d"
  echo "deployed successfully"
}
