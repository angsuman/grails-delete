# grails-delete
## Overview
In Grails files are created when you run create-* and generate-* commands like create-domain-class or generate-all.
Grails does not provide an in-built way to delete these artifacts when you realize you have wrongly created them and delete the auto-generated artifacts.
The following delete commands are provided corresponding to the create or generate commands:
delete-all                 delete-command             delete-controller          
delete-domain-class        delete-functional-test     delete-integration-test    
delete-interceptor         delete-script              delete-service             
delete-taglib              delete-unit-test           delete-views

delete-all will delete all such artifacts. No errors will be shown for missing artifacts.

delete commands operate silently. It does not care whether the file(s) have been modified. use with caution.

Use help to get more details. For example:
grails help delete-all
grails help delete-unit-test
grails help delete-views

##Install
Add the following to dependencies
```
dependencies {
    ...
    compile "com.taragana:grails-delete:0.2"
    ...
}
```
