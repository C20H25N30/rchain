package coop.rchain.catscontrib

/**
  * Name ski comes from SKI combinator calculus (https://en.wikipedia.org/wiki/SKI_combinator_calculus)
  * It represents three functions, from which we are using two: constant function (kp) and identity function (id)
  *
  * Const and identity function are being used frequantly in this code base (in any FP code base to be precise).
  * Thus we provide an alias for const and indentity.
  * Inspiried by ski package in slamdata/quasar codebase: κ and ι funcitons.
  */
package object ski {

  /**
    * Returns a function that takes number of arguments and always returns the last argument as a result
    */
  def kp[A, B](x: => B): A => B                               = _ => x
  def kp2[A, B, C](x: => C): (A, B) => C                      = (_, _) => x
  def kp3[A, B, C, D](x: => D): (A, B, C) => D                = (_, _, _) => x
  def kp6[A, B, C, D, E, F, G](x: G): (A, B, C, D, E, F) => G = (_, _, _, _, _, _) => x

  /**
    * Returns a functiont that always returns its argument
    */
  def id[A]: A => A = x => x
}
