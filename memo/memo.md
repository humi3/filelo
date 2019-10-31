# file io memo
+ 参考サイト
    * https://engineer-club.jp/java-reading-files#-Files
    * https://www.tutorialspoint.com/java/java_files_io.htm
    * https://qiita.com/kazukichi/items/9b9bf4c1a65872196dad

 ## 注意
  + Filesのメソッドを使う時は、読み込むファイルの容量に注意する。大きすぎると、OutOfMemoryErrorが簡単に起こる。
  + 読み込むファイルのエンコードは、読み込む前に設定する。(UTF-8を除く)

 ## Error
  + [IOException](https://docs.oracle.com/javase/jp/6/api/java/io/IOException.html)
  + [OutOfMemoryError](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/OutOfMemoryError.html)
  + [SecurityException](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/SecurityException.html)

 ## try-with-resources
 + https://qiita.com/Takmiy/items/a0f65c58b407dbc0ca99

 ## stream
 + https://builder.japan.zdnet.com/sp_oracle/35056789/2/