```groovy
def myMethod(List<String> list) {
  list?.each { element ->
    println element
  }
}

myMethod(null)

//Alternative solution with explicit null check:
def myMethod2(List<String> list) {
  if (list != null) {
    list.each { element ->
      println element
    }
  }
}

myMethod2(null) 
```