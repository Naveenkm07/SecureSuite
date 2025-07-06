const API_BASE_URL = 'http://localhost:8081/api';

export const API_ENDPOINTS = {
  auth: {
    login: `${API_BASE_URL}/auth/login`,
    register: `${API_BASE_URL}/auth/register`,
    verify: `${API_BASE_URL}/auth/verify`,
    logout: `${API_BASE_URL}/auth/logout`,
  },
  // Add other endpoints as needed
}; 