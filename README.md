# Elevator
This project is a simulation of the operation of an elevator. 


the building class contains an array of Floor objects and an elevator
when a person object is created it is entered to the building through enterElevator
method and its then queued to the array of jobs, which is an array of Job objects

once the startElevater method is called all jobs will be processed in first come first
first serve order. The elevator is given a limite so three jobs will be processed
at a time. Every time the limit is reached the elevator will go down to the lobby and
take the next three and the operation continued until no job is left in the jobs Array.
