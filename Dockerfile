PS E:\My Downloads\zestindia\product-api> FROM eclipse-temurin:17-jdk-alpine
At line:1 char:1
+ FROM eclipse-temurin:17-jdk-alpine
+ ~~~~
The 'from' keyword is not supported in this version of the language.
    + CategoryInfo          : ParserError: (:) [], ParentContainsErrorRecordException
    + FullyQualifiedErrorId : ReservedKeywordNotAllowed

PS E:\My Downloads\zestindia\product-api>
PS E:\My Downloads\zestindia\product-api> WORKDIR /app
WORKDIR : The term 'WORKDIR' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name, or if a path was included,
verify that the path is correct and try again.
At line:1 char:1
+ WORKDIR /app
+ ~~~~~~~
    + CategoryInfo          : ObjectNotFound: (WORKDIR:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS E:\My Downloads\zestindia\product-api>
PS E:\My Downloads\zestindia\product-api> COPY target/product-api-0.0.1-SNAPSHOT.jar app.jar
PS E:\My Downloads\zestindia\product-api>
PS E:\My Downloads\zestindia\product-api> EXPOSE 8080
EXPOSE : The term 'EXPOSE' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name, or if a path was included,
verify that the path is correct and try again.
At line:1 char:1
+ EXPOSE 8080
+ ~~~~~~
    + CategoryInfo          : ObjectNotFound: (EXPOSE:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS E:\My Downloads\zestindia\product-api>
PS E:\My Downloads\zestindia\product-api> ENTRYPOINT ["java", "-jar", "app.jar"]