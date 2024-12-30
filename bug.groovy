```groovy
def myMethod(param) {
  if (param == null) {
    return 0 //This will cause a NullPointerException later
  }
  //some code that uses param.someProperty
  return param.someProperty * 2
}

println myMethod(null)
```