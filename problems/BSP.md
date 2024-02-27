## Problem Statement

A gaming company is developing a new game where players navigate through a maze-like structure represented by a binary tree. Each node in the tree represents a checkpoint or a decision point within the game. The game includes a feature where players can view the nodes they have passed through, based on their current position within the maze.

You are tasked with implementing a solution that efficiently traverses the binary tree from the root node to the player's current position, printing out the values of the nodes in the order they are encountered. Additionally, the game's mechanics require that nodes with values less than or equal to the player's current position are printed before the nodes with values greater than the player's current position.

### Solution Overview

- Define a `Node` class to represent each node in the binary tree. Each node has a `value`, `left`, and `right` attribute.
- Implement an `insert` function to insert values into the binary tree based on their comparison with the existing nodes.
- Develop a `traverse` function that recursively traverses the binary tree from the root node to the player's current position. The traversal algorithm ensures that nodes with values less than or equal to the player's position are printed before nodes with values greater than the player's position.
- Test the solution by creating a sample binary tree and traversing it based on a predefined player position.
