package com.jemstep.zioquickstart

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    ZioQuickstartServer.stream[IO].compile.drain.as(ExitCode.Success)
}