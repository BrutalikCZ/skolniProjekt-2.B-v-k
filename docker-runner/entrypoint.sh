#!/bin/sh

# Ensure the directory is empty before cloning
if [ ! -z "$(ls -A /app)" ]; then
  echo "The directory is not empty. Cleaning up..."
  rm -rf /app/*
fi

# Clone the Java application from the Git repository
git clone "https://github.com/BrutalikCZ/skolniProjekt-2.B-v-k.git" .

# Build the Java application (if necessary)
javac Main.java

# Run the Java application in the foreground
java Main
