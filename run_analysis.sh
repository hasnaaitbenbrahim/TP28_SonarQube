#!/bin/bash
if [ -z "$1" ]; then
  echo "Usage: $0 <SONAR_TOKEN>"
  exit 1
fi

mvn clean verify sonar:sonar \
  -Dsonar.projectKey=Student_class \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=$1
