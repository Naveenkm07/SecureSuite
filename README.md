# 🔐 SecureSuite - Personal Digital Security Dashboard

> **A comprehensive full-stack application for managing personal digital security and data protection**

[![React](https://img.shields.io/badge/React-18.2.0-blue.svg)](https://reactjs.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-green.svg)](https://spring.io/projects/spring-boot)
[![TypeScript](https://img.shields.io/badge/TypeScript-4.9.5-blue.svg)](https://www.typescriptlang.org/)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## 🎯 Overview

SecureSuite is a modern, full-stack personal digital security dashboard that provides comprehensive tools for managing passwords, contacts, secure notes, and data analytics. Built with React frontend and Spring Boot backend, it offers a secure, user-friendly interface for personal data management.

### Key Highlights
- 🔒 **End-to-end encryption** for sensitive data
- 📱 **Responsive design** for all devices
- 🔄 **Real-time synchronization** across devices
- 📊 **Analytics dashboard** for data insights
- 🚀 **Offline capability** for data access
- 🛡️ **JWT-based authentication** for security

## ✨ Features

### 🔐 Security Features
- **Password Management**: Secure storage and generation of strong passwords
- **Two-Factor Authentication**: Enhanced security with 2FA support
- **Encryption**: AES-256 encryption for all sensitive data
- **Security Log**: Comprehensive audit trail of all activities
- **Secure Notes**: Encrypted storage for private information

### 📊 Data Management
- **Contact Management**: Secure contact information storage
- **Data Analytics**: Insights into your security practices
- **Backup & Restore**: Automated data backup and recovery
- **Sync Status**: Real-time synchronization monitoring
- **Offline Data**: Access your data without internet connection

### 🎨 User Experience
- **Modern UI**: Clean, intuitive Material-UI design
- **Responsive Design**: Works seamlessly on desktop, tablet, and mobile
- **Dark/Light Theme**: Customizable appearance
- **Real-time Updates**: Live data synchronization
- **Error Handling**: Comprehensive error management

## 🛠️ Tech Stack

### Frontend
- **React 18.2.0** - Modern UI framework
- **TypeScript 4.9.5** - Type-safe JavaScript
- **Material-UI 5.17.1** - Component library
- **React Router 6.30.0** - Client-side routing
- **Formik 2.4.6** - Form management
- **Recharts 2.15.3** - Data visualization
- **Crypto-JS 4.2.0** - Client-side encryption

### Backend
- **Spring Boot 3.2.3** - Java framework
- **Spring Security** - Authentication & authorization
- **Spring Data JPA** - Database operations
- **H2 Database** - In-memory database
- **JWT** - Token-based authentication
- **Lombok** - Boilerplate code reduction

### Development Tools
- **Maven** - Build tool
- **npm** - Package manager
- **Git** - Version control
- **TypeScript** - Type checking

## 📸 Screenshots

### Dashboard Overview
![Dashboard](https://via.placeholder.com/800x400/4CAF50/FFFFFF?text=SecureSuite+Dashboard)

### Password Management
![Passwords](https://via.placeholder.com/800x400/2196F3/FFFFFF?text=Password+Management)

### Security Analytics
![Analytics](https://via.placeholder.com/800x400/FF9800/FFFFFF?text=Security+Analytics)

## 🚀 Installation

### Prerequisites
- **Node.js** (v16 or higher)
- **Java** (v17 or higher)
- **Maven** (v3.6 or higher)
- **Git**

### Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/Naveenkm07/SecureSuite.git
   cd SecureSuite
   ```

2. **Install dependencies**
   ```bash
   # Install frontend dependencies
   cd frontend
   npm install
   
   # Install backend dependencies (Maven will handle this)
   cd ../backend
   mvn clean install
   ```

3. **Run the application**
   ```bash
   # Option 1: Use the provided batch script (Windows)
   .\start-all.bat
   
   # Option 2: Run manually
   # Terminal 1 - Backend
   cd backend
   mvn spring-boot:run
   
   # Terminal 2 - Frontend
   cd frontend
   npm start
   ```

4. **Access the application**
   - Frontend: http://localhost:3000
   - Backend API: http://localhost:8081

## 📖 Usage

### Getting Started
1. **Register** a new account or **Login** with existing credentials
2. **Set up 2FA** for enhanced security (recommended)
3. **Add your first password** or contact
4. **Explore the dashboard** and analytics features

### Key Features Usage
- **Passwords**: Add, edit, and generate secure passwords
- **Contacts**: Store and manage contact information securely
- **Secure Notes**: Create encrypted notes for sensitive information
- **Analytics**: Monitor your security practices and data usage
- **Backup**: Schedule automatic backups of your data

## 🔌 API Documentation

### Authentication Endpoints
```
POST /api/auth/register - User registration
POST /api/auth/login    - User login
POST /api/auth/logout   - User logout
```

### Password Management
```
GET    /api/passwords     - Get all passwords
POST   /api/passwords     - Create new password
PUT    /api/passwords/:id - Update password
DELETE /api/passwords/:id - Delete password
```

### Contact Management
```
GET    /api/contacts     - Get all contacts
POST   /api/contacts     - Create new contact
PUT    /api/contacts/:id - Update contact
DELETE /api/contacts/:id - Delete contact
```

## 📁 Project Structure

```
SecureSuite/
├── frontend/                 # React frontend application
│   ├── public/              # Static files
│   │   ├── components/      # React components
│   │   ├── services/        # API services
│   │   ├── contexts/        # React contexts
│   │   └── types/           # TypeScript types
│   └── package.json
├── backend/                  # Spring Boot backend application
│   ├── src/main/java/
│   │   ├── controller/      # REST controllers
│   │   ├── service/         # Business logic
│   │   ├── repository/      # Data access layer
│   │   ├── model/           # Entity models
│   │   └── security/        # Security configuration
│   └── pom.xml
├── docs/                     # Documentation
├── start-all.bat            # Windows startup script
└── README.md
```

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Development Guidelines
- Follow the existing code style
- Add tests for new features
- Update documentation as needed
- Ensure all tests pass before submitting

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Naveen Kumar KM**
- **Institution**: New Horizon College of Engineering, Bengaluru
- **USN**: 1NH24CS409
- **GitHub**: [@Naveenkm07](https://github.com/Naveenkm07)
- **Email**: [Your Email]

---

## 🙏 Acknowledgments

- **New Horizon College of Engineering** for academic support
- **Spring Boot** and **React** communities for excellent documentation
- **Material-UI** for the beautiful component library
- **Open Source Community** for inspiration and tools

---

<div align="center">

**⭐ Star this repository if you find it helpful!**

[![GitHub stars](https://img.shields.io/github/stars/Naveenkm07/SecureSuite?style=social)](https://github.com/Naveenkm07/SecureSuite/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Naveenkm07/SecureSuite?style=social)](https://github.com/Naveenkm07/SecureSuite/network)
[![GitHub issues](https://img.shields.io/github/issues/Naveenkm07/SecureSuite)](https://github.com/Naveenkm07/SecureSuite/issues)

</div>
