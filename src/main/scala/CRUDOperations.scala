package com.knoldus
//Abstract class of generic type which contains defination of method create, read, update and write.
//These methods are implemented in two classes ie-CRUDOnList and CRUDOnSequence.
abstract class CRUDOperations[T]
{
  //Will return true if value is inserted in the list.
  def create(element: Option[T]): Boolean

  //Here we have used Seq[T] as return type as it is a parent trait of List.
  def read : Seq[T]
  //Will return true if element is updated.
  def update(elementTobeUpdated : T , newElement : T): Boolean
  //Return true once an element is deleted.
  def delete(element : T): Seq[T]
}