set DOCKER_IP="0.0.0.0"

docker-compose stop
docker-compose rm -f

docker-compose up -d postgres
docker-compose up -d rabbitmq

docker-compose up -d discovery-service

docker-compose up -d configuration-service