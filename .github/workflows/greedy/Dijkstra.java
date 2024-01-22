name: Dijkstra.java
  on:
  push:
bracnches: [main]
  jobs: build:
runs-on: ubuntu-latest
  steps:
- uses: actions/checkout@v3
- name: Set up JDK 11
  uses: actions/setup-java@v3
    with:
    java-version: '21'
    distribution: 'temurin'
  - name: Build with JAVA
  run: mvn -B package --filevpom.xml

  -name: Run tests
  run: mvn test
