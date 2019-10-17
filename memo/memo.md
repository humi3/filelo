# file io memo
+ 参考サイト
    * https://engineer-club.jp/java-reading-files#-Files
    * https://www.tutorialspoint.com/java/java_files_io.htm

 ## 注意
  + Filesのメソッドを使う時は、読み込むファイルの容量に注意する。大きすぎると、OutOfMemoryErrorが簡単に起こる。
  + 読み込むファイルのエンコードは、読み込む前に設定する。(UTF-8を除く)