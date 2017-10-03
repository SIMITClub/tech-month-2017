# Learn JavaScript 

## Topics
- Console
- Comments
- Data Types
- Variables
- Data Structures
- Functions
- Callbacks
- Loops
- Integrating it with HTML & CSS


### Console
All the latest browsers are eqipped with console such that you can execute JavaScript on the browser itself. Lets try to run some javascript on Chrome console.

In order to open Console in Chrome
- From the menu, click on `View` and followed by `Developer` and select `Javascript Console`
OR
- Right click on the browser, click on `inspect` and then on the tab select `console`

It should look like this:
<image>

Understanding more about the Chrome Dev Tools or Web Inspector, read here. https://developer.chrome.com/devtools

#### Playground
Next to `>` type `alert("Hello World")` and press `enter` Now you have finally written a javascript code to alert user :trollface:

<Output image>

Try different text with alerts such as:
- `alert("I have finally wrote JavaScript code")`
- `alert("I can code")`
- `alert('I'd love to learn JavaScript!')`

Last alert will throw an error instead of alert, becuase using of `'` or `"` represents String in JavaScript, and once you open put one apostrophe, you need to put another to close it. Lets fix the error by using the below statement.

`alert("I'd love to learn JavaScript!")`


### Comments
A comment is a programmer-readable explanation or annotation in the source code of a computer program. They are added with the purpose of making the source code easier for humans to understand, and are generally ignored by compilers and interpreters

Comments can be added in different forms, it depends on the usage.

1) Single line Comment. It is represented by two backslash such as `//`

Now, lets try to add a comment in the same way, we did alert earlier and see what happens.

Add `//alert("hello world");` to the console and hit `enter` and you will notice, this time the alert is not shown. This is because comments in most of the programming langauges are ignored by complier.

2) Multi line Comment. It is represented by `/* ... **/

Add `/* alert("hello world"); **/ to the console and hit `enter` and you will notice the same behaviour. Multi line comment are used to write multiple line of comments. For example:
```js
/*
* This function will alert user and notify by saying "Hello"
**/
alert("hello world");
```

### Data Types
Data types are types of data that helps to manupulate user defined data. We will look at two types of data "string" and "number"

- Lets put `2 + 2` in the console and see whats the result.
The output will be 4. And thus this is a number format. Because it was adding two numbers( 2 and 2)

- Lets put `"2" + 2` in the console and see whats the result.
The output will be 22. And this is a string format. Because the first 2 is enclosed by apostrophe and javascript considers it as a mix of string and a number and the result is string.

Try different operations, such as:
`2 + 2`
`3 + "2"`

#### Typeof
typeof is used to learn what type of value does `"2"` and `2` are.

- Lets put `typeof 2` in the console and you will notice, the output is number.

- Lets put `typeof "2"` in the console and you will notice, the output is string.

Try different values and see the magic:




## Source
- Wikipedia
- W3School
