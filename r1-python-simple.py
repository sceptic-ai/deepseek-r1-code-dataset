# This code calculates the factorial of a given number using recursion.
# Factorial of a number n is the product of all positive integers less than or equal to n.
# Example: 5! = 5 * 4 * 3 * 2 * 1 = 120

def factorial(n):
    """
    Calculate the factorial of a number using recursion.

    Parameters:
    n (int): The number for which the factorial is to be calculated.

    Returns:
    int: The factorial of the number.
    """
    if n == 0 or n == 1:  # Base case: factorial of 0 or 1 is 1
        return 1
    else:
        return n * factorial(n - 1)  # Recursive case: n * factorial(n-1)

# Example usage
number = 5
result = factorial(number)
print(f"The factorial of {number} is: {result}")
