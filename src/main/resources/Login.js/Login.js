import React, { useState } from 'react';
import axios from 'axios';

const Login = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState(''); // For displaying login errors

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.post('/login', { email, password });
            localStorage.setItem('token', response.data.token);
            // Redirect user to dashboard or other page
        } catch (error) {
            console.error('Login failed', error);
            setError('Login failed. Please check your credentials and try again.'); // Improved user feedback
        }
    };

    return (
        <div>
            <h2>Login</h2>
            {error && <p style={{color: 'red'}}>{error}</p>} {/* Error message */}
            <form onSubmit={handleSubmit}>
                <input
                    type="email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    placeholder="Email"
                    required
                />
                <input
                    type="password"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    placeholder="Password"
                    required
                />
                <button type="submit">Login</button>
            </form>
        </div>
    );
};

export default Login;