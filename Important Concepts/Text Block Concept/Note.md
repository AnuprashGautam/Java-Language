# What is text block in JAVA?

In Java, a text block is a feature introduced in Java 13 (as a preview feature) and became a standard feature in Java 15. A text block allows you to define multi-line strings in a more readable and convenient way compared to traditional string concatenation or usage of newline characters. This feature is especially useful for embedding large chunks of text like HTML, JSON, or XML directly into your Java code.

A text block is defined using triple double-quote (`"""`) delimiters. Here's a simple example:

```java
String textBlock = """
        This is a text block.
        It can span multiple lines.
        It preserves line breaks and indentation.
        """;
```

### Key Points

1. **Triple Quotes Delimiter**: Text blocks start and end with triple double-quote characters (`"""`).
2. **Multi-line Strings**: You can write strings that span multiple lines without needing to concatenate strings or use newline characters (`\n`).
3. **Whitespace and Formatting**: The leading whitespace on each line is automatically stripped to the level of the least-indented line in the text block.
4. **Embedded Quotes**: You can include regular double-quote characters inside a text block without escaping them, but triple quotes inside a text block must be escaped.

### Example Usage

#### Simple Multi-line Text Block
```java
String html = """
    <html>
        <body>
            <p>Hello, World!</p>
        </body>
    </html>
    """;
System.out.println(html);
```

#### Including Quotes and Special Characters
```java
String query = """
    SELECT *
    FROM users
    WHERE name = "Anuprash"
    AND status = 'active';
    """;
System.out.println(query);
```

### Advantages

- **Improved Readability**: Makes it easier to read and maintain multi-line strings.
- **Reduced Boilerplate**: Eliminates the need for concatenation and explicit newline characters.
- **Code Clarity**: Helps in embedding large pieces of text like SQL queries, JSON, or XML directly in the code, making the code more readable and maintainable.

### Example with JSON

```java
String json = """
    {
        "name": "Anuprash Gautam",
        "degree": "Bachelor's in Technology",
        "field": "CSE (AI)",
        "country": "India"
    }
    """;
System.out.println(json);
```

By using text blocks, you can maintain cleaner and more readable code, especially when dealing with large text literals.