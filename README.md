# OOP Test Exam

Create a new Java project and implement it, based on this [exercise file](exercise.md).
Create for every class/interface a new .java file (Standard in an IDE). 

# Submission via Github

- You need access to a [Github account](https://github.com/).
- `fork` this repository (Top right corner of this page).
- `Clone` your own `fork` to your PC.
    ```bash
    git clone {YOURACCOUNTNAME}/OOP_TestExam
    ```
- Checkout the `submissions` branch. 
    ```bash
    git checkout submissions
    ```
- Create a new folder inside the "submissions" folder with a unique name. e.g. Your "Matrikelnummer", name, a random string, ...
- (IntelliJ only): Right click on this folder and select: *mark directory as* -> *sources root*. Now it should be marked blue.
- (IntelliJ only): Do the same for all directories that were already marked blue, but this time select *unmark as sources root*.
- Put all your java files in this folder.
- Add all your .java files. (No .class files)
    ```bash
    git add *
    ``` 
    or 
    ```bash
    git add submissions/{folderName}/*
    ```
- Commit your changes

    ```bash
    git commit -m "Any message"
    ```
- (You can make as many commits as you want)
- Push your changes
    ```bash
    git push
    ```
- Open your github repository in the browser.
- In the `Code` tab click switch to the `submissions` branch. (Default ist `master`)
- Click the `Pull request button`
- Ensure that on the left side is: base repository: JulianSobott/OOP_TestExam base: submissions
- Ensure that on the right side is: base repository: {Your Name}/OOP_TestExam base: submissions
- Write any message and submit the pull request.

**Important: You can't do anything that will damage the original repository. 
If something is wrong with your Pull request, someone will leave a comment, and you can apply the changes.**

You can read more about this procedure [here](https://gist.github.com/Chaser324/ce0505fbed06b947d962).

## Submissions via Email

**Only do this when the github submission is too complicated for you or you absolutely don't want your Code to be public.**

- Solve the exercise
- Zip all your .java files. Not the folder where they are in, but only the files.
- Send the zip file to one of us via Email.
