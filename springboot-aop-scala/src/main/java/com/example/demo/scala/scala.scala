package com.example.demo.scala

object scala {
  def main(args : Array[String]){
    println("123");
    
    var mongry = 100;
    println(mongry);
    mongry = 200;
    println(mongry);
    
    val mon = 100;
    println(mon);
    
    //mon = 200;
    println("===============");
    val f:Int = 10;
    println(f.getClass());
    
    var abc = f.asInstanceOf[Double];
    println(abc.getClass());
    println(abc);
    
    println("===============");
    println(abc.isInstanceOf[Double]);
    println("=================");
    
    lazy val bc:Int = 100;
    println(bc);
    
    
    
    
  }
}