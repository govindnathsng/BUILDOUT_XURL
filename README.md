# XURL

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Crio](https://img.shields.io/badge/Crio-Learn%20by%20Doing-FFDD00?style=for-the-badge&logo=crio)

> **Date:** May 2023

## 📘 Overview
**XURL** is a URL shortening utility designed to generate and retrieve short URLs for lengthy URLs, making them easier to use and share. This project focuses on implementing URL shortening and mapping functionality from scratch, leveraging core Java concepts.

During this project, we:
- Built a short URL library with essential methods.
- Created a registration method for converting long URLs to short URLs.
- Implemented a lookup method to retrieve original URLs from their shortened versions.
- Added a hit counter to track the usage of each URL lookup.
- Validated the implementation with comprehensive test cases.

## 🛠️ Project Structure

### **XURL Interface**

### Scope of Work
- Developed a **concrete class** implementing a short URL interface with methods to create and manage URL mappings.
- Created a method to accept a long URL as input, generate a **random 9-character short URL**, and return it.
- Stored mappings in a **HashMap** for efficient lookup.
- Enabled custom short URLs by accepting a long URL and custom short URL as input.
- Implemented **error handling** to ensure each long URL maps to only one short URL (and vice versa).
- Added functionality to:
  - **Lookup** the long URL for a given short URL.
  - **Delete** a URL mapping based on the long URL.
  - **Track hit count** for each URL to monitor lookup frequency.
- Verified the functionality with **unit test cases**.

## 🚀 Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/govindnathsng/XURL.git
   cd XURL

    Build the Project

    bash

./gradlew build

Run the Tests

bash

    ./gradlew test

⚙️ Technologies & Tools

    Programming Language: Java
    Key Concepts: Interfaces, HashMap, Error Handling
    IDE: VSCode
    Build Tool: Gradle

📈 Features

    URL Shortening: Generate short, unique URLs for long URLs.
    Custom Short URLs: Register custom short URLs for specific long URLs.
    URL Lookup: Retrieve the original URL using the short URL.
    Hit Counter: Track the number of times each URL is accessed.
    Error Handling: Ensure one-to-one mapping between long and short URLs.

🤝 Contributing

We welcome contributions! Please fork the repository and create a pull request to add new features or improve the existing code.
📄 License

This project is licensed under the Apache License 2.0.
📞 Contact

For questions or feedback, feel free to reach out:

    GitHub: govindnathsng
    Email: govindnathsng[at]gmail[dot]com

Check out my <a href="https://www.crio.do/learn/portfolio/govindnathsng/" target="_blank">Crio Portfolio</a> for more projects like this!

yaml


---

This README provides a professional structure, covering all aspects of the XURL project with tags for a clear, organized appearance. Let me know if you need any more details or changes!

