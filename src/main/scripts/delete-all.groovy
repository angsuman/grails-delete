description( "Delete all generated code" ) {
	usage "grails delete-all <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]

deleteCommand(name)
deleteController(name)
deleteDomainClass(name) // Also covers create-unit-test
deleteIntegrationTest(name) // Also covers create-functional-test
deleteInterceptor(name)
deleteScript(name)
deleteService(name)
deleteTaglib(name)
deleteViews(name)