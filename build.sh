#!/bin/sh

sudo docker build . -t web
sudo docker run -it -d -p 3001:80 web
