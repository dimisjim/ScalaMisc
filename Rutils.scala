package io.yields.runner

import io.yields.PathsUtils

object RUtils {

  val executablePath: String = {
    val tryFiles: Seq[String] = sys.props("os.name") match {
      case "Mac OS X" => Seq("/usr/local/bin/Rscript")
      case "Linux" => Seq("/usr/bin/Rscript", "/usr/local/bin/Rscript")
      case "Windows 10" => Seq(PathsUtils.getLatestRversionPath("C:\\Program Files\\R"))
      case _ => Seq.empty
    }

    tryFiles.find{ p => PathsUtils.isPathExecutable(p) }
      .getOrElse(throw new RuntimeException("Rscript binary executable not found."))
  }


}