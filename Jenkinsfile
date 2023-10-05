pipeline {

    agent any

     stages {
        stage('Build') {
            steps {
                checkout([
                    $class: 'GitSCM', 
                    branches: [[name: '*/main']], 
                    userRemoteConfigs: [[url: 'https://github.com/lcastanoj/retoDevCo.git']]
                ])
            }
        }
       stage('Plan') {
            steps {
                echo 'En esta fase se recopilan los requisitos del producto de los clientes y las partes interesadas. El equipo de desarrollo planifica la hoja de ruta, las tecnologías y las características del proyecto. Se utilizan herramientas como Jira para la gestión del proyecto y el seguimiento del progreso...'
            }
        }
        stage('Codificación') {
            steps {
                echo 'Aquí, los desarrolladores empiezan a escribir código basándose en los planes y requisitos. Siguen buenas prácticas de codificación y utilizan herramientas de automatización para acelerar la entrega. Se utiliza un sistema de control de versiones como Git...'
            }
        }
        stage('Construcción') {
            steps {
                echo 'Una vez que los bloques de código individuales están listos, se integran en la base de código principal. Cualquier problema se soluciona antes de la integración. Para la automatización se utilizan herramientas como Jenkins...'
            }
        }
        stage('Pruebas') {
            steps {
            echo 'Se realizan pruebas manuales y automatizadas para identificar errores y problemas. Esto asegura la calidad del software antes de su publicación. Se utilizan herramientas como Selenium y JUnit.'
                bat 'gradle test'
            }
        }
        stage('Lanzamiento') {
            steps {
                echo 'El software se pone en producción si supera todas las pruebas. Se pueden utilizar banderas de características para desplegar gradualmente nuevas características.....'
            }
        }
        stage('Despliegue') {
	        steps {
	        echo 'La versión se despliega en el entorno de producción. Para la gestión de la configuración se utilizan herramientas como Ansible, Puppet y Chef.'
	        }
        }
        stage('Funcionamiento') {
	        steps {
	        echo 'El software ya está operativo y accesible para los usuarios. Se recogen los comentarios de los clientes para identificar áreas de mejora.'
	        }
        }
        stage('Monitorización') {
	        steps {
	        echo 'Todo el proceso de DevOps y el software se supervisan mediante herramientas como Nagios, Splunk y New Relic. Se informa de cualquier problema para solucionarlo en la siguiente iteración.'
	        }
        }
    }
}
