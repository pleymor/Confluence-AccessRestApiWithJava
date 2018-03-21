# Markdown wiki to Confluence

Upload a local markdown wiki to Confluence.

Works for wikis such as gitlab wiki.

## Prerequisite

For now, configure it directly by editing the attributes in the code:

```java
    private static final String BASE_URL = "https://my.confluence.com";

    // Basic authentication to Confluence
    private static final String USERNAME = "my confluence user name";
    private static final String PASSWORD = "my confluence pwd";
    
    // The key of the confluence space (you can see it in the URL)
    private static final String SPACE_KEY = "My space KEY";
    
    // This is the Page ID that can be found if you go to the "Page Information" section within Confluence
    private static final int PARENT_ID = 12345;

    // local wiki path
    private static final Path WIKI_ROOT = Paths.get("C:\\my\\local\\giltab-project.wiki");
```


You may need to add the ssl certificate to the keystore of your java, in case of self-signed certificates.

## How to run

Either compile the project after having configured it, or run directly in your IDE.

## Limitations

Source code won't be syntax highlighted.