MiM Solver
========

Mouse in a Maze (Unblock me) solver, using different algorithmic strategies (BF,DF,ID,GR,AS) 
.Breadth First Search
.Depth First Search
.Iterative Depth First Search
.Greedy Search 
.Astar Search 

Usage:

First configure the board in the 

| Key       	| Value        |
| ------------- |:-------------|
| 1,2   | Mouse|
| 6,7 | 2 grid Horizontal tile     |
| 6,8,7  | 3 gird Horizontal tile     |
| 3,4  | 2 grid Vertical tile     |
| 3,5,4  | 3 gird Vertical tile     |


Run `MainClass` to your local Ti project `widgets/` folder.

Be sure to update your project's `config.json` file, add `"ytPlayer": "1.0"` to `"dependencies"`.

In your controller: 

    // call method .play(), pass YouTube ID of video to play
    Alloy.createWidget('ytPlayer').play('BXb5zeaaZss');

See [sample app](https://github.com/bob-sims/ytPlayer/tree/master/app).

That's it!
 
[@2wheelsburing](http://www.twitter.com/2wheelsburing)