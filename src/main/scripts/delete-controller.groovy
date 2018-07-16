description( "Delete create-controller, create-scaffold-controller, generate-controller and generate-async-controller generated code" ) {
	usage "grails delete-controller <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-controller
delete("grails-app/controllers/${domain.packagePath}/${domain.className}Controller.groovy")
delete("src/test/groovy/${domain.packagePath}/${domain.className}ControllerSpec.groovy")

deleteService(name)
