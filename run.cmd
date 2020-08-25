set DOCKER_IP="0.0.0.0"

docker-compose stop
docker-compose rm -f

docker-compose up -d postgres
docker-compose up -d rabbitmq

REM docker-compose up -d configuration-service