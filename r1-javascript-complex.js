// This code creates a simple REST API using Express.js.

const express = require('express');
const app = express();
const port = 3000;

// Middleware to parse JSON requests
app.use(express.json());

// In-memory data store
let items = [];

/**
 * GET /items - Retrieve all items.
 */
app.get('/items', (req, res) => {
    res.json(items);
});

/**
 * POST /items - Add a new item.
 */
app.post('/items', (req, res) => {
    const newItem = req.body;
    items.push(newItem);
    res.status(201).json(newItem);
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
