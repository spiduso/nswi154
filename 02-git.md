# Homework

1. Configure your identity (name, email) on the target machine, if you have not already.

```bash
git config --global user.name "Hoang Anh Tuan"
git config --global user.email "hoang.dusan@gmail.com"
cat $HOME/.gitconfig
```

2. Create your own private Git repository in a local project directory (working copy).

```bash
mkdir/cd
git init
```

3. Next create a new file that contains a simple program computing factorials for numbers 1 to 10.
   You are free to use any other program with similar difficulty and length, in case you do not like to compute factorials, but then please adapt other tasks of the assignment (see below).
   The program should print each computed factorial on a separate line.
   Use your favorite programming language (C, Java, C#, Python, ...).
   Make the file tracked by Git. Save current version into the repository.

```bash
touch main.py
git add main.py
git commit -m "fact for 1-10"
```

4. Split the program into two parts: (1) a library that contains the function for computing factorials and (2) a client that invokes the procedure.
   Use an approach typical for your favorite programming language.
   However, you have to create new file(s) to contain the new parts.

```bash
touch client.py
touch fact.py
```

5. Ensure that new file(s), created in step 4, are tracked by Git and commit everything into the repository.

```bash
git add client.py fact.py
git commit -m "split into client/library"
```

6. Remove the original file created in step 3 (make sure it is not tracked by Git anymore). Commit everything.

```bash
git rm main.py
git commit -m "removed main"
```

7. Create new branch with the name "oneline" and switch to it.

```bash
git branch oneline
git checkout oneline
```

8. In your branch, modify the program to print all computed factorials on a single line.
   Commit everything properly.

```bash
git add client.py
git commit -m "print on one line"
```

9. Go back to the original branch (master).

```bash
git checkout master
```

10. Make the following two changes to the factorial program in the given order, but commit only the second modification.
   (i) Program should compute factorials for the numbers 1 to 15.
   (ii) Add new procedure that computes and prints squares of numbers 1 to 10.

```bash
# (i) added to client.py
git add fact.py
git commit -m "added square_to_ten method"
```

11. Print the current status of the working copy and all uncommitted modifications.

```bash
git status
```

12. Revert uncommitted modifications in the working copy.

```bash
git checkout -- client.py
```

13. Merge the branch "oneline" into the last version on the master branch.

```bash
git merge oneline
```

14. Print short information about each commit.

```bash
git log --pretty=short
```

15. Somehow move the local repository and working directory back to the state they were after task 9 (undo all changes done later).

```bash
# copy <commit number>
git reset <commit number>
```

16. Clone existing repository into a completely separate directory (new working copy).
	URL: https://gitlab.mff.cuni.cz/teaching/nswi154/cviceni2024.git
	Note that your Git client may use GUI to ask for the password, so it may not work when you do it in console remotely over ssh.
	You probably have to log in at least once through the web interface (https://gitlab.mff.cuni.cz) to ensure that your Git account is created.
	Let me know if you have any problems with accessing the repository (it works for me, but I cannot use it from a student account, obviously).

```bash
mkdir
cd
git clone https://gitlab.mff.cuni.cz/teaching/nswi154/cviceni2024.git
cd cviceni2024
```

17. Modify content of the file main.c somehow.
    For example, add the code printing your name.

18. Print all modifications done in the working copy.

```bash
git diff main.c
```

19. Update your working copy to match the current state of the remote public repository (at the server "gitlab.mff.cuni.cz").
    Someone might have changed the remote repository in the meantime.

```bash
git fetch origin
```

20. Publish your modifications in the remote repository (at the server "gitlab.mff.cuni.cz").

```bash
git add main.c
git commit -m "my name is better than yours"
git push origin master
```

21. Create new branch in your local repository (cloned from the server "gitlab.mff.cuni.cz") that starts in the version that was HEAD at the point of time when you cloned the original remote repository (gitlab.mff).
    Give unique name to your branch (to avoid conflicts with other students).
    Make some changes in the branch (e.g., add new files with some content) and commit them.

```bash
git log
# copy <commit number> with HEAD
git checkout -b HAT <commit number>
git add .\main.c
git commit -m "added double spaces between words"
git push origin HAT
```

22. Merge the current HEAD of the master branch into your branch created in the previous task (everything just in the local repository).

```bash
git log
# copy <commit number> with HEAD
git merge <commit number>
```

23. Publish your branch to the remote repository.

```bash
git push origin HAT
```

24. Remove the whole directory "cviceni2024" that contains your local repository.
    Clone the existing repository again (like in the task 16).

```
rm -r
git clone https://gitlab.mff.cuni.cz/teaching/nswi154/cviceni2024.git
```

25. List all the branches. Switch to your own branch that you created in the task 21.

```bash
git branch -r
git checkout origin/HAT
```

26. Alternative solution for task 13 that will use rebasing.
    If you have not used "rebase" in task 13, then do it here.

```bash
cd
git rebase oneline
```

27. Alternative solution for task 10 that does not use "git add -p" or "git add -i".
    Hint: use stashing if you have not done so already.

```bash
# stashing (i) in client.py
git stash -- client.py
git add fact.py
git commit "added square_to_ten method" 
```

28. Extension of task 21: modify the last commit message (add some text).

```bash
git commit --ammend
```

29. Clone existing repository at the URL https://github.com/d3sformal/panda.git.
    Find the numbers (IDs) of all revisions created by me (try author names "Pavel Parizek" and/or "pparizek") since 1.7.2014.

```bash
mkdir
cd
git clone https://github.com/d3sformal/panda.git
git blame src/main/gov/nasa/jpf/abstraction/Method.java --since="2014-07-01"| grep "Pavel Parizek"
```

30. Now consider the repository at https://github.com/d3sformal/yaga.git.
    Create the diff of all changes in the branch "feature/uf-plugin" since the date 1.6.2023.

```bash
mkdir
cd
git clone https://github.com/d3sformal/yaga.git
git diff feature/uf-plugin master --since=2023-06-01
```
