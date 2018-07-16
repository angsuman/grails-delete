description( "Delete create-taglib generated code" ) {
	usage "grails delete-taglib <<DOMAIN CLASS>>"
	argument name:'Domain Class', description:'The name of the domain class'
}

def name = args[0]
def domain = model(name)

delete("grails-app/taglib/${domain.packagePath}/${domain.className}TagLib.groovy")
delete("src/test/groovy/${domain.packagePath}/${domain.className}TagLibSpec.groovy")
