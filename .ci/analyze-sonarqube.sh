#!/bin/bash


echo "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.0.1:sonar"
echo "  -Dmaven.test.skip=true"
echo "  -Dclirr=true"
echo "  -Dsonar.host.url=${SONARQUBE_URL}"
echo "  -Dsonar.login=****"
echo "  -Dsonar.password=****"
echo "  -Dsonar.sourceEncoding=UTF-8"
echo "  -Dsonar.analysis.mode=issues"
echo "  -Dsonar.github.oauth=****"
echo "  -Dsonar.github.repository=${GITHUB_REPOS}"
echo "  -B -e -V"

mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.0.1:sonar \
  -Dmaven.test.skip=true			\
  -Dclirr=true				\
  -Dsonar.host.url="${SONARQUBE_URL}"		\
  -Dsonar.login="${SONARQUBE_LOGIN}"		\
  -Dsonar.password="${SONARQUBE_PASSWORD}"	\
  -Dsonar.sourceEncoding=UTF-8		\
  -Dsonar.analysis.mode=issues		\
  -Dsonar.github.oauth="${GITHUB_OAUTH}"	\
  -Dsonar.github.repository="${GITHUB_REPOS}"	\
  -B -e -V
