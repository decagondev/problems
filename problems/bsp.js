// to write text to sdtout with no newline look at process.stdout.write()
// https://nodejs.org/api/process.html#process_process_stdout
const { stdout } = require('node:process');

class Node {
    
    insert(value) {
    }
}

function traverse(node, playerPosition) {
}

// Test the solution
let root = new Node(10);
root.insert(5);
root.insert(15);
root.insert(3);
root.insert(7);
root.insert(12);
root.insert(18);

let playerPosition = 7;
traverse(root, playerPosition); // => 7 5 3 10 12 15 18 
