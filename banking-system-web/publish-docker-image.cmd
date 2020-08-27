gradle build

docker build -t valgavchanin/banking-system-web -f "src\main\docker\Dockerfile" .

docker push valgavchanin/banking-system-web