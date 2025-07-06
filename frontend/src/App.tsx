import React, { lazy, Suspense } from 'react';
import { Routes, Route } from 'react-router-dom';
import { Box, Container } from '@mui/material';
import LoadingScreen from './components/LoadingScreen';

// Lazy load components
const Dashboard = lazy(() => import('./components/Dashboard'));
const Passwords = lazy(() => import('./components/Passwords'));
const Contacts = lazy(() => import('./components/Contacts'));
const SecurityLog = lazy(() => import('./components/SecurityLog'));
const SyncStatus = lazy(() => import('./components/SyncStatus'));
const SecureNotes = lazy(() => import('./components/SecureNotes'));
const Analytics = lazy(() => import('./components/Analytics'));
const OfflineDataManager = lazy(() => import('./components/OfflineDataManager'));

const App: React.FC = () => {
  return (
    <Box sx={{ display: 'flex', flexDirection: 'column', minHeight: '100vh' }}>
      <Container component="main" sx={{ flexGrow: 1, py: 3 }}>
        <Suspense fallback={<LoadingScreen />}>
          <Routes>
            <Route path="/dashboard" element={<Dashboard />} />
            <Route path="/passwords" element={<Passwords />} />
            <Route path="/contacts" element={<Contacts />} />
            <Route path="/security" element={<SecurityLog />} />
            <Route path="/sync" element={<SyncStatus />} />
            <Route path="/secure-notes" element={<SecureNotes />} />
            <Route path="/offline" element={<OfflineDataManager />} />
            <Route path="/analytics" element={<Analytics />} />
            {/* Redirect to dashboard for root and undefined routes */}
            <Route path="/" element={<Dashboard />} />
            <Route path="*" element={<Dashboard />} />
          </Routes>
        </Suspense>
      </Container>
    </Box>
  );
};

export default App;