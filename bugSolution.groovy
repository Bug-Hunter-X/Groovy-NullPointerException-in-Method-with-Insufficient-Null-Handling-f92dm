```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Handle null input gracefully
  } else {
    return param.someProperty * 2
  }
}

println myMethod(null)
println myMethod([someProperty:5])
```