description( "Delete create-service generated code" ) {
	usage "grails delete-service <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-service
delete("grails-app/services/${domain.packagePath}/${domain.className}Service.groovy")
delete("src/test/groovy/${domain.packagePath}/${domain.className}ServiceSpec.groovy")