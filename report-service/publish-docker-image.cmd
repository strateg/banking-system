gradle build

docker build -t valgavchanin/account-service -f "..\src\main\docker\Dockerfile" .

docker push valgavchanin/account-service