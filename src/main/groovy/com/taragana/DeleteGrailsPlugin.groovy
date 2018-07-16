package com.taragana

import grails.plugins.*

class DeleteGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.3.5 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Delete All Auto-Generated files from create-* and generate-* commaonds" // Headline display name of the plugin
    def author = "Angsuman Chakraborty"
    def authorEmail = "angsuman@taragana.com"
    def description = '''\
Files are created when you run create-* and generate-* commands like create-domain-class or generate-all.
Grails does not provide an inbuilt way to delete these artifacts when you realize you have wrongly created them and delete the auto-generated artifacts.
delete-all will delete all such artifacts. No errors will be shown for missing artifacts.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/delete"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "GPL3"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Taragana Inc.", url: "http://www.taragana.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/grails-plugins" ]



    void onConfigChange(Map<String, Object> event) {
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
