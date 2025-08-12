## BASIC INSTRUCTIONS
For this assessment, you will modify a Spring application with a Java back end and an Angular front end to include multithreaded language translation, a message at different time zones, and currency exchange. Then, build a Docker image of the current multithreaded Spring application and containerize it using the supporting documents provided in this task.

## SCENARIO 
You are working for a company located in Toronto, Canada, that schedules hotel reservations. As a software developer, your job is to modify the Landon Hotel scheduling application to meet new requirements under new management. You will choose any application user you would like.
You have been provided a Spring application with a Java back end, an Angular front end, and web links and a supporting document to assist you in your work.

A.  Create your subgroup and project in GitLab using the provided web link and the "GitLab How-To" web link by doing the following:
  •   Clone the project to the IDE.
  •   Commit with a message and push when you complete each requirement listed in parts B1, B2, B3, and C1.
  Note: You may commit and push whenever you want to back up your changes, even if a requirement is not yet complete.
  •   Submit a copy of the GitLab repository URL in the "Comments to Evaluator" section when you submit this assessment.
  •   Submit a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.
  Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.

B.  Modify the Landon Hotel scheduling application for localization and internationalization by doing the following:
  1.   Install the Landon Hotel scheduling application in your integrated development environment (IDE). Modify the Java classes of application to display a welcome message by doing the following:
    a.  Build resource bundles for both English and French (languages required by Canadian law). Include a welcome message in the language resource bundles.
    b.  Display the welcome message in both English and French by applying the resource bundles using a different thread for each language.
    Note: You may use Google Translate for the wording of your welcome message.
  
  2.  Modify the front end to display the price for a reservation in currency rates for U.S. dollars ($), Canadian dollars (C$), and euros (€) on different lines.
    Note: It is not necessary to convert the values of the prices.
  
  3.  Display the time for an online live presentation held at the Landon Hotel by doing the following:
    a.  Write a Java method to convert times between eastern time (ET), mountain time (MT), and coordinated universal time (UTC) zones.
    b.  Use the time zone conversion method from part B3a to display a message stating the time in all three times zones in hours and minutes for an online, live presentation held at the Landon Hotel. The times should be displayed as ET, MT, and UTC.

C.  Explain how you would deploy the Spring application with a Java back end and an Angular front end to cloud services and create a Dockerfile using the attached supporting document "How to Create a Docker Account" by doing the following:
  1.  Build the Dockerfile to create a single image that includes all code, including modifications made in parts B1 to B3. Commit and push the final Dockerfile to GitLab.
  2.  Test the Dockerfile by doing the following:
    •   Create a Docker image of the current multithreaded Spring application.
    •   Run the Docker image in a container and give the container a name that includes D387_[student ID].
    •   Submit a screenshot capture of the running application with evidence it is running in the container.
  
  4.  Describe how you would deploy the current multithreaded Spring application to the cloud. Include the name of the cloud service provider you would use.
    Note: Remember to commit and push your changes to GitLab.

D.  Demonstrate professional communication in the content and presentation of your submission.
