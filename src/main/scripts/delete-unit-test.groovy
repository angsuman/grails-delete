description( "Delete create-unit-test generated code" ) {
	usage "grails delete-unit-test <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-unit-test
delete("src/test/groovy/${domain.packagePath}/${domain.className}Spec.groovy")