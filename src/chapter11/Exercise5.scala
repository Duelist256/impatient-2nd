package chapter11

// Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
//
//    <table>
//     <tr>
//       <td>Java</td>
//       <td>Scala</td>
//     </tr>
//     <tr>
//       <td>Gosling</td>
//       <td>Odersky</td>
//     </tr>
//     <tr>
//       <td>JVM</td>
//       <td>JVM, .NET</td>
//     </tr>
//    </table>
//

object Exercise5 extends App {
  class Table() {
    val stringBuffer = new StringBuffer("<table></table>")


    override def toString: String = stringBuffer.toString
  }
}
