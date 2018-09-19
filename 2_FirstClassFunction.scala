object FirstClassFunction {
  def main(args: Array[String]) {
    // 関数addの戻り値は関数_add
    val add = (x: Int) => {
      val _add = (y: Int) => y + 5
      _add(x)
    }

    println(add(1))
    println(add(2))
    println(add(1))
  }
}

// メソッドはオブジェクトに紐づくもので、オブジェクトの操作を行う。
// オブジェクトの状態(フィールド)によって、戻り値が変わる。
// defキーワードはメソッドになる
// def add(x: Int, y: Int) = x + y

// 関数は引数に依存する。
// 引数が同じであれば同じ戻り値を返す
// var, val は関数リテラル。関数になる
// var add = (x: Int, y: Int) => x + y