### STAGE 1: Build ###

FROM node:18.14.0 AS build
WORKDIR /app
COPY .. .

RUN npm install @angular/cli@latest -g

RUN npm run build --omit=dev

### STAGE 2: Run ###
EXPOSE 4200
#Allow ng serve to accept requests with host headers that are different to the --host setting. This is needed when accessing the server via a reverse proxy.
CMD ng serve --host 0.0.0.0 --port 4200 --disable-host-check
