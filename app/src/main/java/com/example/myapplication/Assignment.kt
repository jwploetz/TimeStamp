package com.example.myapplication

class Assignment(Deadline:Long, AssingmentName: String) {
    var AssignmentDate = Deadline;
    var Name = AssingmentName;
    fun ChangeAssignmentDate(x: Long){
            AssignmentDate = x;

    }
    fun ChangeAssignmentName(x: String){
            Name = x
    }
}