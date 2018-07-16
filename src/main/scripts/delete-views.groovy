description( "Delete generate-views generated code" ) {
	usage "grails delete-views <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)
def lowerCaseDomain = domain.className.toLowerCase()

// Delete generate-views
delete("grails-app/views/${lowerCaseDomain}/create.gsp")
delete("grails-app/views/${lowerCaseDomain}/edit.gsp")
delete("grails-app/views/${lowerCaseDomain}/index.gsp")
delete("grails-app/views/${lowerCaseDomain}/show.gsp")
delete("grails-app/views/${lowerCaseDomain}")