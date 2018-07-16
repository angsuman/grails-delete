description( "Delete create-script generated code" ) {
	usage "grails delete-script <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)
def lowerCaseDomain = domain.className.toLowerCase()

// Delete create-script
delete("src/main/scripts/${lowerCaseDomain}.groovy")