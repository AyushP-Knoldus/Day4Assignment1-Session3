package com.knoldus

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val crudonlist= new CRUDOnList[String]
    crudonlist.create(Some("Ayush"))
    println(crudonlist.create(Some("Rahul")))
    println(crudonlist.read)
//    crudonlist.update(5,7)
//    crudonlist.delete(3)
//    print(crudonlist.read)
  }
}