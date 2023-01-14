package jojo.datastructure

import scala.annotation.tailrec

object LinkedList {

  class LinkedListImpl[T] {
    private case class Node(value: T, nextValue: Node)

//    def append(value: T): Unit = {
//      this.nextValue = value
//    }
//    @Override
//    @tailrec
//    def toString(): String = {
//      println(linkedList.value)
//      if (linkedList.nextValue != null) iterateOverMyList(linkedList.nextValue)
//    }
  }

  def main(args: Array[String]): Unit = {
//    val myLinkedList = new LinkedListImpl[Int](2, new LinkedListImpl(3, new LinkedListImpl(4, null)))
  }





}
