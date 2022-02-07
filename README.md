# LSP_Mitchell_Assignment2

Write a Java program that processes input lines until the user enters a terminating newline character. Each of the other lines is expected to be a string consisting of digits and space characters. Each digit sequence is a token detected by the scanner and can be converted into a number. The program scans the string and prints the tokens (digit sequences in the string). It also prints the sum and product of the numbers denoted by the tokens on the line. It should print each token and the sum and product on a different line. 
It does this for each input line other than the terminating line. 
Thus, the tokens produced by your scanner denote numbers. Later your program will recognize other kinds of tokens such as words and quote characters. 
You can assume that there is: 
1.	exactly one space character after each token
2.	at least one token in each input line. 
3.	line consists of only spaces and digits. The following example illustrates the nature of the expected program behavior for two input lines and a terminating line, in italics: 
4.	The program ends when the end-user types in “Goodbye”.
String? 
2 3 100 
Tokens: 
2 
3 
100 
Sum: 105 
Product: 600 

String? 
4 6 20 
Tokens: 
4 
6 
20 
Sum: 30 
Product: 480 
String? 
Goodbye
