clean:
	./app/gradlew clean

build:
	./app/gradlew clean build

install:
	./app/gradlew clean install

run-dist:
	./app/build/install/app/bin/app

run:
	./app/gradlew run

lint:
	./app/gradlew checkstyleMain

check-updates:
	./app/gradlew dependencyUpdates


.PHONY: build
