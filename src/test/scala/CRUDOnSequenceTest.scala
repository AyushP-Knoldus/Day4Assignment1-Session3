package com.knoldus

class CRUDOnSequenceTest extends org.scalatest.funsuite.AnyFunSuite
 {
   val object_Of_CRUDOnSequence = new CRUDOnList[Int]
   test("create method should return true when a 1 is added")
   {
     val result_Of_CreateMethod = object_Of_CRUDOnSequence.create(Some(1))
     assert(result_Of_CreateMethod)
   }

   test("create method should return false if no integer is passed to sequence")
   {
     val result_Of_CreateMethod = object_Of_CRUDOnSequence.create(None)
     assert(!result_Of_CreateMethod)
   }

   test("read method should display elements of the sequence")
   {
     val object_Of_CRUDOnSequence2 = new CRUDOnSequence[Int]
     object_Of_CRUDOnSequence2.create(Some(1))
     object_Of_CRUDOnSequence2.create(Some(2))
     assert(object_Of_CRUDOnSequence2.read == List(1, 2))
   }

   test("update method should return true when 2 is replaced by 3") {
     object_Of_CRUDOnSequence.create(Some(2))
     val result_Of_UpdateMethod = object_Of_CRUDOnSequence.update(2, 3)
     assert(result_Of_UpdateMethod)
   }

   test("update method should return false as 10 does not exists in sequence") {
     val result_Of_UpdateMethod = object_Of_CRUDOnSequence.update(10,5)
     assert(!result_Of_UpdateMethod)
   }

   test("delete method should remove the element and return the updated sequence") {
     val object_Of_CRUDOnSequence2 = new CRUDOnList[Int]
     object_Of_CRUDOnSequence2.create(Some(1))
     object_Of_CRUDOnSequence2.create(Some(2))
     val result_Of_DeleteMethod = object_Of_CRUDOnSequence2.delete(1)
     assert(result_Of_DeleteMethod == List(2))
   }

 }
