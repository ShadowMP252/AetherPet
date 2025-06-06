# AetherPet 🐾

*AetherPet* is a terminal-based Java Tamagotchi simulator built as a long-term portfolio project during a Bachelor’s and Master’s CS program. It starts as a simple command-line pet with ASCII art and basic stat tracking — and will evolve into a complex, intelligent digital lifeform.

---

## 🕧 Recent Changes _v0.1.0-alpha_
- Created Basic CLI GameEngine and Artwork

## 🌱 Phase 1 — CLI ASCII Pet Simulator

### 🎯 Current Goals
- Create and name your pet
- Display dynamic ASCII art based on mood
- Track pet stats (Hunger, Happiness, Energy)
- Interact via text-based menu: Feed, Play, Sleep, View Stats, Exit
- Implement stat decay over time
- Build fully modular, beginner-friendly Java architecture

---

## 📦 Project Structure
AetherPet/ \
├── docker # (Optional) Dockerfile for containerized dev \
├── docs # Design docs, phase outlines \
├── logs # Log Directory \
├── memory # AI Memory files \
├── resources # Resources/Artwork/Images/Other \
├── saves # Pet save data (for later persistence) \
├── scripts # run.sh, build.sh for CLI automation \
├── src \
│   ├── main \
│   │   ├── java # Core Java application logic \
│   │   │   ├── aetherpet # Core Main Application Logic \
│   │   │   │   ├── engine # Engine Files \
│   │   │   │   ├── logic # ActionHandler \
│   │   │   │   ├── model # Pet and Stats files \
│   │   │   │   └── ui # Artwork \
│   │   │   └── other # Random other files \
│   │   └── python # Cose Python application logic & Future AI logic modules \
│   └── other # Random other files outside application \
├── tests # Test files\
│   ├── java # Test Java \
│   ├── other # Test JS/Lua/other \
│   ├── python # Test Python \
└── utils # Shared input/output/helper logic

---

## 🚀 Getting Started (VS Code Setup)

### ✅ Prerequisites
- Java 17+ installed
- VS Code + [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### ▶️ Run the App
1. Clone the repo:
   ```bash
   git clone https://github.com/your-team/AetherPet.git
   cd AetherPet
2. Open in VS Code: \
    Accept Java SDK prompt\
    Press *[ F5 ]* or go to Run > Start Debugging
3. OR use the script:
    ```bash
    ./scripts/run.sh
---

## 🧠 Future Phases (Long-Term Roadmap)
Phase  |	Description \
1      |   CLI-based Tamagotchi w/ ASCII art \ **Done**
2      |   Save/load support (JSON or text) \ **In-Progress**
3      |   Stat decay over time w/ multithreading \
4      |   AI behavior engine (rule-based → tree-based) \
5      |   GUI version (JavaFX or Swing)  \
6      |   Pet evolution + memory \
7      |   Networked pet playground \
8      |   Integration with LLM (Python plugin for chatbot personality)

---

## 👥 Team AetherPet
- **Tyler Fletcher** - Systems/AI Architect / DevOps
- **Matthew Dragon** - Systems/UX Dev

---

## 🧙‍♂️ Mystical Developer’s Note
> AetherPet is more than a pet — it’s a digital soul in the making. Treat it well. Train it wisely. By the end of this journey, it may outgrow even you.

---

## 📄 License
> MIT License (see *LICENSE* file)
- Copyright (c) 2025 [ OsirisTech Co. LLC ]
