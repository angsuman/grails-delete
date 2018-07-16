description( "Delete create-domain-class generated code" ) {
	usage "grails delete-domain-class <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-domain-class
delete("grails-app/domain/${domain.packagePath}/${domain.className}.groovy")
delete("src/test/groovy/${domain.packagePath}/${domain.className}Spec.groovy")