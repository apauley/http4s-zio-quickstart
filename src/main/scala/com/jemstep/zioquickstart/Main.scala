package com.jemstep.zioquickstart

import cats.implicits._
import scalaz.zio.console.putStrLn
import scalaz.zio.{App, Task, ZIO}
import scalaz.zio.interop.catz._
import scalaz.zio.interop.catz.implicits._

object Main extends App {
  def run(args: List[String]): ZIO[Environment, Nothing, Int] = ZIO.runtime[Environment].flatMap { implicit rts =>
    ZioQuickstartServer.stream[Task].compile.drain.as(0)
  }.catchAll(e => putStrLn(s"ZioQuickstartServer failed with '$e'") *> ZIO.succeed(1))
}