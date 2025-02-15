import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
//import App from './App.jsx'
import { SignUp } from './pages/SignUp/Index.jsx'
import "./styles.scss"

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <SignUp/>
  </StrictMode>,
)
