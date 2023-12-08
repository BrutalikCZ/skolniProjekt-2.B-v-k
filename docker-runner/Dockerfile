# Use a base image with Java pre-installed
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Install Git in the container
RUN apt-get update && apt-get install -y git

# Define the entry point script
COPY entrypoint.sh /app/entrypoint.sh
RUN chmod +x /app/entrypoint.sh

# Set the entry point to run the application
ENTRYPOINT ["/app/entrypoint.sh"]
