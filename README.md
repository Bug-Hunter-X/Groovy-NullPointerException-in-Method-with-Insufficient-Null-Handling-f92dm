# Groovy NullPointerException Bug

This repository demonstrates a common Groovy bug: a NullPointerException arising from inadequate null handling within a method.  The `myMethod` function fails to correctly manage null input, resulting in a runtime error.  The solution provides improved error handling to address this issue. 

## Bug Description:
The `bug.groovy` file contains a Groovy method that doesn't explicitly handle null input. If a null value is passed as a parameter, the method attempts to access a property of the null object, triggering a NullPointerException.

## Solution:
The `bugSolution.groovy` file presents a corrected version of the method. The solution adds a null check before using the parameter, preventing the NullPointerException.