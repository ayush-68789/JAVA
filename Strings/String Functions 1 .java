Method                                                 Description                                            Example
==================================================================================================================================================
length()                                Returns the length of the string.                            "hello".length() -> 5

charAt(int index)                    Returns the character at the specified index.                  "Java".charAt(1) -> 'a'

concat(String str)          Concatenates the specified string to the end of the current string.      "Hello ".concat("World") -> "Hello World"

substring(int beginIndex)        Returns a new string that is a substring of this string.            "example".substring(3) -> "mple"

substring(int begin, int end)    Returns a substring starting at begin (inclusive) and ending at end (exclusive).      "example".substring(1, 4) -> "xam"

indexOf(String str)            Returns the index of the first occurrence of the specified substring.            "apple".indexOf("pl") -> 2

toLowerCase()                            Converts all characters to lowercase.                            "Hello".toLowerCase() -> "hello"

toUpperCase()                            Converts all characters to uppercase                              "Hello".toUpperCase() -> "HELLO"

trim()                    Returns a copy of the string, with leading and trailing whitespace removed.            "   test   ".trim() -> "test"

split(String regex)            Splits the string around matches of the given regular expression.            "a,b,c".split(",") -> ["a", "b", "c"]
