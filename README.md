# week3project
Repository for the week3 submission on MarkUs.


# Problem Domain

The problem domain for this project is: 
Checkers
- Game rules and logic: understanding and implementing the rules of checkers.
- Game board and graphics: implementing the visual representation of the board and pieces for the user interface.
- AI: how the computer will respond to the players' moves.

# Application Description

The idea that our team would like to implement is checkers, playable by a single user. The user will play against a computer player, whose code will be developed by us. We are considering changing some of the rules of the game to make our own variant of checkers. However, the game board and the playable moves will most likely be similar to the traditional game of checkers.

# API - MongoDB

Link to the documentation: https://www.mongodb.com/docs/

# Screenshot of trying out the API
We used two tool to try out the API:
1. Postman [photo](ScreenshotOfMongoDB-1.png)
2. MongoDB's built-in tool [photo](ScreenshotOfMongoDB-2.png)

# Sample Java Code Output
The [Main.java](src/Main.java) file makes a call to an existing database to search for a player named `John`.
Since player does not exist within the database, it outputs `No matching documents found.`

# Technical Problems

1. Creating an algorithm for a computer checkers opponent
2. Finding a free api to use and generating an api key
3. Making a call to the api using MongoDB 
