import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Navbar from 'react-bootstrap/Navbar';

function App() {
  return (
      <div className="App">
        <Navbar bg="dark" variant="dark">
          <Navbar.Brand href="#home">AR Salon & Day Spa</Navbar.Brand>
        </Navbar>
        <div className="padding-container">
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
        </div>
      </div>
  );
}

export default App;
