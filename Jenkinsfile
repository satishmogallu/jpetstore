pipeline{
	stages{
		stage('Build'){
			steps {
				echo "Building..."
				docker.image('maven:3.3.3-jdk-8').inside {
 					 git 'https://github.com/Wamiqy2k/jpetstore.git'
  					 sh 'mvn -B clean install'
				}
			}
		}
	}
}
