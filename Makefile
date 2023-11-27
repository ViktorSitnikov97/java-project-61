clean:
    ./app/gradlew clean

build:
    ./app/gradlew clean build

run:
    ./app/gradlew run

lint:
    ./app/gradlew checkstyleMain

install: clean
    ./app/gradlew install

run-dist:
    ./app/build/install/app/bin/app

check-updates:
    ./app/gradlew dependencyUpdates

.PHONY: build
