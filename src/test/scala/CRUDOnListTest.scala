package com.knoldus

class CRUDOnListTest extends org.scalatest.funsuite.AnyFunSuite
 {
  val object_Of_CRUDOnList = new CRUDOnList[String]
  test("create method should return true when a Ayush is added")
  {
   val result_Of_CreateMethod = object_Of_CRUDOnList.create(Some("Ayush"))
    assert(result_Of_CreateMethod)
  }

  test("create method should return false if no string is passed to the list")
  {
   val result_Of_CreateMethod = object_Of_CRUDOnList.create(None)
   assert(!result_Of_CreateMethod)
  }

  test("read method should display elements of the list")
  {
   val object_Of_CRUDOnList2 = new CRUDOnList[String]
    object_Of_CRUDOnList2.create(Some("Ayush"))
    object_Of_CRUDOnList2.create(Some("Rahul"))
    assert(object_Of_CRUDOnList2.read == List("Ayush", "Rahul"))
  }

  test("update method should return true when the new element has replaced the old one")
  {
   object_Of_CRUDOnList.create(Some("Rahul"))
   val result_Of_UpdateMethod = object_Of_CRUDOnList.update("Rahul","Pranjal")
   assert(result_Of_UpdateMethod)
  }

  test("update method should return false when the element does not exists")
  {
   val result_Of_UpdateMethod = object_Of_CRUDOnList.update("Parimeshtha", "Ayush")
   assert(!result_Of_UpdateMethod)
  }

  test("delete method should remove the element and return the updated list")
  {
   val object_Of_CRUDOnList2 = new CRUDOnList[String]
   object_Of_CRUDOnList2.create(Some("Ayush"))
   object_Of_CRUDOnList2.create(Some("Rahul"))
   val result_Of_DeleteMethod = object_Of_CRUDOnList2.delete("Rahul")
   assert(result_Of_DeleteMethod == List("Ayush"))
  }
}
