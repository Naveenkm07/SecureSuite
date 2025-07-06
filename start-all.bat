@echo off
echo ===================================
echo Dream App - Full Stack Development
echo ===================================

echo Checking for existing processes...
netstat -ano | findstr :3000 > nul
if %errorlevel% equ 0 (
    echo Port 3000 is in use. Attempting to free it...
    for /f "tokens=5" %%a in ('netstat -ano ^| findstr :3000') do (
        taskkill /F /PID %%a 2>nul
    )
)

netstat -ano | findstr :8080 > nul
if %errorlevel% equ 0 (
    echo Port 8080 is in use. Attempting to free it...
    for /f "tokens=5" %%a in ('netstat -ano ^| findstr :8080') do (
        taskkill /F /PID %%a 2>nul
    )
)

echo Starting Backend Server...
start "Backend Server" cmd /k "cd backend && mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081"

echo Waiting for backend to start...
timeout /t 15 /nobreak

echo Starting Frontend Server...
start "Frontend Server" cmd /k "cd frontend && set PORT=3000 && set BROWSER=none && npm start"

echo Opening application in browser...
timeout /t 5 /nobreak
start "" http://localhost:3000

echo Both servers are starting...
echo Backend: http://localhost:8081
echo Frontend: http://localhost:3000
echo.
echo Press Ctrl+C in either window to stop the servers
echo =================================== 