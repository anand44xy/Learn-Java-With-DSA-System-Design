 1. How to check if git is available in your system?
    
    Ans--> To check git is availalbe in your system open Command Prompt and type command "git --version".


    2. How to intiliaze a new git repoistory?

    Ans->  Step by step guide to intiliaze a new repoistory - 

                      1. Create a repoistory on GitHub. 
                      2. Open git bash 
                      3. Change the current working Directory to your local project.
                      4. use git init command to intiliaze your local directory as Git Repoistory.
                      5. Now add files to local repoistory
                      6. Commit files that you have Staged in your local repoistory.
                      7. now change the branch to main branch
                      8 . At last push the files to the main branch .

      3. How to tell git about your name and e-mail?

      Ans--> you can tell git about your name a mail by using git config command.

    for example - 
                git config --global user.name "Devendra Swami"
                git config --global user.email "your email"



    4. How to add the file to the Staging Area?

    Ans --> To add files to the staging area you can use command "git add filename". And to add all
            files together use command - "git add ."


    5. How to remove files form staging area ?

    Ans--> To remove files from staging area use command - git rm --catched filename


    6. How to make commit?

    Ans--> To make a commit you can use command - "git commit -m "your Massage here" ".

    7.How to send your changes to remote repoistory?

    Ans--> To send the changes to remote repoistory we can use command - "git push -u origin main".

    8. What is the difference between clone and pull?

    Ans--> git pull- It is used to fetch the latest changes made in the remote repoistory to the working
                        directory

           git clone- It is used to clone the repoistory to the working directory of the developer.
            Syntax - "git clone <url>".
