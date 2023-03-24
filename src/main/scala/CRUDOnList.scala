package com.knoldus

//The following class performs create , read , update and delete operation on list.
class CRUDOnList[T] extends CRUDOperations[T]
{
  //Empty list of var type used to make changes to the list in methods.
  private var list: List[T] = List()
  //Create a list which takes an element and add to the list.
  override def create(elementToAdd: Option[T]): Boolean = {
    elementToAdd match {
      case Some(value) =>
        list=list :+ value
        true
      case None => false
    }
  }
  //read method which returns list.
  override def read: List[T] = list
  //update method replaces the new element with the previous element.
  override def update(elementTobeUpdated : T , newElement : T): Boolean = {
    if(list.contains(elementTobeUpdated)){
      val indexOfElementTobeUpdated=list.indexOf(elementTobeUpdated)
      list=list.updated(indexOfElementTobeUpdated,newElement)
      true
    }
    else
      false
  }
  //delete method deletes the desired element from the list.
  override def delete(elementToDelete : T): List[T] = {
    list = list.filter(_ != elementToDelete)
    list
  }
}

