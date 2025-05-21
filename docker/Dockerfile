
# ╔═════ INFO ══════╗
# ║ Dockerfile for AetherPet based on Ubuntu 22.04
# ║ Author: Tyler Fletcher
# ║ Company: OsirisTech Co. LLC
# ║ NOTE: Updated 05-20-2025 -- Added Java and Python support.
# ║ This container as designed as a base image for VS Code - Dev Containers or NeoVim to work alongside Git Repo.
# ╚═════════════════╝

# Base image: Reliable Ubuntu LTS
FROM ubuntu:22.04

# Set environment variables to prevent interactive prompts
ENV DEBIAN_FRONTEND=noninteractive

# Update and install dependencies
RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    python3 \
    python3-pip \
    python3-venv \
    git \
    curl \
    nano \
    bash \
    ca-certificates \
    && apt-get clean

#Symlink python → python3
RUN ln -s /usr/bin/python3 /usr/bin/python

# Clean Up Cache
RUN rm -rf /var/lib/apt/lists/*

# Set working directory 
# We are using /app so that when we git clone AetherPet -> the directory will read /app/AetherPet instead of /AetherPet/AetherPet
WORKDIR /app

# Default command (can be overridden)
CMD ["bash"]


# ╔═════ INFO ══════╗
# ║ YOU WILL NEED TO OPEN DOCKER CONTAINER THEN GIT REPO
# ║ ONCE YOU HAVE CLONED THE REPO -> chmod +x ./scripts/*.sh 
# ║ This will make scripts executables.
# ╚═════════════════╝