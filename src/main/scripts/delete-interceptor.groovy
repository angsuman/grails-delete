description( "Delete create-interceptor generated code" ) {
	usage "grails delete-interceptor <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-interceptor
delete("grails-app/controllers/${domain.packagePath}/${domain.className}Interceptor.groovy")
delete("src/test/groovy/${domain.packagePath}/${domain.className}InterceptorSpec.groovy")
