package com.knoldus
//The following class performs create , read , update and delete operation on sequence.
class CRUDOnSequence[T] extends CRUDOperations[T]
{
  //Empty sequence of var type used to make changes to the sequence in methods.
  private var sequence: Seq[T] = Seq()
  //Create a list which takes an element and add to the sequence.
  override def create(elementToInsert: Option[T]): Boolean = {
    elementToInsert match {
      case Some(value) =>
        sequence= sequence :+ value
        true
      case None => false
    }
  }
  //read method which returns sequence.
  override def read: Seq[T] = sequence
  //update method replaces the new element with the previous element.
  override def update(elementTobeUpdated: T, newElement: T): Boolean = {
    if (sequence.contains(elementTobeUpdated)) {
      val indexOfElementTobeUpdated = sequence.indexOf(elementTobeUpdated)
      sequence = sequence.updated(indexOfElementTobeUpdated, newElement)
      true
    }
    else
      false
  }
  //delete method deletes the desired element from the sequence.
  override def delete(elementToDelete: T): Seq[T] = {
    sequence=sequence.filter(_ != elementToDelete)
    sequence
  }
}