// This code reverses a string using JavaScript's built-in methods.

/**
 * Reverse a string.
 *
 * @param {string} str - The string to reverse.
 * @returns {string} The reversed string.
 */
function reverseString(str) {
    return str.split('').reverse().join('');
}

// Example usage
const originalString = "Hello, World!";
const reversedString = reverseString(originalString);
console.log(`Reversed string: ${reversedString}`);
