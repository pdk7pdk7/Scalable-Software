

object Listsplit {
  // this is the main function where the list is defined
  def main(args: Array[String]): Unit = {
    var list1 = List[Int]()
    var list2 = List[Int]()
    val list = List(2,11)
    split(list)
    println(list1,list2)
    // here the split function is being defined
    def split(l: List[Int]): (List[Int], List[Int])= {
      
      if(list.length==1){
        list1 = list(0)::list1
        list2 = Nil
        (list1,list2)
      }
      if(list.length==2){
        list1 = list(0)::list1
        list2 = list(1)::list2
        (list1,list2)
      }
      if(list.length > 2)
        list1 = list(0)::list1
        list2 = list.last::list2
        list.drop(1)
        list.drop(list.length)
        split(list)
      
    }
  }
}