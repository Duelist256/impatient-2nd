lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
words.charAt(1)