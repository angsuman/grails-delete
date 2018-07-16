description( "Delete create-command generated code" ) {
	usage "grails delete-command <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

// Delete create-command
delete("grails-app/commands/${domain.packagePath}/${domain.className}Command.groovy")
