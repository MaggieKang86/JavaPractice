## Java 程式設計基礎練習
maggie的隨意note：https://gusty-nerve-f23.notion.site/Java-9dcef7225b4a4feab346a1ddb5215654

### 資料夾說明
#### basic資料夾
Java先修基礎程式設計課程，共5堂課

#### OCP資料夾
Java OCP JP程式設計師認證課程，共26堂課

### 克隆此倉儲（Repository）
```
git clone https://github.com/MaggieKang86/JavaPractice.git
```
### 如何提交程式？

1. git pull：從遠端倉儲（Repository）分支獲取更新並與本地倉儲（Repository）分支合併
    ```
    git pull
    ```

2. git status：查看倉儲（Repository）當前的狀態，顯示有變更的檔案。
   ```
   git status
   ```

3. git add：添加檔案到暫存區。
   ```
   git add <檔案名稱>
   ```
   
   若要將**全部檔案**加入暫存區，可以使用 git add .
   ```
   git add .
   ```
   
4. git commit：提交暫存區到本地倉儲（Repository）。
   ```
   git commit -m '<填寫提交說明>'
   ```

5. git push：將本地分支的更新，推送到遠端倉儲（Repository）上 。
   ```
   git push
   ```

### .gitignore 忽略檔案
1. 在.git同層資料夾右鍵點擊Git Bash Here，輸入`touch .gitignore`，新增.gitignore文件
    ```
    $ touch .gitignore
    ```

2. 編輯.gitignore文件添加欲忽略檔案
    ```
   # 檔案名稱 .gitignore
   # 忽略project的配置信息。
   .idea/
   # 忽略模塊文件
   *.iml
   # 忽略classPath
   out/
    ```
