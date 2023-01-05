# Java RMIの実行
http://ash.jp/java/rmi.htm
http://ash.jp/java/rmi_codebase.htm

## 手順
### 1. コード群をコンパイル
```bash
javac *.java
```

### 2. リモートオブジェクトをコンパイル
```bash
 rmic helloObj
```

### 3. RMI Registryサーバの起動
```bash
rmiregistry 1099 &

# 1099でListenしてることを確認
lsof -i:1099

# 再始動時はこのプロセスを一旦キルする
kill [↑で出てくるプロセスID]
```

### 4. セキュリテイポリシーの作成（絶対必要）
```bash
touch java.policy
```

以下を記載：
```java
grant {
  permission java.security.AllPermission;
};
```

### 5. サーバを起動
```bash
java -Djava.security.policy=java.policy helloServer
```

### 6. クライアントを起動
```bash
java -Djava.security.policy=java.policy helloClient
```