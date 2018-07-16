description( "Delete create-integration-test generated code" ) {
	usage "grails delete-integration-test <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-integration-test
delete("src/integration-test/groovy/${domain.packagePath}/${domain.className}Spec.groovy")