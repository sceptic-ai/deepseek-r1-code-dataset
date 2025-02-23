# This code scrapes the title of a webpage using the requests and BeautifulSoup libraries.
# It demonstrates how to fetch and parse HTML content from a website.

import requests
from bs4 import BeautifulSoup

def scrape_website_title(url):
    """
    Scrape the title of a webpage.

    Parameters:
    url (str): The URL of the webpage to scrape.

    Returns:
    str: The title of the webpage.
    """
    try:
        # Send a GET request to the URL
        response = requests.get(url)
        response.raise_for_status()  # Raise an exception for HTTP errors

        # Parse the HTML content using BeautifulSoup
        soup = BeautifulSoup(response.text, 'html.parser')

        # Extract and return the title
        return soup.title.string
    except requests.exceptions.RequestException as e:
        return f"An error occurred: {e}"

# Example usage
url = "https://www.example.com"
title = scrape_website_title(url)
print(f"The title of the webpage is: {title}")
