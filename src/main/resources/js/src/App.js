import './App.css';
// import { Routes, Route } from "react-router-dom";
import Farts from "./Farts.js"
import Form from "./Form.js"

function App() {
  return (
    <div className="App">
      <h1>Welcome to my Fart Diary</h1>
      <Farts />
      <Form />
    </div>
  );
}

export default App;
