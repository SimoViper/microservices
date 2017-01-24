
 - First compile using: mvn package
   Then generate the docker stuff using: mvn docker:build

 - Generally Docker plugin will create the image itself, to do that manually go to the folder target/docker and digit: docker build .  (please mind the dot!)
 - To run the microservice digit:  docker run -p 8095:8095 -t movies

 - If you want to run the image in a specific network:
    -- To create the network: docker network create -d bridge --subnet <an ip at your choice es. 172.25.0.0/16>  <network name>
    -- To run the image in a specific network: docker run --name movies  --network <network name> -p :8095 -t movies
 

 - To access the microservice  via browser digit in the address bar: http://localhost:8095/movies/movie-details/<movie title> 
   to access it in a specified net use the ip assigned to the docker container by the network you created, 
   to get it: docker network inspect <network name>
  
  
 - To enter the running container: docker exec -i -t  <container id> /bin/bash

 - To connect a container to a specific network: docker network connect <network name>  <container name>

