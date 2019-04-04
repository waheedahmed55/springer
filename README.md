# springer
# Task 4
Create a user journey test using any specific language and tools of your preference to validate the search functionality 
Push your code to a VCS of your choice (BitBucket, GitHub, etc.) with small commits and clear commit messages. Also justify your choice of tools

## Test Scenario
Validate search functionality for guest and logged in user

``` Committing the test script for validating the search functionality. ```

## Scripting language  

Java(Groovy)

## Automation tool 

![alt text](https://www.google.ca/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjIp_DlxrbhAhVqh-AKHX56BDcQjRx6BAgBEAQ&url=http%3A%2F%2Ffasteningcode.com%2Findex.php%2F2018%2F01%2F23%2Fkatalon%2F&psig=AOvVaw0j9-xTgssihShysB_H_t_N&ust=1554471241329506 "Logo") ![](https://www.google.ca/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjIp_DlxrbhAhVqh-AKHX56BDcQjRx6BAgBEAQ&url=http%3A%2F%2Ffasteningcode.com%2Findex.php%2F2018%2F01%2F23%2Fkatalon%2F&psig=AOvVaw0j9-xTgssihShysB_H_t_N&ust=1554471241329506 "Title")

Katalon Studio

## Workflow

Executed a glow through goovy language based on java to create a script that validates the below points.
Below are the points the cript validates

1.  First the script validates if the search resultis being displayed according to the input. By providing input = Geography

2.  Next, it validates search result counts.

3.  After that it validates invalid search functionality with invalid data('@@33444455@33' in our case) and verified correct error message.

4.  Validatd search functionality with data which doesn’t auto populate bu input 'javapaper'

5.  Validated the new search functionality.

6.  Validated the search result page consistency even after doing login /logout from search result page by signing up with email and passwords and then loggin in and logging out

7.  Validated that the search should be perform on hitting the enter key after providing input by creating a bot to press and release the enter key

8.  Validated auto populate functionality with minimum and maximum character with test input 'e' and 'The Desensitisation as A3 Adenosine Receptor Regulation: Physiopathological ImplicationsMaria Letizia Trincavelli, Osele Ciampi, Claudia MartiniPages 75-90'

9.  Validated the input data on search result page by testinh this with values 'sesbania javanica'