FROM node:12-slim

WORKDIR /usr/src/app

RUN npm install -g gatsby-cli

EXPOSE 8080

# RUN apt-get update
# RUN apt-get update
# RUN apt-get update
# RUN apt-get update

# RUN apt-get install curl
# RUN apt-get install curl

COPY . .

RUN npm install

RUN gatsby build

CMD ["gatsby", "serve", "-p","8080","-H","0.0.0.0"]

#ENTRYPOINT [ "/bin/sh","-c", "sleep 5000"]